package generated.ListInKotlin;

import java.util.regex.Pattern;
public enum TypeToken {

		VAR("var"),
		COLON(":"),
		ARRAY("Array"),
		LEFT("<"),
		RIGHT(">"),
		NAME("[a-z][a-zA-Z]*"),
		TYPE("[A-Z][a-zA-Z]*"),
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