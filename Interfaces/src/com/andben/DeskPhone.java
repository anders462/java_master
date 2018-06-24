package com.andben;

public class DeskPhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No power needed for desk phone");

    }

    @Override
    public void dial(int number) {
        System.out.println("Calling " + number);

    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int number) {
        if (number == myNumber) {
            isRinging = true;
            System.out.println("Ring ring");
        } else {
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
