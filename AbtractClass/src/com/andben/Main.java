package com.andben;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Boxer");

        dog.breath();
        dog.eat();
        System.out.println(dog.getName());

        Parrot parrot = new Parrot("Parrot");

        parrot.breath();
        parrot.eat();
        parrot.fly();

    }
}
