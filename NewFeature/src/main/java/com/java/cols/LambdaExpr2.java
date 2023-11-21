package com.java.cols;

public class LambdaExpr2 {
	
	public static void main(String[] args) {
		ICalculation obj1 = (a,b) ->{
			return a+b;
		};
		System.out.println("Sum is "+obj1.calc(12, 7));
		
		ICalculation obj2 = (a,b) ->{
			return a-b;
		};
		System.out.println("Substraction is "+obj2.calc(12, 7));
		
		ICalculation obj3 = (a,b) ->{
			return a*b;
		};
		System.out.println("Multiplication is "+obj3.calc(12, 7));
	}

}
