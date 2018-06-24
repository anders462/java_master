package com.andben;

import java.util.ArrayList;

public class GearBox {
    private ArrayList<Gear> gears;
    private int noGears;
    private int currentGear;
    private boolean clutchIsIn;

    public GearBox(int noGears) {
        this.noGears = noGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int gearNumber, double ratio) {
        if (gearNumber > 0 && gearNumber <= noGears ) {
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >=0 &&  newGear <= noGears && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear is now " + this.currentGear);
        } else {
            System.out.println("Grind....");
        }
    }

    public double wheelSpeed(int revs) {
        if (!this.clutchIsIn && this.currentGear < this.gears.size()) {
            return this.gears.get(this.currentGear).driveSpeed(revs);
        } else {
            return 0.0;
        }
    }

    //inner class has its own scope
    private class Gear {
            private int gearNumber;
            private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
