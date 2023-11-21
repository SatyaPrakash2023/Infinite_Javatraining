package com.java.cols;

public class ConRef {
	
	public static void main(String[] args) {
		ITest obj1 = Emp::new;
		Emp e = obj1.showEmploy(1, "Satya",876544);
		System.out.println(e);
	}

}
