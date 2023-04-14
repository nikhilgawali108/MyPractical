package com.company;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            //  user  input
            System.out.print("Enter marks for Subject 1: ");
            int sub1 = s.nextInt();

            System.out.print("Subject 2: ");
            int sub2 = s.nextInt();

            System.out.print("Subject 3: ");
            int sub3 = s.nextInt();

            // Calculate the total marks
            int total = sub1 + sub2 + sub3;

            // Check if the student has passed
            if (total <= 50) {
                throw new Exception("You Failed");
            } else {
                // Determine the grade
                if (total > 280) {
                    System.out.println("Grade is A");
                } else if (total > 200) {
                    System.out.println("Grade is B");
                } else if (total > 150) {
                    System.out.println("Grade is C");
                } else {
                    System.out.println("Grade is D");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

