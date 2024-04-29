package com.java.day5;

import java.util.LinkedList;

 public class Collection2 {
  public static void main(String[] args){
    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // add() method without the index parameter
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    // add() method with the index parameter
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
    String str = animals.get(1);
    System.out.print("Element at index 1: " + str);
    String str1 = animals.remove(1);
    System.out.println("Removed Element: " + str1);
 // remove the first element
    animals.removeFirst();
    System.out.println("LinkedList after removeFirst(): " + animals);
    System.out.println(animals.peek());
    
    for(String animal: animals) {
        System.out.print(animal);
        System.out.print(", ");
    }
  }
}