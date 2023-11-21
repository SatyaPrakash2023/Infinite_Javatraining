package com.java.cols;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmploySort {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		
		
		employList.add(new Employ(1,"Avesh",48234));
		employList.add(new Employ(2,"Rakesh",48264));
		employList.add(new Employ(3,"Satya",68234));
		employList.add(new Employ(4,"Prakash",78234));
		employList.add(new Employ(5,"Rahul",28234));
		
		System.out.println("Sort By name-wise ");
		Collections.sort(employList,(e1,e2)->{
			return e1.getName().compareTo(e2.getName());
		});
		
		employList.forEach(System.out::println);
		
		Collections.sort(employList,(e1,e2)->{
			return (int)(e1.getBasic()-e2.getBasic());
		});
		
		System.out.println("Sort By basic ");
		employList.forEach(System.out::println);
	}
	
	

}
