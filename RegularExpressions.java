package regex;
import java.util.regex.*;
public class RegularExpressions{
		public static void main(String[] args) {
			Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}");//first name start with capital and has minimum 3 chararcters
			Matcher first = firstName.matcher("Chandrakala");
			Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}");
			Matcher last = lastName.matcher("Mishra");

			System.out.println("string matches the given Regex -"+first.matches());
			System.out.println("string matches the given Regex -"+last.matches());
}
}