package com.java.sum;

import java.util.Scanner;

public class SumEx {
	static int x=5;
	public String increment() {
		 
		String stock_id="S00"+x;
		x++;
		return stock_id;
	}
	
	public static void main(String[] args) {
		
	 		SumEx s = new SumEx();
	 	System.out.println(s.increment());
	 	System.out.println(s.increment());
	 	System.out.println(s.increment());
	}
	
}
	
		
//
//}
//
//class Second extends SumEx{
//	void show() {
//		System.out.println("class second");
//	}
//
//public static void main(String[args]) {
//	new SumEx().show();
//}

//public class SumEx {
//    public static void main(String[] args) {
//        int[] a=new int[5];
//        try {
//            a[6]=5/0;
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Size Small...");
//        } catch(ArithmeticException e) {
//            System.out.println("Division By Zero Impossible");
//        } catch(Exception e) {
//            System.out.println("General Exception");
//        }
//    }
//}