package com.java.day3;

import java.util.*;  
public class Collection3{  
	public static void main(String args[]){  
	 
	String[] array={"Java","Python","PHP","C++","DotNet"}; //Creating Array  of string type 
	System.out.println("Printing Array: "+Arrays.toString(array));  

	List<String> list=new ArrayList<String>();  //create a list
	for(String lang:array){  //iterate array
	list.add(lang);  //Adding all the element of array to list 
	}  
	System.out.println("Printing List: "+list);  //print the list
	  
	}  
}  