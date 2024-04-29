package com.java.Day2;

public class String3 {
	public static void main(String[] args) {
		String name="Satya Prakash Sharma";
		String sname="Satya Prakash";
		int result = name.codePointAt(0);
		System.out.println(result);
		
		System.out.println("End With a "+name.endsWith("ma"));
		System.out.println("Both String are equal or not"+name.compareTo(sname));
		System.out.println("HashCode of String name is "+name.hashCode());
	}
}
