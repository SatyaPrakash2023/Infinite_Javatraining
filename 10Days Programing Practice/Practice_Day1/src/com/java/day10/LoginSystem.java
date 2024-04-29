package com.java.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a HashMap to store username-password pairs
        Map<String, String> credentials = new HashMap<>();
        credentials.put("rama", "123");
        credentials.put("lakhsman", "456");
        credentials.put("sita", "789");

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();
        
        if (credentials.containsKey(username)) {
            System.out.print("Enter your password: ");
            String password = scanner.nextLine();
            
            if (credentials.get(username).equals(password)) {
                System.out.println("Correct credentials. Welcome, " + username + "!");
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("User not found.");
        }
    }
}
