package com.company;

public class Average {
    public static void main(String[] args) {
        // Create the threads
        Thread avg = new AverageThread();
        Thread sq = new SquareThread();

        // Start the threads
        avg.start();
        sq.start();
    }
}

class AverageThread extends Thread {
    @Override
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }
        double average = (double) sum / 50;
        System.out.println("The average of the first 50 numbers is " + average);
    }
}

class SquareThread extends Thread {
    private int[] arr = {10, 15, 20, 25, 30};

    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
            int square = arr[i] * arr[i];
            System.out.println("The square of " + arr[i] + " is " + square);
        }
    }
}

