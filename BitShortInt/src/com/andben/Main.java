package com.andben;

public class Main {

    public static void main(String[] args) {

    //long has length of 64 bits (8Bytes)
    long maxLong = 9_223_372_036_854_775_807L;
    long minLong = -9_223_372_036_854_775_808L;

	//int has a length of 32 bits (4 Bytes)
    int maxInt = 2_147_483_647;
    int minInt = -2_147_483_648;

    //short has a length of 16 bits (2 Bytes)
    short maxShort = 32767;
    short minShort = -32767;

    //byte has a length of 8 bits (1 Byte)
    byte maxByte = 127;
    byte minByte = -128;

    byte newByte = (byte) (maxByte / 2); //casting to byte as Java convert 2 to the default int

        System.out.println(maxLong + minLong);

    }

}
