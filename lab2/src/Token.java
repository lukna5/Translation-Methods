public class Token {
    TokenType tokenType;
    String value;

    public Token(TokenType tokenType){
        this.tokenType = tokenType;
    }

    public Token(TokenType tokenType, String value){
        this.tokenType = tokenType;
        this.value = value;
    }
}
