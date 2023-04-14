package com.company;

import java.util.Scanner;

public class OddEven extends Thread {

    private int num;

    public OddEven(int num) {
        this.num = num;
    }

    public void run() {
        if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s.nextInt();

        OddEven thread = new OddEven(num);
        thread.start();
    }
}
