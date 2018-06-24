package com.andben;

public class Main {

    public static void main(String[] args) {
        byte age = 12;
        short grams = 13000;
        int salary = 1859050;

        long sum = 50000L + 10 * (age + grams + salary);
        short total = (short) (1000 + (age + grams));
        System.out.println(" Long sum is: " + sum + "\n Short total sum is: " + total);
    }
}
