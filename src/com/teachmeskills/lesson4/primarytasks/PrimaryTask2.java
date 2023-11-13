package com.teachmeskills.lesson4.primarytasks;

import java.util.Scanner;

public class PrimaryTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 0; i < size; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        double average = (double) sum / size;

        System.out.println("Minimal number: " + max);
        System.out.println("Maximal number: " + min);
        System.out.println("Average: " + average);
    }
}
