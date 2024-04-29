package com.java.day4;

import java.util.Scanner;

public class Exceptionhandaling7 {
	public static void main(String[] args) {
		int []arr=new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		try {
			System.out.println(arr[8]);//we can write a program without catch but we have to write finally block
		}finally {
			System.out.println("Hii i am finally");
		}
		
		System.out.println("Hello");
	}
}
