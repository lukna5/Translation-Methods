package generated.Calculator;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Parser {

LexicalAnalyzer lexicalAnalyzer;
public Parser(LexicalAnalyzer lexicalAnalyzer){
        this.lexicalAnalyzer = lexicalAnalyzer;
}
public eClass e (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("e");
    switch(curTypeToken){
        case DIGIT, MINUS, OPEN -> {
            tClass t0 = t();
            res.addChild(t0);
            ePrimeClass ePrime1 = ePrime();
            res.addChild(ePrime1);

        }

    }
}
public ePrimeClass ePrime (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("ePrime");
    switch(curTypeToken){
        case MINUS -> {
            res.addChild(new Tree("MINUS"));
            lexicalAnalyzer.next();
            tClass t0 = t();
            res.addChild(t0);
            ePrimeClass ePrime1 = ePrime();
            res.addChild(ePrime1);

        }
        case PLUS -> {
            res.addChild(new Tree("PLUS"));
            lexicalAnalyzer.next();
            tClass t0 = t();
            res.addChild(t0);
            res.addChild(new Tree("MINUS"));
            lexicalAnalyzer.next();
            ePrimeClass ePrime1 = ePrime();
            res.addChild(ePrime1);

        }
        case EPS -> {
            res.addChild(new Tree("EPS"));
            lexicalAnalyzer.next();

        }

    }
}
public tClass t (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("t");
    switch(curTypeToken){
        case DIGIT, MINUS, OPEN -> {
            mClass m0 = m();
            res.addChild(m0);
            tPrimeClass tPrime1 = tPrime();
            res.addChild(tPrime1);

        }

    }
}
public tPrimeClass tPrime (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("tPrime");
    switch(curTypeToken){
        case EPS -> {
            res.addChild(new Tree("EPS"));
            lexicalAnalyzer.next();

        }
        case DIV -> {
            res.addChild(new Tree("DIV"));
            lexicalAnalyzer.next();
            mClass m0 = m();
            res.addChild(m0);
            tPrimeClass tPrime1 = tPrime();
            res.addChild(tPrime1);

        }
        case MUL -> {
            res.addChild(new Tree("MUL"));
            lexicalAnalyzer.next();
            mClass m0 = m();
            res.addChild(m0);
            tPrimeClass tPrime1 = tPrime();
            res.addChild(tPrime1);

        }

    }
}
public mClass m (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("m");
    switch(curTypeToken){
        case DIGIT, OPEN -> {
            pClass p0 = p();
            res.addChild(p0);

        }
        case MINUS -> {
            res.addChild(new Tree("MINUS"));
            lexicalAnalyzer.next();
            mClass m0 = m();
            res.addChild(m0);

        }

    }
}
public pClass p (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("p");
    switch(curTypeToken){
        case DIGIT, OPEN -> {
            fClass f0 = f();
            res.addChild(f0);
            pPrimeClass pPrime1 = pPrime();
            res.addChild(pPrime1);

        }

    }
}
public pPrimeClass pPrime (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("pPrime");
    switch(curTypeToken){
        case EPS -> {
            res.addChild(new Tree("EPS"));
            lexicalAnalyzer.next();

        }
        case POW -> {
            res.addChild(new Tree("POW"));
            lexicalAnalyzer.next();
            pClass p0 = p();
            res.addChild(p0);

        }

    }
}
public fClass f (){
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    Tree res = new Tree("f");
    switch(curTypeToken){
        case DIGIT -> {
            res.addChild(new Tree("DIGIT"));
            lexicalAnalyzer.next();

        }
        case OPEN -> {
            res.addChild(new Tree("OPEN"));
            lexicalAnalyzer.next();
            eClass e0 = e();
            res.addChild(e0);
            res.addChild(new Tree("CLOSE"));
            lexicalAnalyzer.next();

        }

    }
}
    public class eClass extends Tree {
        public eClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class ePrimeClass extends Tree {
        public ePrimeClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class tClass extends Tree {
        public tClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class tPrimeClass extends Tree {
        public tPrimeClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class mClass extends Tree {
        public mClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class pClass extends Tree {
        public pClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class pPrimeClass extends Tree {
        public pPrimeClass (String name) {
            super(name);
        }
        int val;
	
    }
    public class fClass extends Tree {
        public fClass (String name) {
            super(name);
        }
        int val;
	
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
            try (BufferedWriter bufferedWriter = Files.newBufferedWriter(Path.of(graphName + ".dot"))) {
                bufferedWriter.write(treeToDotRepresentation(this));
                Runtime.getRuntime().exec("dot " + graphName + ".dot -Tpng -o " + graphName + ".png");
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