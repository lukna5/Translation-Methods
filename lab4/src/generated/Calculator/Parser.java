package generated.Calculator;

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

private int log (int x, int y) {
    return (int) (Math.log(x) / Math.log(y));
}
public eClass e () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    eClass res = new eClass("e");
    switch(curTypeToken){
        case LOG, DIGIT, MINUS, OPEN -> {
            tClass t0 = t();
            res.addChild(t0);
            ePrimeClass ePrime1 = ePrime(t0.val);
            res.addChild(ePrime1);
         res.val = ePrime1.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public ePrimeClass ePrime (int acc) throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    ePrimeClass res = new ePrimeClass("ePrime");
    switch(curTypeToken){
        case END, CLOSE -> {
            res.addChild(new Tree("EPS"));
             res.val = acc; 
        }
        case MINUS -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.MINUS) {
                throw new ParseException(
                    "Expected token: MINUS, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token MINUS0 = new Token(TypeToken.MINUS, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            tClass t1 = t();
            res.addChild(t1);
         res.val = acc - t1.val; 
            ePrimeClass ePrime2 = ePrime(res.val);
            res.addChild(ePrime2);
         res.val = ePrime2.val; 

        }
        case PLUS -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.PLUS) {
                throw new ParseException(
                    "Expected token: PLUS, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token PLUS0 = new Token(TypeToken.PLUS, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            tClass t1 = t();
            res.addChild(t1);
         res.val = acc + t1.val; 
            ePrimeClass ePrime2 = ePrime(res.val);
            res.addChild(ePrime2);
         res.val = ePrime2.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public tClass t () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    tClass res = new tClass("t");
    switch(curTypeToken){
        case LOG, DIGIT, MINUS, OPEN -> {
            mClass m0 = m();
            res.addChild(m0);
            tPrimeClass tPrime1 = tPrime(m0.val);
            res.addChild(tPrime1);
         res.val = tPrime1.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public tPrimeClass tPrime (int acc) throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    tPrimeClass res = new tPrimeClass("tPrime");
    switch(curTypeToken){
        case END, CLOSE, PLUS, MINUS -> {
            res.addChild(new Tree("EPS"));
             res.val = acc; 
        }
        case DIVV -> {
            divRClass divR0 = divR();
            res.addChild(divR0);
         res.val = acc / divR0.val; 
            tPrimeClass tPrime1 = tPrime(res.val);
            res.addChild(tPrime1);
         res.val = tPrime1.val; 

        }
        case MUL -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.MUL) {
                throw new ParseException(
                    "Expected token: MUL, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token MUL0 = new Token(TypeToken.MUL, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            mClass m1 = m();
            res.addChild(m1);
         res.val = acc * m1.val; 
            tPrimeClass tPrime2 = tPrime(res.val);
            res.addChild(tPrime2);
         res.val = tPrime2.val; 

        }
        case DIV -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.DIV) {
                throw new ParseException(
                    "Expected token: DIV, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token DIV0 = new Token(TypeToken.DIV, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            mClass m1 = m();
            res.addChild(m1);
         res.val = acc / m1.val; 
            tPrimeClass tPrime2 = tPrime(res.val);
            res.addChild(tPrime2);
         res.val = tPrime2.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public divRClass divR () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    divRClass res = new divRClass("divR");
    switch(curTypeToken){
        case DIVV -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.DIVV) {
                throw new ParseException(
                    "Expected token: DIVV, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token DIVV0 = new Token(TypeToken.DIVV, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            fClass f1 = f();
            res.addChild(f1);
            divRPrimeClass divRPrime2 = divRPrime();
            res.addChild(divRPrime2);
         res.val = f1.val / divRPrime2.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public divRPrimeClass divRPrime () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    divRPrimeClass res = new divRPrimeClass("divRPrime");
    switch(curTypeToken){
        case END, CLOSE, PLUS, MINUS -> {
            res.addChild(new Tree("EPS"));
             res.val = 1; 
        }
        case DIVV -> {
            divRClass divR0 = divR();
            res.addChild(divR0);
         res.val = divR0.val; 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public mClass m () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    mClass res = new mClass("m");
    switch(curTypeToken){
        case MINUS -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.MINUS) {
                throw new ParseException(
                    "Expected token: MINUS, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token MINUS0 = new Token(TypeToken.MINUS, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            mClass m1 = m();
            res.addChild(m1);
         res.val = -m1.val; 

        }
        case DIGIT, OPEN -> {
            fClass f0 = f();
            res.addChild(f0);
         res.val = f0.val; 

        }
        case LOG -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.LOG) {
                throw new ParseException(
                    "Expected token: LOG, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token LOG0 = new Token(TypeToken.LOG, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            if (lexicalAnalyzer.cur().typeToken != TypeToken.OPEN) {
                throw new ParseException(
                    "Expected token: OPEN, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token OPEN1 = new Token(TypeToken.OPEN, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            fClass f2 = f();
            res.addChild(f2);
            if (lexicalAnalyzer.cur().typeToken != TypeToken.ZAP) {
                throw new ParseException(
                    "Expected token: ZAP, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token ZAP3 = new Token(TypeToken.ZAP, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            mClass m4 = m();
            res.addChild(m4);
            if (lexicalAnalyzer.cur().typeToken != TypeToken.CLOSE) {
                throw new ParseException(
                    "Expected token: CLOSE, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token CLOSE5 = new Token(TypeToken.CLOSE, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
        res.val = log(f2.val, m4.val);

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
public fClass f () throws ParseException{
    TypeToken curTypeToken = lexicalAnalyzer.cur().typeToken;
    fClass res = new fClass("f");
    switch(curTypeToken){
        case OPEN -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.OPEN) {
                throw new ParseException(
                    "Expected token: OPEN, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token OPEN0 = new Token(TypeToken.OPEN, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
            eClass e1 = e();
            res.addChild(e1);
            if (lexicalAnalyzer.cur().typeToken != TypeToken.CLOSE) {
                throw new ParseException(
                    "Expected token: CLOSE, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token CLOSE2 = new Token(TypeToken.CLOSE, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
         res.val = e1.val; 

        }
        case DIGIT -> {
            if (lexicalAnalyzer.cur().typeToken != TypeToken.DIGIT) {
                throw new ParseException(
                    "Expected token: DIGIT, but found: " + lexicalAnalyzer.cur(),
                     lexicalAnalyzer.curPos
                );
            }
            Token DIGIT0 = new Token(TypeToken.DIGIT, lexicalAnalyzer.cur().text);
            res.addChild(new Tree(lexicalAnalyzer.cur().text));
            lexicalAnalyzer.next();
         res.val = Integer.parseInt(DIGIT0.text); 

        }

        default -> throw new ParseException("Meet Unexpected token: "
                + lexicalAnalyzer.cur(), lexicalAnalyzer.curPos);
    }
    return res;
}
    public class eClass extends Tree {
        public eClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class ePrimeClass extends Tree {
        public ePrimeClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class tClass extends Tree {
        public tClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class tPrimeClass extends Tree {
        public tPrimeClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class divRClass extends Tree {
        public divRClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class divRPrimeClass extends Tree {
        public divRPrimeClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class mClass extends Tree {
        public mClass (String name) {
            super(name);
        }
        public int val;
	
    }
    public class fClass extends Tree {
        public fClass (String name) {
            super(name);
        }
        public int val;
	
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