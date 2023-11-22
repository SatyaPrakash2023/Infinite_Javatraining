package com.java.Day2;

public class String2 {
	   public static void main(String[] args) {

			    // create a string
			    String greet = "Hello ";
			    String x=greet.concat("Satya");//adding greet String with Satya and storing into a new Valiable
			    System.out.println("String: " + greet);
			    
			    System.out.println(x);
			    System.out.println(greet.charAt(0));//check which char present in at 0th position

			    // get the length of greet
			    int length = greet.length();
			    System.out.println("Length: " + length);
			  }
		}