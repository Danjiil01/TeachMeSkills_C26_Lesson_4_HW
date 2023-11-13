package com.teachmeskills.lesson4.primarytasks;

import java.util.Scanner;
import java.util.ArrayList;

public class PrimaryTask1 {
    public static void main(String[] args) {
        int[] array = {87, 93, 103, 98, 654, 93, 77, 1204, 93};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to remove: ");
        int removeNum = sc.nextInt();
        ArrayList<Integer> newArray = new ArrayList<>();
        boolean found = false;
        for (int num : array) {
            if (num != removeNum) {
                newArray.add(num);
            } else {
                found = true;
            }
        }
        if (found) {
            System.out.println("New array without specified: " + newArray);
        } else {
            System.out.println("There is no such number in array");
        }
    }

}
