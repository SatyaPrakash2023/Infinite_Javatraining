package com.java.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;  
public class Collection4{  
	public static void main(String args[]){  
		 List<String> fruitList = new ArrayList<String>();    
		 fruitList.add("Mango");    
		 fruitList.add("Banana");    
		 fruitList.add("Apple");    
		 fruitList.add("Strawberry");    
		 //Converting ArrayList to Array  
		 String[] array = fruitList.toArray(new String[fruitList.size()]);  //converting list to array  
		 System.out.println("Printing Array: "+Arrays.toString(array));  
		 System.out.println("Printing List: "+fruitList);  
	}  
}  