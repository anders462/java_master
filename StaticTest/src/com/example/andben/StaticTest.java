package com.example.andben;

public class StaticTest {
    private static int numInstances = 0;
    final private int instanceNo;
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++;
        this.instanceNo = numInstances;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public int getInstanceNo() {
        return instanceNo;
    }

    public String getName() {
        return name;
    }
}
