package com.java.cols;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1,"Avesh",48234));
		employList.add(new Employ(2,"Rakesh",48264));
		employList.add(new Employ(3,"Satya",68234));
		employList.add(new Employ(4,"Prakash",78234));
		employList.add(new Employ(5,"Rahul",28234));
		
		employList.stream().filter((e) ->e.getBasic()>=50000).forEach(x->{
			System.out.println(x);
		});
		
		System.out.println("Names start with A");
		employList.stream().filter((e)->e.getName().startsWith("A")).forEach(System.out::println);
	}

}
