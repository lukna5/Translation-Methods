package generatorsGrammer;

import generatorsGrammer.grammar.Grammar;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class AbstractGenerator {
    Grammar grammar;
    String fileName;
    String JAVA = ".java";
    String TAB = "\t";
// 2 + 2
    String typeFile;
    public AbstractGenerator(Grammar grammar, String fileName, String typeFile) {
        this.grammar = grammar;
        this.fileName = fileName;
        this.typeFile = typeFile;
        gen("./src/generated/" + this.grammar.nameGrammar + "/");// name grammar
    }

    public void gen(String outDir){
        String outFile = outDir + fileName + JAVA;
        Path path = Paths.get(outFile);
        try {
            Files.createDirectories(path.getParent());
            try(BufferedWriter writer = Files.newBufferedWriter(path)){
                genPackage(writer);
                genImports(writer);
                genClass(writer);
                generateFields(writer);
                generateConstructor(writer);
                generateMethods(writer);
                generateAdditional(writer);
                writer.write("}");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    protected String convertToRegular(String token){
        token = token.replaceAll("\"", "");
        if (token.contains("[") && token.contains("]")){
            return token;
        }
        String res = token.replaceAll("\\*", "\\\\\\\\*");
        res = res.replaceAll("\\+", "\\\\\\\\+");
        res = res.replaceAll("\\(", "\\\\\\\\(");
        res = res.replaceAll("\\)", "\\\\\\\\)");
        res = res.replaceAll("\\^", "\\\\\\\\^");
        res = res.replaceAll("\\?", "\\\\\\\\?");
        return res;
    }
    public void genPackage(BufferedWriter writer) throws IOException{
        String packages = String.format("""
                package generated.%s;
                
                """, grammar.nameGrammar);
        writer.write(packages);
    }

    public void genClass(BufferedWriter writer) throws IOException{
        String classString = String.format("""
                public %s %s {
                
                """, typeFile, fileName);
        writer.write(classString);
    }

    protected abstract void genImports(BufferedWriter writer) throws IOException;
    protected abstract void generateFields(BufferedWriter bufferedWriter) throws IOException;
    protected abstract void generateConstructor(BufferedWriter bufferedWriter) throws IOException;
    protected abstract void generateMethods(BufferedWriter bufferedWriter) throws IOException;
    protected abstract void generateAdditional(BufferedWriter writer) throws IOException;

}
