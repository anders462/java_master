package com.andben;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar = '\u00A9';
        char registered = '\u00AE';
        System.out.println(myChar + " " + registered);

        // width of 1 bit
        boolean myBoolean = true;

    }
}
