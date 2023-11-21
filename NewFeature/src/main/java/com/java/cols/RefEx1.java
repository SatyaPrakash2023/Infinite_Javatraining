package com.java.cols;

public class RefEx1 {
	
	void display() {
		System.out.println("Example of Functional Interface....");
	}
	
	public static void main(String[] args) {
		RefEx1 obj = new RefEx1();
		IMethodRef1 m1 = obj::display;
		m1.show();
	}

}
