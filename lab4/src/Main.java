//import generated.GrammarName1.LexemeAnalyze;
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

public class Main {
    public static void main(String[] args) throws IOException {
        String inputGrammar = Files.readString(Path.of("./src/generatorsGrammer/GrammarOfGrammar/Calculator"));

        CharStream charStream = CharStreams.fromString(inputGrammar);
        MetaGrammarLexer lexer = new MetaGrammarLexer(charStream);
        MetaGrammarParser parser = new MetaGrammarParser(new CommonTokenStream(lexer));

        Grammar grammar = parser.metaGrammar().grammar;
        generateFromGrammar(grammar);
    }

    private static void generateFromGrammar(Grammar grammar){

        GeneratorTypeToken typeToken = new GeneratorTypeToken(grammar);
        GeneratorToken token = new GeneratorToken(grammar);
        GeneratorLexemeAnalyze analyze = new GeneratorLexemeAnalyze(grammar);
        GeneratorParser parser = new GeneratorParser(grammar);
        //testLexeme();
    }


   /* private static void testLexeme(){
        LexemeAnalyze analyze = new LexemeAnalyze("\n2 +    \ttextg2"  );
        while (analyze.next() != null){
            System.out.println(analyze.cur());
        }
    }

    */


}