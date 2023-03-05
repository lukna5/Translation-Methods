package generatorsGrammer;

import generatorsGrammer.grammar.Grammar;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class GeneratorTypeToken extends AbstractGenerator{
    static final String TAB = "\t";
    static final String NEXT_LINE = "\n";
    public GeneratorTypeToken(Grammar grammar) {
        super(grammar, "TypeToken", "enum");
    }

    @Override
    protected void genImports(BufferedWriter writer) throws IOException {
        String packages = "import java.util.regex.Pattern;" + NEXT_LINE;
        writer.write(packages);
    }

    @Override
    protected void generateFields(BufferedWriter writer) throws IOException {
        String enums = grammar.getTerminals().stream()
                .map(en -> TAB.repeat(2) + en.name() + "(\"" + convertToRegular(en.text()) + "\")")
                .collect(Collectors.joining("," + NEXT_LINE));
        String enumsString = String.format("""
                %s,
                \t\tEPS("eps"),
                \t\tEND("end");
                private final Pattern pattern;
                """, enums);
        writer.write(enumsString);
    }

    @Override
    protected void generateConstructor(BufferedWriter writer) throws IOException {
        String constr = """           
                TypeToken (String regexp) {
                    this.pattern = Pattern.compile(regexp);
                }
                """;
        writer.write(constr);
    }

    @Override
    protected void generateMethods(BufferedWriter writer) throws IOException {
        String methods = """
                public boolean match(String text) {
                    return pattern.matcher(text).matches();
                }
                """;
        writer.write(methods);
    }

    @Override
    protected void generateAdditional(BufferedWriter writer) throws IOException {

    }
}
