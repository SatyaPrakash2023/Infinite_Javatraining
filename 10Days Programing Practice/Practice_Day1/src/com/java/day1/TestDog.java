package com.java.day1;

class Animalx {
	   public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dogx extends Animalx {
	   public void move() {
	      super.move();   // invokes the super class method
	      System.out.println("Dogs can walk and run");
	   }
	}

	public class TestDog {

	   public static void main(String args[]) {
	      Animalx b = new Dogx();   // Animal reference but Dog object
	        b.move(); // runs the method in Dog class
	   }
	}