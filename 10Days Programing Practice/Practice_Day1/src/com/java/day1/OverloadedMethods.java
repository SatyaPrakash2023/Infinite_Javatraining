package com.java.day1;

 public class OverloadedMethods {
    void print(String message) {
        System.out.println(message);
    }

   void print(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
    

	public static void main(String[] args) {
		OverloadedMethods obj = new OverloadedMethods();
		obj.print("Hii I am satya prakash...");
		obj.print("Hii I am satya prakash...", 5);
	}
}
