package generated.Calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class LexicalAnalyzer {

private String input;
private Token curToken;
private final Matcher matcher;
private final static Pattern PATTERN = Pattern.compile("\\*\\*|/|\\*|\\+|-|[0-9]+|\\(|\\)");
public LexicalAnalyzer(String input){
        this.input = input;
        matcher = PATTERN.matcher(input);
}
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
}