package com.andben;


    class Car {
        private String name;
        private int wheels;
        private int cylinders;
        private Boolean engine;

        public Car(String name, int cylinders) {
            this.name = name;
            this.wheels = 4;
            this.cylinders = cylinders;
            this.engine = true;
        }

        public String getName() {
            return name;
        }

        public int getWheels() {
            return wheels;
        }

        public int getCylinders() {
            return cylinders;
        }

        public Boolean getEngine() {
            return engine;
        }

        public void brake() {
            System.out.println("Car is breaking");
        }

        public void startEngine() {
            System.out.println("Car starts engine");
        }

        public void accelerate() {
            System.out.println("Car accelerates");
        }
    }

    class Volvo extends Car {
        public Volvo(String name, int cylinders) {
            super(name, cylinders);
        }


        public void brake() {
            System.out.println("Volvo is breaking");
        }

        public void startEngine() {
            System.out.println("Volvo starts engine");
        }

        public void accelerate() {
            System.out.println("Volvo accelerates");
        }
    }

    class Bmw extends Car {
        public Bmw(String name, int cylinders) {
            super(name, cylinders);
        }

        @Override
        public void brake() {
            super.brake();
        }
    }

public class Main {


    public static void main(String[] args) {

        Volvo myVolvo = new Volvo("Amazon 323", 4);
        Bmw mariaBmw = new Bmw("525i", 6);

        myVolvo.brake();
        mariaBmw.brake();
        mariaBmw.accelerate();


    }
}
