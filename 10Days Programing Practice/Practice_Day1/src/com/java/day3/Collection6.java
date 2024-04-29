package com.java.day3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Collection6{  
	public static void main(String args[]){  
		LinkedList<String> al=new LinkedList<String>();//creating a linkedlist
		al.add("Satya");
		al.add("Prakash");
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> itr=al.iterator();  //iterate through iterator
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		
		}  
		Object[] objectAarray = al.toArray();
	      int length = objectAarray.length;;
	      String [] stringArray = new String[length];
	      for(int i =0; i < length; i++) {
	         stringArray[i] = (String) objectAarray[i];
	      }
	      System.out.println("Contents of the array: \n"+Arrays.toString(stringArray));
	   }
}  
 