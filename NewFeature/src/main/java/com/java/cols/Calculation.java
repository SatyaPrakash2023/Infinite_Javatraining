package com.java.cols;

public class Calculation {
	
	int sum(int x,int y) {
		return x+y;
	}
	int minus(int x,int y) {
		return x-y;
	}
	int mul(int x,int y) {
		return x*y;
	}
	
	public static void main(String[] args) {
		Calculation obj = new Calculation();
		IMethod2 m1 = obj::sum;
		System.out.println("Sum is "+m1.calc(12,5));
		
		IMethod2 m2 = obj::minus;
		System.out.println("minus is "+m2.calc(12,5));
		
		IMethod2 m3 = obj::mul;
		System.out.println("mul is "+m3.calc(12,5));
		
		
	}



}
