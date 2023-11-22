package com.java.day3;

import java.util.ArrayList;
import java.util.Iterator;  
class Collection1{  
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
	list.add("Ravi");//Adding object in arraylist  
	list.add("Vijay");  
	list.add("Ravi");  
	list.add("Ajay");  
	//Traversing list through Iterator  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  //checking next item is there or not
	System.out.println(itr.next());  
}  
}  
}