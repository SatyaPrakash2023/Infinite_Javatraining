package com.java.day4;

import java.util.Scanner;

public class Exceptionhandaling6 {
	public static void main(String[] args) {
		int []arr=new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		try {
			System.out.println(arr[8]);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Hello");
	}
}
