package com.andben;

public class Main {
    public static int Sum(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public static double Remainder(double arg1, double arg2) {
        return arg1 % arg2;
    }

    public static void main(String[] args) {
        int result = 1 + 2;
        int prev = result;
        result = Sum(result, 10);
        System.out.println(result);

        if ((prev >= result) && (prev > 0))
            System.out.printf("prev " + prev + " is larger or equal then result " + result);
        else
            System.out.printf("prev " + prev + " is smaller then result " + result);

        double first = 20d;
        double second = 80d;

        double total = (first + second) * 25;
        double remainder = Remainder(total, 40);

        if (remainder <= 20)
            System.out.printf("\nTotal " + remainder + " was over the limit");



    }
}
