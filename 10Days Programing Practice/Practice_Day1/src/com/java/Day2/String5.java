package com.java.Day2;

class String5 {
	public static void main(String[] args) {
		
		
		String str = "MadamradarradarmadaM", reverseStr = "";//taking a string 
		int strLength = str.length();//calculate length of string
		for (int i = (strLength - 1); i >= 0; --i) { //as we have to check palindrom we first store string in reverse order
			reverseStr = reverseStr + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) { //converting it to lower case and compare same or not
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}