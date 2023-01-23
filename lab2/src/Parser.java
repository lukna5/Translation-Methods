import java.text.ParseException;

public class Parser {
    /*
     S -> /VAR NAME
     NAMING -> NAME /: CONT
     NAME -> (name)
     CONT -> /Array AR
     CONT -> /Map MAP
     AR -> </ TYPING />
     MAP -> </ TYPING, TYPING/>
     TYPING -> (type)
     TYPING -> /Map /< TYPING, TYPING />
     TYPING -> /Array /< TYPING />
     */
    private LexicalAnalyzer analyze;

    private Token curToken(){
        return analyze.curToken();
    }

    public Tree parse(String text) throws ParseException {
        analyze = new LexicalAnalyzer(text);
        return S();
    }

    private Tree S() throws ParseException {
        switch (curToken().tokenType) {
            case VAR:
                analyze.nextToken();
                Tree name = NAMING();
                if (curToken().tokenType != TokenType.END){
                    throw new ParseException("Expected end of string but found " + curToken().value, analyze.curPos());
                }
                return new Tree("S", new Tree("var", "var"), name);
            default:
                throw new ParseException("Unexpected token after S " + curToken().value, analyze.curPos());
        }
    }

    private Tree NAMING() throws ParseException {
        switch (curToken().tokenType) {
            case WORD:
                Tree name = NAME();
                if (curToken().tokenType != TokenType.COLON){
                    throw new ParseException("Expected \":\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                Tree array = CONT();

                return new Tree("NAMING", name, new Tree(":", ":"), array);
            default:
                throw new ParseException("Unexpected token after NAMING " + curToken().value, analyze.curPos());
        }

    }

    private Tree CONT() throws ParseException {
        switch (curToken().tokenType) {
            case ARRAY:
                analyze.nextToken();
                Tree array = AR();

                return new Tree("CONT", array);
            case MAP:
                analyze.nextToken();
                Tree map = MAP(1);

                return new Tree("CONT", map);
            default:
                throw new ParseException("Unexpected token after CONT " + curToken().value, analyze.curPos());

        }
    }

    private Tree NAME() throws ParseException {
        if (curToken().tokenType != TokenType.WORD){
            throw new ParseException("Expected token WORD but found " + curToken().value, analyze.curPos());
        }
        if (!validName(curToken().value)) {
            throw new ParseException("Not valid name, expect first char is letter and after" +
                    " only letters, digits and \"_\" but found " + curToken().value, analyze.curPos());
        }
        String name = curToken().value;
        analyze.nextToken();
        return new Tree("NAME", name);
    }

    private Tree AR() throws ParseException {
        if (curToken().tokenType != TokenType.LEFT){
            throw new ParseException("Expected token \"<\" but found " + curToken().value, analyze.curPos());
        }
        analyze.nextToken();
        Tree type = TYPING(0);

        if (curToken().tokenType != TokenType.RIGHT){
            throw new ParseException("Expected token \">\" but found " + curToken().value, analyze.curPos());
        }
        analyze.nextToken();
        return new Tree("ARRAY", new Tree("Array", "Array"), new Tree("<", "<"),
                type, new Tree(">", ">"));
    }

    private Tree TYPING(int num_Arrays) throws ParseException {
        switch (curToken().tokenType){
            case ARRAY -> {
                analyze.nextToken();
                if (curToken().tokenType != TokenType.LEFT){
                    throw new ParseException("Expected token \"<\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                Tree type = TYPING(num_Arrays+4);
                if (curToken().tokenType != TokenType.RIGHT){
                    throw new ParseException("Expected token \">\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                return new Tree("ARRAY ( №" + num_Arrays + " )",
                        new Tree("Array" + num_Arrays, "Array"),
                        new Tree("< ( №" + num_Arrays +  " )", "<"),
                        type,
                        new Tree("> ( №" + num_Arrays +  " )", ">"));
            }
            case MAP -> {
                analyze.nextToken();
                if (curToken().tokenType != TokenType.LEFT) {
                    throw new ParseException("Expected token \"<\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                Tree type1 = TYPING(num_Arrays+50);
                if (curToken().tokenType != TokenType.COMMA) {
                    throw new ParseException("Expected token \",\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                Tree type2 = TYPING(num_Arrays+100);
                if (curToken().tokenType != TokenType.RIGHT) {
                    throw new ParseException("Expected token \">\" but found " + curToken().value, analyze.curPos());
                }
                analyze.nextToken();
                return new Tree("Map ( №" + num_Arrays + " )",
                        new Tree("MAP" + (num_Arrays + 1), "Map"),
                        new Tree("< ( №" + (num_Arrays + 1) + " )", "<"),
                        type1,
                        new Tree("," + num_Arrays, ","),
                        type2,
                        new Tree("> ( №" + (num_Arrays + 2) + " )", ">")
                        );
                }
            case WORD -> {
                if (!validName(curToken().value)){
                    throw new ParseException("Wrong name of type, expect first char is letter" +
                            " and after only letters, digits and \"_\" but found "
                            + curToken().value, analyze.curPos());
                }
                String type = curToken().value;
                analyze.nextToken();
                return new Tree("TYPE", type);
            }
            default -> throw new ParseException("Unexpected token after TYPING: " + curToken().value, analyze.curPos());
        }
    }

    private Tree MAP(int num_Arrays) throws ParseException {
        if (curToken().tokenType != TokenType.LEFT){
            throw new ParseException("Expected token \"<\" but found " + curToken().value, analyze.curPos());
        }
        analyze.nextToken();
        Tree type1 = TYPING(0);

        if (curToken().tokenType != TokenType.COMMA){
            throw new ParseException("Expected token \",\" but found " + curToken().value, analyze.curPos());
        }
        analyze.nextToken();

        Tree type2 = TYPING(10);

        if (curToken().tokenType != TokenType.RIGHT){
            throw new ParseException("Expected token \">\" but found " + curToken().value, analyze.curPos());
        }
        analyze.nextToken();
        return new Tree("MAPS", new Tree("MAP", "Map"), new Tree("<", "<"),
                type1, new Tree(",", ","), type2,  new Tree(">", ">"));
    }

    private boolean validName(String value) {
        if (value.length() == 0 || !Character.isAlphabetic(value.charAt(0))) return false;
        for (int i = 0; i < value.length(); i++) {
            char next = value.charAt(i);
            if (Character.isDigit(next) || Character.isAlphabetic(next) || next == '_'){
                continue;
            }
            return false;
        }
        return true;
    }


}
