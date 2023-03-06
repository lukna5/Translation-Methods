package generated.ListInKotlin;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.text.ParseException;
public class Parser {

LexicalAnalyzer lexicalAnalyzer;
public Parser(LexicalAnalyzer lexicalAnalyzer){
        this.lexicalAnalyzer = lexicalAnalyzer;
}
public sClass s () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    sClass res = new sClass("s");
    switch(curTypeToken){
        case VAR -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.VAR) {
                throw new ParseException(
                    "Expected token: VAR, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token VAR0 = new Token(TypeToken.VAR, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            namingClass naming1 = naming();
            res.addChild(naming1);

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public namingClass naming () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    namingClass res = new namingClass("naming");
    switch(curTypeToken){
        case NAME -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.NAME) {
                throw new ParseException(
                    "Expected token: NAME, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token NAME0 = new Token(TypeToken.NAME, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            if (lexicalAnalyzer.cur().typeToken != TypeToken.COLON) {
                throw new ParseException(
                    "Expected token: COLON, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token COLON1 = new Token(TypeToken.COLON, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            contClass cont2 = cont();
            res.addChild(cont2);

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public contClass cont () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    contClass res = new contClass("cont");
    switch(curTypeToken){
        case ARRAY -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.ARRAY) {
                throw new ParseException(
                    "Expected token: ARRAY, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token ARRAY0 = new Token(TypeToken.ARRAY, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            arClass ar1 = ar();
            res.addChild(ar1);

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public arClass ar () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    arClass res = new arClass("ar");
    switch(curTypeToken){
        case LEFT -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.LEFT) {
                throw new ParseException(
                    "Expected token: LEFT, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token LEFT0 = new Token(TypeToken.LEFT, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            typingClass typing1 = typing();
            res.addChild(typing1);
            if (lexicalAnalyzer.cur().typeToken != TypeToken.RIGHT) {
                throw new ParseException(
                    "Expected token: RIGHT, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token RIGHT2 = new Token(TypeToken.RIGHT, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public typingClass typing () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    typingClass res = new typingClass("typing");
    switch(curTypeToken){
        case TYPE -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.TYPE) {
                throw new ParseException(
                    "Expected token: TYPE, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token TYPE0 = new Token(TypeToken.TYPE, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();

        }
        case ARRAY -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.ARRAY) {
                throw new ParseException(
                    "Expected token: ARRAY, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token ARRAY0 = new Token(TypeToken.ARRAY, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            if (lexicalAnalyzer.cur().typeToken != TypeToken.LEFT) {
                throw new ParseException(
                    "Expected token: LEFT, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token LEFT1 = new Token(TypeToken.LEFT, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            typingClass typing2 = typing();
            res.addChild(typing2);
            if (lexicalAnalyzer.cur().typeToken != TypeToken.RIGHT) {
                throw new ParseException(
                    "Expected token: RIGHT, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token RIGHT3 = new Token(TypeToken.RIGHT, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
    public class sClass extends Tree {
        public sClass (String name) {
            super(name);
        }
        
    }
    public class namingClass extends Tree {
        public namingClass (String name) {
            super(name);
        }
        
    }
    public class contClass extends Tree {
        public contClass (String name) {
            super(name);
        }
        
    }
    public class arClass extends Tree {
        public arClass (String name) {
            super(name);
        }
        
    }
    public class typingClass extends Tree {
        public typingClass (String name) {
            super(name);
        }
        
    }
    public class Tree {
        private static final char TAB = '\t';
        private static final char NEW_LINE = '\n';

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
             graphName = "C:\\Users\\vovak\\myGit\\Translation-Methods\\lab4\\graph";
            try (BufferedWriter writer = Files.newBufferedWriter(Path.of(graphName + ".dot"))) {
                writer.write(treeToDotRepresentation(this));
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        private static String treeToDotRepresentation(Tree tree) {
            StringBuilder sb = new StringBuilder();
            sb.append("digraph {").append("\n");
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
                        .append(" [label=\"")
                        .append(currentTree.tree.node)
                        .append("\"]")
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
}