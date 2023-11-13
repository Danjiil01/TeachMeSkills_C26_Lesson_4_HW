package com.teachmeskills.lesson4.primarytasks;

import java.util.Scanner;
import java.util.Arrays;

public class PrimaryTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the number you want to delete: ");
        int toRemove = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != toRemove) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There is no such number in array");
            return;
        }

        int[] newArray = new int[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] != toRemove) {
                newArray[index] = array[i];
                index++;
            }
        }

        System.out.println("New array:");
        System.out.println(Arrays.toString(newArray));
    }
}
