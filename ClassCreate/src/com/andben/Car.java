package com.andben;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String color;
    private String engine;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("bmw 525i")) {
            this.model = model;
        } else {
            this.model = "invalid";
        }
    }

    public String getModel() {
        return this.model;
    }


}
