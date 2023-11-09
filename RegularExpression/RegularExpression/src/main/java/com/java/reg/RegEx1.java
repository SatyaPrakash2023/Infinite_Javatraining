package com.java.reg;

import java.util.regex.Pattern;

public class RegEx1 {
	public static void main(String[]args) {
		System.out.println(Pattern.matches(".h", "ch"));
		System.out.println(Pattern.matches("..f..i..", "infinite"));
		System.out.println(Pattern.matches("[aeiou]", "a"));
		System.out.println(Pattern.matches("[aeiou]", "s"));
		System.out.println(Pattern.matches("[^aeiou]", "a"));
		System.out.println(Pattern.matches("[^aeiou]", "z"));
		System.out.println(Pattern.matches("[abcd]+", "abccddd"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Hello"));
		System.out.println(Pattern.matches("[a-zA-Z]+", "Hello123"));
		//Validate MobileNo
		System.out.println(Pattern.matches("[0-9]{10}", "1234567891"));
		System.out.println(Pattern.matches("[0-9]{10}", "123456789"));
		System.out.println(Pattern.matches("[0-9]{10}", "ABCD67891"));
		
		//Adharcard Validation
		System.out.println(Pattern.matches("[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}", "123123123"));
		System.out.println(Pattern.matches("[0-9]{3}\\s[0-9]{3}\\s[0-9]{3}", "123 123 123"));
		System.out.println(Pattern.matches("[+][9][1]-[0-9]{10}", "+91-6372721719"));
		
		System.out.println(Pattern.matches("\\d{5}", "12345"));//For digit
		System.out.println(Pattern.matches("\\D+", "12345"));//For Nondigit
		System.out.println(Pattern.matches("\\D+", "ABCDE$@%"));
		System.out.println(Pattern.matches("\\S+", "HiHow"));//for Non spaces
		System.out.println(Pattern.matches("\\S+", "Hi How"));
		
		//PassWord Validation
		String regex="^(?=.*[0-9])"+"(?=.*[a-z])(?=.*[A-Z])"+"(?=.*[@#$%&+=])"+"(?=\\S+$).{8,20}";
		System.out.println(Pattern.matches(regex, "Satya@123"));
	}
}
