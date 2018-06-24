package com.example.andben;

public class ScopeCheck {
    private int privateVar = 10;
    public int publicVar = 20;

    public ScopeCheck() {
        System.out.println("publicVar = " + publicVar + " privateVar = " + privateVar);
    }
}
