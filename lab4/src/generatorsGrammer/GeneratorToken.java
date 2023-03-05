package generatorsGrammer;

import generatorsGrammer.grammar.Grammar;

import java.io.BufferedWriter;
import java.io.IOException;

public class GeneratorToken extends AbstractGenerator{
    public GeneratorToken(Grammar grammar) {
        super(grammar, "Token", "class");
    }

    @Override
    protected void genImports(BufferedWriter writer) throws IOException {

    }

    @Override
    protected void generateFields(BufferedWriter writer) throws IOException {
        String fields = String.format("""
                public final TypeToken typeToken;
                public final String text;
                """);
        writer.write(fields);
    }

    @Override
    protected void generateConstructor(BufferedWriter writer) throws IOException {
        String constr = String.format("""
                Token (TypeToken typeToken, String text) {
                          this.text = text;
                          this.typeToken = typeToken;
                      }
                      
                """);
        writer.write(constr);
    }

    @Override
    protected void generateMethods(BufferedWriter writer) throws IOException {
        String methods = String.format("""
                @Override
                public String toString() {
                    return "Token{" +
                            "typeToken=" + typeToken +
                            ", text='" + text + '\\'' +
                            '}';
                }
                """);
        writer.write(methods);
    }

    @Override
    protected void generateAdditional(BufferedWriter writer) throws IOException {

    }
}
