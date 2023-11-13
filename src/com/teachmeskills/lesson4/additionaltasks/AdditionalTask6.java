package com.teachmeskills.lesson4.additionaltasks;

import java.util.Arrays;

public class AdditionalTask6 {

    public static void main(String[] args) {
        String[] names = {"Eva", "Alice", "Charlie", "Bob", "David","Daniel", "Alex", "Petr", "Aleks"};

        System.out.println("Unsorted array: " + Arrays.toString(names));

        Arrays.sort(names);

        System.out.println("Sorted array: " + Arrays.toString(names));
    }

}
