package com.andben;

public class Kitchen {
    private Stove stove;
    private int zink;
    private int numberWindows;
    private HouseWindow houseWindow;
    private HouseDoor houseDoor;


    public Kitchen(int numberWindows) {
        this.stove = new Stove(2);
        this.zink = 1;
        this.numberWindows = numberWindows;
        this.houseWindow = new HouseWindow(8);
        this.houseDoor = new HouseDoor(4);

    }

    public Boolean isPowerOn() {
        return this.stove.getPowerOn();
    }

    public Stove getStove() {
        return stove;
    }
}
