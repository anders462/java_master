package com.andben;

public class Stove {
    private int size;
    private Boolean powerOn;

    public Stove(int size) {
        this.size = size;
        this.powerOn = false;
    }

    public void changePower(Boolean powerOn) {
        this.powerOn = powerOn;
    }

    public Boolean getPowerOn() {
        return powerOn;
    }

    public int getSize() {
        return size;
    }
}
