package com.teachmeskills.lesson4.additionaltasks;

public class AdditionalTask5 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        for (int i = 1; i < array.length; i += 2) {
            array[i] = 0;
        }

        System.out.print("Changed array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
