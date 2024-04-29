package com.java.day10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AllExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Division by zero (ArithmeticException)
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        try {
            // Null pointer access (NullPointerException)
            String str = null;
            int length = str.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        }

        try {
            // Array index out of bounds (ArrayIndexOutOfBoundsException)
            int[] numbers = { 1, 2, 3 };
            int value = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        try {
            // InputMismatchException (non-integer input)
            System.out.print("Enter an integer: ");
            int userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: " + e.getMessage());
            scanner.next(); // Consume the invalid input
        }

        try {
            // NumberFormatException (invalid integer conversion)
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }

        System.out.println("Program continues after handling exceptions.");
        scanner.close();
    }
}
