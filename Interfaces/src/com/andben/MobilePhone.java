package com.andben;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isPowerOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Power is on");
        isPowerOn = true;

    }

    @Override
    public void dial(int number) {
        if (isPowerOn) {
            System.out.println("Calling " + number);

        } else {
            System.out.println("Power is off");
        }
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
        if (number == myNumber && isPowerOn) {
            isRinging = true;
            System.out.println("melody ring");
        } else {
            System.out.println("Mobile not on or wrong number");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
