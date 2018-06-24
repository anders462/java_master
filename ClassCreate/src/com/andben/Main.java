package com.andben;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car toyota = new Car();

        bmw.setModel("BMW 525i");
        toyota.setModel("Totota Prius");


        System.out.println(bmw.getModel());
        System.out.println(toyota.getModel());


    }
}
