//import generated.GrammarName1.LexemeAnalyze;
import generated.Calculator.LexicalAnalyzer;
import generated.Calculator.Parser;
import generated.Calculator.Token;
import generatorsGrammer.GeneratorLexemeAnalyze;
import generatorsGrammer.GeneratorParser;
import generatorsGrammer.GeneratorToken;
import generatorsGrammer.GeneratorTypeToken;
import generatorsGrammer.GrammarOfGrammar.MetaGrammarLexer;
import generatorsGrammer.GrammarOfGrammar.MetaGrammarParser;
import generatorsGrammer.grammar.Grammar;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if (type == 1) { // TestCalc
            testCalculator();
            return;
        } else if (type == 5){ // VisualizeCalc
            testGenerated();
            return;
        } else if (type == 2){ //Test ListInKotlin
            String input = "var newList: Array<Array<Integer>>";
            generated.ListInKotlin.LexicalAnalyzer lexicalAnalyzer = new generated.ListInKotlin.LexicalAnalyzer(input);
            generated.ListInKotlin.Parser parser = new generated.ListInKotlin.Parser(lexicalAnalyzer);
            generated.ListInKotlin.Parser.Tree tree = parser.s();
            tree.visualize("graph77");
        } else if (type == 4){ //GenListInKotlin
            String inputGrammar = Files.readString(Path.of("./src/generatorsGrammer/GrammarOfGrammar/ListInKotlin"));

            CharStream charStream = CharStreams.fromString(inputGrammar);
            MetaGrammarLexer lexer = new MetaGrammarLexer(charStream);
            MetaGrammarParser parser = new MetaGrammarParser(new CommonTokenStream(lexer));

            Grammar grammar = parser.metaGrammar().grammar;
            generateFromGrammar(grammar);
            return;
        }
        String inputGrammar = Files.readString(Path.of("./src/generatorsGrammer/GrammarOfGrammar/Calculator"));

        CharStream charStream = CharStreams.fromString(inputGrammar);
        MetaGrammarLexer lexer = new MetaGrammarLexer(charStream);
        MetaGrammarParser parser = new MetaGrammarParser(new CommonTokenStream(lexer));

        Grammar grammar = parser.metaGrammar().grammar;
        generateFromGrammar(grammar);
    }

    private static void generateFromGrammar(Grammar grammar) throws ParseException {

        GeneratorTypeToken typeToken = new GeneratorTypeToken(grammar);
        GeneratorToken token = new GeneratorToken(grammar);
        GeneratorLexemeAnalyze analyze = new GeneratorLexemeAnalyze(grammar);
        GeneratorParser parser = new GeneratorParser(grammar);
        //testGenerated();
        //testLexeme();
    }

    private static void testGenerated() throws ParseException {
        LexicalAnalyzer lexicalAnalyzer = new LexicalAnalyzer("2+2-3*5+14/2");
        Parser parser = new Parser(lexicalAnalyzer);
        Parser.eClass tree = parser.e();
        tree.visualize("graph");
        System.out.println(tree.val);
    }


    private static void testLexeme(){
        LexicalAnalyzer analyzer = new LexicalAnalyzer("2+2-3");
        Token next = analyzer.cur();
        while (next != null){
            System.out.println(next);
            next = analyzer.next();
        }
    }

    private static Map<String, Integer> calcRight = Map.of(
            "2+2", 4,
            "2/1", 2,
            "5 + 5 *4", 25,
            "(5 + 5) * 4", 40,
            "150 - 20 * 40 / 8 + 15 * (15 - 13)", 80,
            "(150 + (42 - 8 * (4)) - 5 * (4 + 3))", 125,
            "-(-5 + -40) * -(-2)", 90
    );
    private static void testCalculator() throws ParseException{
        for (String expr: calcRight.keySet()){
            LexicalAnalyzer analyzer = new LexicalAnalyzer(expr);
            Parser parser = new Parser(analyzer);
            int res = parser.e().val;
            if (res == calcRight.get(expr)){
                System.out.println("Test passed: " + expr);
            }
            else {
                System.err.println("Test not passed: " + expr);
                System.err.println("Should out: " + calcRight.get(expr) + " but found: "
                    + res);
            }

        }
    }

    /* ListInKotlin
     S -> /VAR NAME
     NAMING -> (name) /: CONT
     CONT -> /Array AR
     AR -> /< TYPING />
     TYPING -> (type)
     TYPING -> /Array /< TYPING />
     */


}