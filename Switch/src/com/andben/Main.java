package com.andben;

public class Main {

    public static void main(String[] args) {

        int counter = 0;

        for (int i = 1; i < 1000; i++) {
            if (isPrime(i)) {
                System.out.println("The following number is a prime " + i);
                counter++;
                if (counter >= 30) {
                    break;
                }
            }
        }
    }



    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= (long) Math.sqrt(n); i++) { //i <= n / 2
            if (n % i == 0) {
                return false;
            }
        }

        return true;

    }
}
