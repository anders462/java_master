package com.andben;

public class Main {

    public static void main(String[] args) {
        int inches = 10;
        String msg;

        double result = convertToCentimeters(inches);
        if (result >= 0) {
            msg = "There are " + result + " centimeters in " + inches + " inches";
        } else {
            msg = inches + " negative inches in invalid";
        }


        System.out.printf(msg);

    }

    public static double convertToCentimeters(double feet, double inch) {
        if (feet < 0 || (inch < 0 || inch >12))
            return -1;

        return (feet * 12 + inch) * 2.54;

    }


    public static double convertToCentimeters(double inch) {
        if (inch < 0 )
            return -1;

        double feet = (int) inch / 12;
        double inches = (int) inch % 12;
        return convertToCentimeters(feet, inches);

    }

}
