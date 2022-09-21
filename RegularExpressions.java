package regex;

import java.util.regex.*;

public class RegularExpressions {
	public static void main(String[] args) {
		Pattern firstName = Pattern.compile("^[A-Z][a-z]{3,}");// first name start with capital and has minimum 3 chararcters														
		Matcher first = firstName.matcher("Chandrakala");
		Pattern lastName = Pattern.compile("^[A-Z][a-z]{3,}"); //last name start with capital and has minimum 3 chararcters
		Matcher last = lastName.matcher("Mishra");
		Pattern emailP = Pattern.compile("^[a][b][c].[a-z]{3,}+@[b][l].[c][o].[a-z]{0,}");//for valid email
		Matcher emailM = emailP.matcher("abc.chandrakala@bl.co.us");
		Pattern mobileP = Pattern.compile("[0-9]{0,2}[1-9] [0-9]{10}");//for mobile format
		Matcher mobileM = mobileP.matcher("91 8976544391");
		Pattern passwordP = Pattern.compile("[a-zA-Z]{8,}");//for Password
		Matcher passwordM = passwordP.matcher("Abcretut");
		System.out.println("string matches the given Regex for first name -" + first.matches());
		System.out.println("string matches the given Regex for last name -" + last.matches());
		System.out.println("string matches the given Regex for email -" +  emailM.matches());
		System.out.println("string matches the given Regex for mobile number -" +  mobileM.matches());
		System.out.println("string matches the given Regex for mobile number -" +  passwordM.matches());
		
	}
}