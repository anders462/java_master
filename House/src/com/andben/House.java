package com.andben;


public class House {

    private  Kitchen kitchen;
    private  LivingRoom livingRoom;

    public House(Kitchen kitchen, LivingRoom livingRoom) {
        this.kitchen = kitchen;
        this.livingRoom = livingRoom;
    }

    public void changePower(boolean powerOn) {
        System.out.println("Stove is on " + this.kitchen.getStove().getPowerOn());
        System.out.println("Tv is on " + this.livingRoom.getTv().getPowerOn());
        this.kitchen.getStove().changePower(powerOn);
        this.livingRoom.getTv().changePower(powerOn);
        System.out.println("Stove is on " + this.kitchen.getStove().getPowerOn());
        System.out.println("Tv is on " + this.livingRoom.getTv().getPowerOn());
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
}
