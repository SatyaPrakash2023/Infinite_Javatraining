package com.java.day4;

import java.util.Scanner;

public class Exceptionhandaling3 {
	public static void main(String args[]){   
		//outer try block   
		 try{    
		 //inner try block 1  
		   try{    
		    System.out.println("going to divide by 0");    
		    int b =39/0;    
		   }  
		   //catch block of inner try block 1  
		   catch(ArithmeticException e)  
		   {  
		     System.out.println(e);  
		   }   
	}catch(Exception e){
		System.out.println("Outside Catch");
	}
}
}
	
	
	


