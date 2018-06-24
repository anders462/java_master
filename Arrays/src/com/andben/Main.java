package com.andben;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(10);
        System.out.println("Average is = " + getAverage(myIntegers));
        printArray(sortArray(myIntegers));
    }

    public static int[] getIntegers(int number) {
        int[] values = new int[number];

        System.out.println("Enter " + number + " values to calculate average");
        for (int i = 0; i < number; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }


    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    /**
     *
     * @param array input array
     * @return An Array sorted using insertion sort. Copy of input array is done
     */


    public static int[] sortArray(int[] array) {
//        int[] sortedArray = new int[array.length];
//        for (int i = 0; i < array.length; i++) { //copy unsorted array
//            sortedArray[i] = array[i];
//        }
        int[] sortedArray = Arrays.copyOf(array, array.length);

        int mem;
        boolean  sorted = false;
        int times = 0;

        while (!sorted) {
            sorted = true;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                times++;
                if (sortedArray[i] < sortedArray[i + 1]) {
                    mem = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = mem;
                    sorted = false;
                }
            }
        }
        System.out.println("times = " + times);
        return sortedArray;
    }


    public static double getAverage(int[] values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return (double) sum / (double) values.length;
    }
}
