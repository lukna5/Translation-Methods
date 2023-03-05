package generated.Calculator;

import java.util.regex.Pattern;
public enum TypeToken {

		POW("\\*\\*"),
		DIV("/"),
		MUL("\\*"),
		PLUS("\\+"),
		MINUS("-"),
		DIGIT("[0-9]+"),
		OPEN("\\("),
		CLOSE("\\)"),
		EPS("eps"),
		END("end");
private final Pattern pattern;
TypeToken (String regexp) {
    this.pattern = Pattern.compile(regexp);
}
public boolean match(String text) {
    return pattern.matcher(text).matches();
}
}