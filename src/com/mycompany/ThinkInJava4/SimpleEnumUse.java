package com.mycompany.ThinkInJava4;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.MEDIUM;
        System.out.println(howHot);

        for(Spiciness s: Spiciness.values()) {
            System.out.println(s + " ordinal " + s.ordinal());
        }
    }
}
