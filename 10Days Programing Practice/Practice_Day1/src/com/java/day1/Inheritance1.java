package com.java.day1;

class Animal1 {
    String name;
    
    Animal1(String name) {		//creating constructor which taking one parameter is name String type
        this.name = name;		//constructor create instance of class also work as a special method to intialize object
    }
    
    void eat() {
        System.out.println(name + " is eating.");
    }
}

class Bird extends Animal1 {				//Bird class inherited from Animal1 class
    Bird(String name) {				
        super(name);	//super keyword refers the supper class of current class
    }
    
    void fly() {
        System.out.println(name + " is flying.");
    }
}

class Mammal extends Animal1 {
    Mammal(String name) {
        super(name);
    }
    
    void run() {
        System.out.println(name + " is running.");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        Bird eagle = new Bird("Eagle");		
        Mammal lion = new Mammal("Lion");
        
        eagle.eat();
        eagle.fly();
        
        lion.eat();
        lion.run();
    }
}