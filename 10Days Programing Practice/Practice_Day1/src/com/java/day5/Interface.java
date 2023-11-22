package com.java.day5;

public interface Interface { 
		void print();  
	}  
class first implements Interface{  
	public void print(){
		System.out.println("Hello inside class");
	}  
		  
	public static void main(String args[]){  
		first obj = new first();  
		obj.print();  
		   
	}  
}
