package com.andben;

public class Main {

    public static void main(String[] args) {
        House myHouse;
        Kitchen kitchen = new Kitchen(2);

        myHouse = new House(kitchen, new LivingRoom(3));

        myHouse.changePower(true);

        System.out.println("Stove size is " + myHouse.getKitchen().getStove().getSize());

    }
}
