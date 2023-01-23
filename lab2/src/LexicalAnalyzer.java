import java.text.ParseException;

public class LexicalAnalyzer {
    String text;
    int ind;
    private Token curToken;
    LexicalAnalyzer(String text) throws ParseException {
        ind = 0;
        this.text = text;
        nextToken();
        curToken = curToken();
    }

    public int curPos(){
        return ind;
    }
    private char next(){
        ind++;
        if (ind >= text.length()){
            return '$';
        }
        return text.charAt(ind);
    }

    private char cur(){
        if (ind >= text.length()){
            return '$';
        }
        return text.charAt(ind);
    }
    public Token curToken(){
        return curToken;
    }
    void nextToken() throws ParseException {
        String next = processNext();
        switch (next) {
            case "$" -> curToken = new Token(TokenType.END, "$");
            case "<" -> curToken = new Token(TokenType.LEFT, "<");
            case ">" -> curToken = new Token(TokenType.RIGHT, ">");
            case ":" -> curToken = new Token(TokenType.COLON, ":");
            case "," -> curToken = new Token(TokenType.COMMA, ",");
            case "var" -> curToken = new Token(TokenType.VAR, "var");
            case "Array" -> curToken = new Token(TokenType.ARRAY, "Array");
            case "Map" -> curToken = new Token(TokenType.MAP, "Map");
            default -> curToken = new Token(TokenType.WORD, next);
        }
    }

    String processNext() throws ParseException {
        skipWhitespaces();
        char curSymbol = cur();
        if (curSymbol == ':' || curSymbol == '<' || curSymbol == '>' || curSymbol == ';' || curSymbol == '$'
            || curSymbol == ','){
            next();
            return Character.toString(curSymbol);
        }

        //Read name or type
        StringBuilder builder = new StringBuilder();
        while(Character.isDigit(curSymbol) || Character.isAlphabetic(curSymbol) || curSymbol == '_'){
            builder.append(curSymbol);
            curSymbol = next();
        }
        if (builder.length() == 0) {
            throw new ParseException("Illegal character" + cur(), ind);
        }
        return builder.toString();

    }


    void skipWhitespaces(){
        while(Character.isWhitespace(cur())){
            next();
        }
    }
}
