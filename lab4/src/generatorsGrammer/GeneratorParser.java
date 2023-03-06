package generatorsGrammer;

import generatorsGrammer.grammar.*;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class GeneratorParser extends AbstractGenerator{
    public GeneratorParser(Grammar grammar) {
        super(grammar, "Parser", "class");
    }

    @Override
    protected void genImports(BufferedWriter writer) throws IOException {
        String imports = """
                import java.io.BufferedWriter;
                import java.io.IOException;
                import java.nio.file.Files;
                import java.nio.file.Path;
                import java.util.*;
                import java.text.ParseException;
                """;
        writer.write(imports);
    }

    @Override
    protected void generateFields(BufferedWriter writer) throws IOException {
        String fields = """
                LexicalAnalyzer lexicalAnalyzer;
                """;
        writer.write(fields);
    }

    @Override
    protected void generateConstructor(BufferedWriter writer) throws IOException {
        String constr = """
                public Parser(LexicalAnalyzer lexicalAnalyzer){
                        this.lexicalAnalyzer = lexicalAnalyzer;
                }
                """;
        writer.write(constr);
    }

    @Override
    protected void generateMethods(BufferedWriter writer) throws IOException {
        grammar.constructFirst();
        grammar.constructFollow();
        for (NonTerminal nonTerminalLeft : grammar.getNonTerminals()) {
            Set<String> cases = new HashSet<>();
            for (ArrayList<Product> rule : grammar.getRules().get(nonTerminalLeft.name())) {
                Set<String> first = grammar.getFirstFromRule(rule);
                cases.add(generateCase(first, rule, nonTerminalLeft.name()));
            }
            String header = String.format("""
                        public %sClass %s (%s) throws ParseException{
                            TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
                            %sClass res = new %sClass("%s");
                            switch(curTypeToken){
                        %s
                                default -> throw new ParseException("Meet Unexpected token: "
                                        + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
                            }
                            return res;
                        }
                        """, nonTerminalLeft.name(), nonTerminalLeft.name(), nonTerminalLeft.inherited(),
                            nonTerminalLeft.name(), nonTerminalLeft.name(),
                            nonTerminalLeft.name(), String.join("", cases));
            writer.write(header);
        }

    }

    private String generateCase(Set<String> first, List<Product> rule, String leftN){
        String followCase = "";
        if (first.contains("EPS")){
            first.remove("EPS");
            String code = "";
            if (rule.size() >= 2
                    && (rule.get(0).getType() == Product.TypeProduct.TERMINAL
                    || rule.get(0).getType() == Product.TypeProduct.NONTERMINAL)
                    && rule.get(1).getType() == Product.TypeProduct.CODE){
                code = ((Code) rule.get(1)).code().substring(1, ((Code) rule.get(1)).code().length() - 1)
                        .replaceAll("\\$", "");
            }
            followCase = String.format("""
                            case %s -> {
                                res.addChild(new Tree("EPS"));
                                %s
                            }
                    """, String.join(", ", grammar.getFollow().get(leftN)), code);
            if (first.isEmpty()) return followCase;
        }
        List<String> strokes = new ArrayList<>();
        int count = 0;
        for (Product product: rule){
            if (product.getType() == Product.TypeProduct.NONTERMINAL){
                NonTerminal nonTerminal = (NonTerminal) product;
                strokes.add(String.format("""
                                    %sClass %s%s = %s(%s);
                                    res.addChild(%s%s);
                        """,
                        nonTerminal.name(),
                        nonTerminal.name(),
                        count,
                        nonTerminal.name(),
                        nonTerminal.inherited(),
                        nonTerminal.name(),
                        count)); // добавить аргумент
                count++;
            } else if (product.getType() == Product.TypeProduct.TERMINAL){
                Terminal terminal = (Terminal) product;
                strokes.add(String.format("""
                                            if (lexicalAnalyzer.cur().typeToken != TypeToken.%s) {
                                                throw new ParseException(
                                                    "Expected token: %s, but found: " + lexicalAnalyzer.cur(),
                                                     lexicalAnalyzer.curPos
                                                );
                                            }
                                            Token %s%s = new Token(TypeToken.%s, lexicalAnalyzer.cur().text);
                                            res.addChild(new Tree(lexicalAnalyzer.cur().text));
                                            lexicalAnalyzer.next();
                                """,
                        terminal.name(), terminal.name(),
                        terminal.name(), count,
                        terminal.name(),
                        terminal.name()));
                count++;
            } else if (product.getType() == Product.TypeProduct.CODE) {
                Code code = (Code) product;
                String text = code.code().substring(1, code.code().length() - 1).replaceAll("\\$", "");
                strokes.add(String.format("""
                                %s
                        """, text));
            }
        }
        String inCase = String.join("", strokes);
        String allCase = String.format("""
                        case %s -> {
                %s
                        }
                        """,
                String.join(", ", first), inCase); //follow
        return followCase + allCase;
    }

    @Override
    protected void generateAdditional(BufferedWriter writer) throws IOException {
        ArrayList<String> nonTClasses = new ArrayList<>();
        for (NonTerminal nonTerminal: grammar.getNonTerminals()){
            String fields = String.join("",
                    Arrays.stream(nonTerminal.synthesised().split(","))
                            .map(field -> {
                                if (field.equals("")) return "";
                                return "public " + field + ";\n\t";
                            }).toList());
            String declare = String.format("""
                        public class %sClass extends Tree {
                            public %sClass (String name) {
                                super(name);
                            }
                            %s
                        }
                    """, nonTerminal.name(), nonTerminal.name(), fields);
            nonTClasses.add(declare);
        }
        writer.write(String.join("", nonTClasses));
        String treeClass = """
                    public class Tree {
                        private static final char TAB = '\\t';
                        private static final char NEW_LINE = '\\n';
                                    
                        String node;
                        List<Tree> children;
                                    
                        public Tree(String node) {
                            this.node = node;
                            children = new ArrayList<>(Collections.emptyList());
                        }
                        
                        public void addChild(Tree tree) {
                            children.add(tree);
                        }
                                    
                        public void visualize(String graphName) {
                             graphName = "C:\\\\Users\\\\vovak\\\\myGit\\\\Translation-Methods\\\\lab4\\\\graph";
                            try (BufferedWriter writer = Files.newBufferedWriter(Path.of(graphName + ".dot"))) {
                                writer.write(treeToDotRepresentation(this));
                                writer.close();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        }
                                    
                        private static String treeToDotRepresentation(Tree tree) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("digraph {").append("\\n");
                            bfs(tree, sb);
                            sb.append("}");
                            return sb.toString();
                        }
                                    
                        private static void bfs(Tree tree, StringBuilder sb) {
                            Deque<TreeWithID> deque = new ArrayDeque<>();
                            int id = 0;
                            deque.add(new TreeWithID(tree, id));
                                    
                            while (!deque.isEmpty()) {
                                TreeWithID currentTree = deque.pop();
                                    
                                sb.append(TAB)
                                        .append(currentTree.id)
                                        .append(" [label=\\"")
                                        .append(currentTree.tree.node)
                                        .append("\\"]")
                                        .append(NEW_LINE);
                                    
                                if (!currentTree.tree.children.isEmpty()) {
                                    for (Tree child : currentTree.tree.children) {
                                        id++;
                                        sb.append(TAB).append(currentTree.id).append(" -> ").append(id).append(NEW_LINE);
                                        deque.add(new TreeWithID(child, id));
                                    }
                                }
                            }
                        }
                                    
                        private static class TreeWithID {
                            private Tree tree;
                            private int id;
                                    
                            public TreeWithID(Tree tree, int id) {
                                this.tree = tree;
                                this.id = id;
                            }
                        }
                                    
                    }
                """;
        writer.write(treeClass);
    }
}
