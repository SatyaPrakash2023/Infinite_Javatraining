package com.java.day9;

public class ConstructorEx{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    ConstructorEx(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    ConstructorEx(int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    ConstructorEx s1 = new ConstructorEx(111,"Karan");  
    ConstructorEx s2 = new ConstructorEx(222,"Aryan",25);  
    s1.display();  
    s2.display();  
   }  
}  
