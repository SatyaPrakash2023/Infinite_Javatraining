package com.java.day1;
import java.util.Scanner;

public class RectangleAreaOverload {
	int length;
	int breadth;
	public int area() {
		return length * breadth;
	}
	public int perimeter() {
		return 2 * (length + breadth);
	}

	public static void main(String[] args) {
		RectangleAreaOverload obj = new RectangleAreaOverload();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of rectangle ");
		obj.length = sc.nextInt();
		System.out.println("enter the Breadth of rectangle ");
		obj.breadth = sc.nextInt();
		int areeaa = obj.area();
		int peri = obj.perimeter();
		System.out.println("the area of rectangle is " + areeaa);
		System.out.println("the Perimeter of rectangle is " + peri);

	}

}