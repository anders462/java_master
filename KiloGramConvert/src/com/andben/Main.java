package com.andben;

public class Main {

    public static void main(String[] args) {
        double convFactor = 0.45359237d;
        double pounds = 200d;

        double inKiloGrams = pounds * convFactor;

        System.out.println(inKiloGrams);

    }
}
