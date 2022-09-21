package regex;
import java.util.regex.*;
public class RegularExpressions{
		public static void main(String[] args) {
			Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}");
			Matcher matcher = pattern.matcher("Chandrakala");
			System.out.println("string matches the given Regex -"+matcher.matches());
}
}