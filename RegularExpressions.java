package regex;

import java.util.regex.*;

public class RegularExpressions {
	public static void main(String[] args) {
		Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}");// first name start with capital and has minimum 3 chararcters
																
		Matcher first = firstName.matcher("Chandrakala");
		Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}"); //last name start with capital and has minimum 3 chararcters
		Matcher last = lastName.matcher("Mishra");
		
		Pattern email = Pattern.compile("^[a-zA-Z.a-z0-9_!#$%'*&+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher email1 = email.matcher("abc.xyz@bl.co.in");
		Pattern email2 = Pattern.compile("\\b[A-Z0-9._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b");
		Matcher eml = email2.matcher("abc@gmail.com");
		System.out.println("string matches the given Regex -" + first.matches());
		System.out.println("string matches the given Regex -" + last.matches());
		System.out.println("string matches the given Regex -" + eml.matches());
		System.out.println("string matches the given Regex -" + email1.matches());
	}
}