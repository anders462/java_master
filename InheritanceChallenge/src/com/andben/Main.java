package com.andben;

public class Main {

    public static void main(String[] args) {

        Prius prius = new Prius(12);

        prius.accelerate(50);

        prius.changeGear(2);
        prius.accelerate(-12);
        prius.steer(45);
        prius.accelerate(-12);
    }
}
