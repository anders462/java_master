package com.example.andben;

public class Main {

    public static void main(String[] args) {
	// write your code here

        StaticTest first = new StaticTest("first");
        StaticTest second = new StaticTest("second");

        System.out.println(first.getName() + " instance number " + first.getInstanceNo() + " total " + StaticTest.getNumInstances());
        System.out.println(second.getName() + " instance number " + second.getInstanceNo() + " total " + StaticTest.getNumInstances());
    }
}
