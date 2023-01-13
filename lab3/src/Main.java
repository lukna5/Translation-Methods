import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\vovak\\MT\\lab3\\src\\test.py");
        CharStream charStream = CharStreams.fromPath(file.toPath());

        ExprLexer lexer = new ExprLexer(charStream);
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));

        FileWriter writer = new FileWriter("C:\\Users\\vovak\\MT\\lab3\\src\\res.c");
        writer.write(parser.s().res);
        writer.close();
    }
}