package generated.ListInKotlin;

public class Token {

public final TypeToken typeToken;
public final String text;
Token (TypeToken typeToken, String text) {
          this.text = text;
          this.typeToken = typeToken;
      }

@Override
public String toString() {
    return "Token{" +
            "typeToken=" + typeToken +
            ", text='" + text + '\'' +
            '}';
}
}