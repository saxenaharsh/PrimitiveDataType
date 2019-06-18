package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myValue = 10000;
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        int myTotal = (myMinValue/2);
        System.out.println("My Total = " + myTotal);

        byte myByteMinValue = -128;
        byte myByteMaxValue = 127;

        byte myByteValue = (byte) (myByteMinValue/2);
        System.out.println("My Byte Value = " + myByteValue);

        short myShortMinValue = -32768;
        short myShortMaxValue = 32767;

        short myShortTotal = (short)(myShortMaxValue/2);
        System.out.println("My short value = " + myShortTotal);

        long myLongMinValue = -9_223_372_036_854_775_808L;
        long myLongMaxValue = 9_223_372_036_854_775_807L;
        System.out.println("My Long Value is = " + myLongMaxValue);



    }
}
