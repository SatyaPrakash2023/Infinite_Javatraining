package com.java.day1;

class A
{
    private int a;
    void setA()
    {
        a = 5;
    }
}
class B extends A
{
    public int b = 7;
 
    void setB()
    {
        b = b*5;
    }
}
class InheritanceMain {
    public static void main(String[] args) {
        B b = new B();
        b.setA(); //valid
       // System.out.println("a = " +b.a); //error!!!
        b.setB(); //valid
        System.out.println("b = " +b.b); //valid
    }
}