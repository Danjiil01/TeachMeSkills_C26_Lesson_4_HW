package com.teachmeskills.lesson4.primarytasks;

import java.util.Arrays;

public class PrimaryTask3 {

    public static void main(String[] args) {
        int[] arr1 = {111, 298, 33, 41, 52};
        int[] arr2 = {508, 641, 731, 844, 909};
        double avg1 = Arrays.stream(arr1).average().getAsDouble();
        double avg2 = Arrays.stream(arr2).average().getAsDouble();
        System.out.println("Arithmetic mean of the elements of the first array: " + avg1);
        System.out.println("Arithmetic mean of the elements of the second array: " + avg2);
        if (avg1 > avg2) {
            System.out.println("The average value of the first array is greater");
        } else if (avg1 < avg2) {
            System.out.println("The average value of the second array is greater");
        } else {
            System.out.println("Averages are equal");
        }
    }

}
