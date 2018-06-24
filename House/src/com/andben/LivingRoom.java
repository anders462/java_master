package com.andben;

public class LivingRoom {
    private Tv tv;
    private int sofa;
    private int numberWindows;
    private HouseWindow houseWindow;

    public LivingRoom(int numberWindows) {
        this.tv = new Tv(2);
        this.sofa = 1;
        this.numberWindows = numberWindows;
        this.houseWindow = new HouseWindow(4);
    }

    public Boolean isPowerOn() {
        return tv.getPowerOn();
    }

    public Tv getTv() {
        return tv;
    }


}
