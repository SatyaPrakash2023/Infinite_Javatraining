package com.java.day1;

class Animal{								//first we have a class name Animal
	public void makeSound() {
		System.out.println("Animal Makes Sound");	//Animal Class Have a method makeSound()
	}
	
}
class Dog extends Animal{						//Second Dog class inherit property and method of 
	public void dogsound() {							//Animal class by the help of extends key word 
		System.out.println("Dog makes Sound vou vou...");
	}
}


public class Inheritance {
	public static void main(String[] args) {
		Dog d= new Dog();			//Creating object of dog class 
		d.dogsound();				//calling methods of both the class by object
		d.makeSound();
	}
}
