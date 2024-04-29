package com.java.day3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Collection8 {	  
	public static void main(String args[]){  
		 //Creating HashSet and adding elements  
		  LinkedHashSet<String> set=new LinkedHashSet();  
		  set.add("One");    
          set.add("Two");    
          set.add("Three");   
          set.add("Four");  
          set.add("Five"); 
          set.add("Satya");
          set.add("Rahul");
          Iterator<String> it=set.iterator();  
          while(it.hasNext())  //checking next item presentor not
          {  
        	  System.out.println(it.next());  
          }             
		 }  	 
		  
}
