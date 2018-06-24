package com.andben;

public class Printer {
    private int tonerLevel = 100;
    private boolean duplex;
    private int pagesPrinted = 0;

    public Printer(int tonerLevel, boolean duplex, int pagesPrinted) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.pagesPrinted = pagesPrinted;
    }

    public void fillToner(int toner) {
        if (toner + this.tonerLevel <= 100) {
            this.tonerLevel += toner;
        } else {
            this.tonerLevel = 100;
        }
        System.out.println("Printer toner level is " + this.tonerLevel + "%");
    }

    public void print() {
        if (this.tonerLevel > 0) {
            this.pagesPrinted += 1;
            this.tonerLevel -= 1;
            System.out.println("Printing ... total pages printed is "
                    + this.pagesPrinted
                    + " toner level at " + this.tonerLevel + "%");
        } else {
            System.out.println("Toner is empty, fill toner");
        }

    }
}
