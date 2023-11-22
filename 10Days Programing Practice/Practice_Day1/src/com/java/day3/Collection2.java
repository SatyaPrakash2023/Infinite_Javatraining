package com.java.day3;

import java.util.ArrayList;
import java.util.List;

public class Collection2 {
	public static void main(String[] args) {
		 List<String> list=new ArrayList<String>();  //Creating a List
		 //Adding elements in the List  
		 list.add("Mango");  
		 list.add("Apple");  
		 list.add("Banana");  
		 list.add("Grapes");  
		 //Iterating the List element using for-each loop  
		 for(String fruit:list)  
		  System.out.println(fruit);  
		 
		 int idx=list.indexOf("Banana");
		 System.out.println(idx);
		 System.out.println(list.contains("Grapes"));//checking list contain this object or not
		 System.out.println(list.isEmpty());
		 System.out.println(list.lastIndexOf("Banana"));
		 System.out.println(list.hashCode());
		  
		 
		}  
		
		
	}
	  
	


