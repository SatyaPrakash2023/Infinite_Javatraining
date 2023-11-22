package com.java.day3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Collection10 {
	public static void main(String[] args) {  
		//Creating Deque and adding elements to it 
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Satya");
		deque.add("Prakash");
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  through foreach loop
		for (String strd : deque) {  
			System.out.println(strd);  
		}  
		  
		
	}  
}
