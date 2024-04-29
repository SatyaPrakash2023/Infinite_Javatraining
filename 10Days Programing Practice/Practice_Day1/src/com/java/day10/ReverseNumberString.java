package com.java.day10;

import java.util.Scanner;

public class ReverseNumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reverse a string
        System.out.print("Enter a string to reverse: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseString(inputString);
        System.out.println("Reversed String: " + reversedString);

        // Reverse a number
        System.out.print("Enter a number to reverse: ");
        int inputNumber = scanner.nextInt();
        int reversedNumber = reverseNumber(inputNumber);
        System.out.println("Reversed Number: " + reversedNumber);

       
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
