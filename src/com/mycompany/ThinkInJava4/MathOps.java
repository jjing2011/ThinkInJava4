package com.mycompany.ThinkInJava4;

import java.util.*;

public class MathOps {
    public static void main(String[] args) {
        //Create a seeded random number generator
        Random rand = new Random(47);
        int j, k;

        j = rand.nextInt(100) + 1;
        System.out.println("j: " + j);

        k = rand.nextInt(100) + 1;
        System.out.println("k: " + k);

        float u, v;

        u = rand.nextFloat();
        System.out.println("k: " + u);

        v = rand.nextFloat();
        System.out.println("v: " + v);

    }
}
