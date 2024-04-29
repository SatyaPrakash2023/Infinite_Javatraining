package com.java.day1;

 interface Arithmatic {
	  public void sum(); 
	   
	}
public class Demo implements Arithmatic{
		public void sum(){
			int a=5;
			int b=7;
			int c=a+b;
			System.out.println(c);
		}
		
		public static void main(String[] args) {
			Demo obj = new Demo();
			obj.sum();
		}
	}

