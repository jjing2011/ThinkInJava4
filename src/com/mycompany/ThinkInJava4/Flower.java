package com.mycompany.ThinkInJava4;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        this.petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount = " + this.petalCount);
    }

    Flower(String ss) {
        System.out.println("Constructor w/ string arg only, s = " + ss);
        this.s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        this.s = s;
        System.out.println("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }

    void printPetalCount() {
        System.out.println("petalCount = " + this.petalCount + "s = " + this.s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
