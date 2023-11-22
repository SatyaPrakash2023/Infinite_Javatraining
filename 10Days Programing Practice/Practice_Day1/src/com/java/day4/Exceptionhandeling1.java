package com.java.day4;

public class Exceptionhandeling1{  
	  public static void main(String args[]){  
	   try{  
	      //code that may raise exception  
	      int data=100/0;  //divide by zero that occurs arithmatic exception
	   }catch(ArithmeticException e){
		   System.out.println(e);
		}
	   //rest code of the program   
	   System.out.println("rest of the code...");  
	  }  
	}  