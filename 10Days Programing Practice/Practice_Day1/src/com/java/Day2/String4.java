package com.java.Day2;

public class String4 {
	public static void main(String[] args) {
		String mystr="Satya Prakash Sharma";
		String name=mystr;
		System.out.println(mystr.replaceFirst("at","ta" ));
		System.out.println(mystr.replaceFirst("a", "e"));
		System.out.println(mystr.replaceAll("a", "e"));
		System.out.println(mystr.toLowerCase());
		System.out.println(mystr.toCharArray());
		System.out.println(mystr.substring(2, 6));
		System.out.println(mystr.indexOf("r"));
		System.out.println(mystr.subSequence(2, 8));
		System.out.println(mystr.matches("Satya"));
		System.out.println(mystr.matches(name));
	}
}
