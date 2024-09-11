package org.example;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] arg) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int sum = sumEven(numbers);
        System.out.println("Sum of even numbers: " + sum);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
}
