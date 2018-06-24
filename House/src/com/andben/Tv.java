package com.andben;

public class Tv {
    private int size;
    private Boolean powerOn;

    public Tv(int size) {
        this.size = size;
        this.powerOn = false;
    }

    public void changePower(Boolean powerOn) {
        this.powerOn = powerOn;
    }

    public Boolean getPowerOn() {
        return powerOn;
    }
}
