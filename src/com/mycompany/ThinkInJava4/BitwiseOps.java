package com.mycompany.ThinkInJava4;

public class BitwiseOps {
    public static void main(String[] args) {
        int i1 = 0xf0;
        int i2 = 0x11;

        System.out.println("i1: " + Integer.toBinaryString(i1));
        System.out.println("i2: " + Integer.toBinaryString(i2));

        System.out.println("i1 & i2: " + Integer.toBinaryString(i1&i2));
        System.out.println("i1 | i2: " + Integer.toBinaryString(i1|i2));
        System.out.println("i1 ~ i2: " + Integer.toBinaryString(i1^i2));
        System.out.println("~i1: " + Integer.toBinaryString(~i1));
        System.out.println("~i2: " + Integer.toBinaryString(~i2));


    }
}
