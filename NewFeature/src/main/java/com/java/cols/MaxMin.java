package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Avesh",48234));
		employList.add(new Employ(2,"Rakesh",48264));
		employList.add(new Employ(3,"Satya",68234));
		employList.add(new Employ(4,"Prakash",78234));
		employList.add(new Employ(5,"Rahul",28234));
		
		Employ employMax = employList.stream().max((m1,m2) ->
		m1.getBasic()>m2.getBasic()?1 :-1).get();
		System.out.println("Employ with Max basic ");
		System.out.println(employMax);
		
		System.out.println("Employ With min basic ");
		Employ employMin = employList.stream().min((m1,m2) ->
		m1.getBasic()>m2.getBasic()?1 :-1).get();
		
		System.out.println(employMin);
	    
		
	}

}
