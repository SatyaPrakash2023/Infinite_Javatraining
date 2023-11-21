package com.java.cols;

import java.util.Optional;

public class OptionalExample {
	
	public static void main(String[] args) {
		String[] str = new String[10];
			str[0]="Rahul";
			str[1]="Sourabh";
			str[2]="Naresh";
			str[3]="Satya";
			str[4]="Naresh";
			str[5]="Nagesh";
			str[6]="Ariz";
			
		
		Optional<String> result=Optional.ofNullable(str[8]);
		if(result.isPresent()) {
			System.out.println(str[8]);
		}else {
			System.out.println("Value is not available in the index...");
		}
	}

}
