package com.example.andben;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number");
        X x = new X(x());
        x.x();

    }

    private static int x() {
        Scanner x = new Scanner(System.in);
        return x.nextInt();
    }

}
