package com.java.day8;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String args[]) {
		
		//Creaint a linklist 
		LinkedList<String> al = new LinkedList<String>();
		
		//Adding element in linkedlist
//		al.add("Ravi");
//		al.add("Vijay");
//		al.add("Ravi");
//		al.add("Ajay");
		
		//Stack
		al.add("Ravi");
		al.add("Vijay");
		
		//
		
		al.remove("Ajay");
		
		//Get the list through iterotor
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
}