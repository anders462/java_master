package com.andben;

public class Main {

    public static void main(String[] args) {
        int testInt = 11;

        if (testInt > 10) {
            System.out.printf("Larger");
            System.out.printf("prints as well");
        } else if (testInt < 10) {
            System.out.printf("Smaller");
        } else {
            System.out.println("Equal");
        }

    }
}
