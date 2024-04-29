package com.java.day1;



public class MethodOverLoading {//in this program for method overloading
	public void add(int x) {			//having a method name add with one parameter
		System.out.println("Sum is "+(x+x));
	}
	
	public int add(int x,int y) {	//it overload with same name as previous that is add with two parameter
		return x+y;
	}
	public static void main(String[] args) {
		MethodOverLoading m = new MethodOverLoading(); //create object of class
		m.add(6);		//call method 
		System.out.println("Sum is "+m.add(6, 9));
	}
}
