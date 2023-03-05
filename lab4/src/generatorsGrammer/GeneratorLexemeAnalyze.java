package generatorsGrammer;

import generatorsGrammer.grammar.Grammar;
import generatorsGrammer.grammar.Terminal;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class GeneratorLexemeAnalyze extends AbstractGenerator{
    public GeneratorLexemeAnalyze(Grammar grammar) {
        super(grammar, "LexicalAnalyzer", "class");
    }

    @Override
    protected void genImports(BufferedWriter writer) throws IOException {
        String imports = """
                import java.util.regex.Matcher;
                import java.util.regex.Pattern;
                import java.text.ParseException;
                import java.util.Arrays;
                import java.util.List;
                
                """;
        writer.write(imports);
    }

    @Override
    protected void generateFields(BufferedWriter writer) throws IOException {
        if (grammar.getTerminals().size() == 0) return;
        String grammarTokens = grammar.getTerminals().stream().map(terminal -> convertToRegular(terminal.text()))
                .collect(Collectors.joining("|", "\"", "\""));
        String fields = String.format("""
                private String input;
                private Token curToken;
                private final Matcher matcher;
                private final static Pattern PATTERN = Pattern.compile(%s);
                """, grammarTokens);
        writer.write(fields);
    }


    private String replace(String str, String what){
        what = "\\\\" + what;
        return str.replaceAll(what, "\\" + what);
    }
    @Override
    protected void generateConstructor(BufferedWriter writer) throws IOException {
        String constr = String.format("""
                public LexicalAnalyzer(String input){
                        this.input = input;
                        matcher = PATTERN.matcher(input);
                }
                """);
        writer.write(constr);
    }

    @Override
    protected void generateMethods(BufferedWriter writer) throws IOException {
        String methods = String.format("""
                public Token cur(){
                    return curToken;
                }
                public Token next(){
                    if (curToken != null && curToken.typeToken == TypeToken.END){
                        return null;
                    }
                    if (matcher.find()){
                        String found = matcher.group();
                        for (var typeToken : TypeToken.values()) {
                            if (typeToken.match(found)){
                                curToken = new Token(typeToken, found);
                                return curToken;
                            }
                        }
                    }
                    curToken = new Token(TypeToken.END, "$");
                    return curToken;
                }
                """);

        writer.write(methods);
    }

    @Override
    protected void generateAdditional(BufferedWriter writer) throws IOException {

    }
}
