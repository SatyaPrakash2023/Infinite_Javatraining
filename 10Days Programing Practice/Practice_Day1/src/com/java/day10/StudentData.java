package com.java.day10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, StudentInfo> studentData = new HashMap<>();

        while (true) {
            System.out.println("1. Add Student Data");
            System.out.println("2. Get Student Data");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
             System.out.println("----------------------");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();
                    System.out.print("Enter CGPA: ");
                    double cgpa = scanner.nextDouble();
                    StudentInfo studentInfo = new StudentInfo(marks, cgpa);
                    studentData.put(name, studentInfo);
                    
                    break;
                case 2:
                    System.out.print("Enter student name to retrieve data: ");
                    String searchName = scanner.nextLine();
                    StudentInfo info = studentData.get(searchName);
                    if (info != null) {
                        System.out.println("Student Name: " + searchName);
                        System.out.println("Marks: " + info.getMarks());
                        System.out.println("CGPA: " + info.getCGPA());
                        System.out.println("----------------------");
                    } else {
                        System.out.println("Student data not found.");
                    }
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

class StudentInfo {
    private double marks;
    private double cgpa;

    public StudentInfo(double marks, double cgpa) {
        this.marks = marks;
        this.cgpa = cgpa;
    }

    public double getMarks() {
        return marks;
    }

    public double getCGPA() {
        return cgpa;
    }
}
