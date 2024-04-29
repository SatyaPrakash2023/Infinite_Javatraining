package com.java.day5;

import java.util.HashSet;
import java.util.Iterator;

 public class Collection3 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("HashSet: " + numbers);

        // Calling iterator() method
        Iterator<Integer> iterate = numbers.iterator();
        System.out.print("HashSet using Iterator: ");
        // Accessing elements
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        
        boolean value1 = numbers.remove(5);
        System.out.println("Is 5 removed? " + value1);
        
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        System.out.println("HashSet2: " + numbers);
        System.out.println(numbers.size());
        
        
        boolean value2 = numbers.removeAll(numbers);
        System.out.println("Are all elements removed? " + value2);
    }
}