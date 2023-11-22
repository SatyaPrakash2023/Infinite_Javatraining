package com.java.day4;

import java.util.Scanner;

public class Exceptionhandaling4 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		try {
			System.out.println("Enter value of a to get its square value:");  
            Integer a = sc.nextInt(); // we give any float value as input    
            System.out.println((a*a));  
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Input missmatch check your input");
		}
	}
}
