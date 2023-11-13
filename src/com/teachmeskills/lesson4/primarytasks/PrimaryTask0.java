package com.teachmeskills.lesson4.primarytasks;

import java.util.Scanner;

public class PrimaryTask0 {

    public static void main(String[] args) {
        int[] array = {1193, 2092, 123, 985, 592, 2381, 82994, 1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int searchNum = sc.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == searchNum) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("This number is in array");
        } else {
            System.out.println("There is no such number in this array");
        }
    }

}
