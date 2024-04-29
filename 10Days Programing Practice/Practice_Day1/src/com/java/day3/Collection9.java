package com.java.day3;

import java.util.Iterator;
import java.util.Stack;

public class Collection9 {  
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>(); 
		stack.add("Satya");
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  	
}
