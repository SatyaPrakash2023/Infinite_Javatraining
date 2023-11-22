package com.java.day1;

class Adder{  
	static int add(int a,int b){//Adder class have two static method which overloaded
		return a+b;
	}  
	static int add(int a,int b,int c){
		return a+b+c;
	}  
}  
class MethodOverloading1{  
public static void main(String[] args){  
	System.out.println(Adder.add(11,11));  //as we know for calling static method dont need a object we can call by class name 
	System.out.println(Adder.add(11,11,11));  
}}  