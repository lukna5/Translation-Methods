package generatorsGrammer;

import generatorsGrammer.grammar.Grammar;
import generatorsGrammer.grammar.NonTerminal;
import generatorsGrammer.grammar.Product;
import generatorsGrammer.grammar.Terminal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class GeneratorParser extends AbstractGenerator{
    public GeneratorParser(Grammar grammar) {
        super(grammar, "Parser", "class");
    }

    @Override
    protected void genImports(BufferedWriter writer) throws IOException {
        String imports = String.format("""
                import java.io.BufferedWriter;
                import java.io.IOException;
                import java.nio.file.Files;
                import java.nio.file.Path;
                import java.util.ArrayList;
                import java.util.Collections;
                import java.util.List;
                """);
        writer.write(imports);
    }

    @Override
    protected void generateFields(BufferedWriter writer) throws IOException {
        String fields = String.format("""
                LexicalAnalyzer lexicalAnalyzer;
                """);
        writer.write(fields);
    }

    @Override
    protected void generateConstructor(BufferedWriter writer) throws IOException {
        String constr = String.format("""
                public Parser(LexicalAnalyzer lexicalAnalyzer){
                        this.lexicalAnalyzer = lexicalAnalyzer;
                }
                """);
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
                cases.add(generateCase(first, rule));
            }
            String header = String.format("""
                        public %sClass %s (){
                            TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
                            Tree res = new Tree("%s");
                            switch(curTypeToken){
                        %s
                            }
                        }
                        """, nonTerminalLeft.name(), nonTerminalLeft.name(),
                            nonTerminalLeft.name(), String.join("", cases));
            writer.write(header);
        }

    }

    private String generateCase(Set<String> first, List<Product> rule){
        List<String> strokes = new ArrayList<>();
        int count = 0;
        for (Product product: rule){
            if (product.getType() == Product.TypeProduct.NONTERMINAL){
                NonTerminal nonTerminal = (NonTerminal) product;
                strokes.add(String.format("""
                                    %sClass %s%s = %s();
                                    res.addChild(%s%s);
                        """,
                        nonTerminal.name(),
                        nonTerminal.name(),
                        count,
                        nonTerminal.name(),
                        nonTerminal.name(),
                        count++)); // добавить аргументы
            } else if (product.getType() == Product.TypeProduct.TERMINAL){
                Terminal terminal = (Terminal) product;
                strokes.add(String.format("""
                                    res.addChild(new Tree("%s"));
                                    lexicalAnalyzer.next();
                        """, terminal.name()));
            }
        }
        String inCase = String.join("", strokes);
        String allCase = String.format("""
                        case %s -> {
                %s
                        }
                        """,
                String.join(", ", first), inCase); //follow
        return allCase;
    }

    @Override
    protected void generateAdditional(BufferedWriter writer) throws IOException {
        ArrayList<String> nonTClasses = new ArrayList<>();
        for (NonTerminal nonTerminal: grammar.getNonTerminals()){
            String fields = String.join("",
                    Arrays.stream(nonTerminal.synthesised().split(","))
                            .map(field -> field + ";\n\t").toList());
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
                            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(graphName + ".dot"))) {
                                bufferedWriter.write(treeToDotRepresentation(this));
                                Runtime.getRuntime().exec("dot " + graphName + ".dot -Tpng -o " + graphName + ".png");
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
