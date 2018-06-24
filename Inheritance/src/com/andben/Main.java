package com.andben;

public class Main {

    public static void main(String[] args) {

    Animal someAnimal = new Animal("default", 1, 1, 1, 1);

//    someAnimal.eat();

    Dog fido = new Dog("poudle", 3, 30, 2, 4, 1, 22, "curly");

    fido.eat();

    fido.run();
    fido.walk();
    }
}
