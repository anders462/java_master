package com.andben;

public class Main {

    public static void main(String[] args) {
        Printer myPrinter = new Printer(02, true, 0);

        myPrinter.fillToner(3);
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.fillToner(100);
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();
        myPrinter.print();

    }
}
