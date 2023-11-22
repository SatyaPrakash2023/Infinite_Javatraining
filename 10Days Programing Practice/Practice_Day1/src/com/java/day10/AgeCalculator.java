package com.java.day10;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birthdate (yyyy-MM-dd): ");
        String bdate = scanner.nextLine();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date birthdate = date.parse(bdate);

            Date currentDate = new Date(); 
		// Current date

            int age = calculateAge(birthdate, currentDate);
            System.out.println("Your age is: " + age + " years.");
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

    }

    public static int calculateAge(Date birthdate, Date currentDate) {
        long diff = currentDate.getTime() - birthdate.getTime();
        long diffDays = diff / (24 * 60 * 60 * 1000);
        int age = (int) (diffDays / 365); 
        return age;
    }
}
