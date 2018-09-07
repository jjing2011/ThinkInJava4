package com.mycompany.ThinkInJava4;

public class CastingAndRounding {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fAbove = 0.7F, fBelow = 0.4F;

        System.out.println((int)above);
        System.out.println((int)below);
        System.out.println((int)fAbove);
        System.out.println((int)fBelow);

        System.out.println(Math.round(above));
        System.out.println(Math.round(below));
        System.out.println(Math.round(fAbove));
        System.out.println(Math.round(fBelow));
    }
}
