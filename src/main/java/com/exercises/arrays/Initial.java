package com.exercises.arrays;

// Create an array and initialize it with the days of the week
// Create an array and initialize it with numbers, 1-10.
public class Initial {
    public static void main(String[] args) {
        String[] daysOfWeek = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Number items in the array daysOfWeek: " + daysOfWeek.length);
        System.out.printf("The 4th day in the array is %s", daysOfWeek[3]);

        System.out.println("\n--------------------------------------------------------------");

        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.printf("The number is %s", numbers[5]);
    }
}
