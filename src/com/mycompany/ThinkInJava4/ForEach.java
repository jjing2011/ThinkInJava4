package com.mycompany.ThinkInJava4;

import java.util.*;

public class ForEach {
    public static void main(String[] args) {
        Random rand = new Random(47);

        float f[] = new float[10];

        for(int i = 0; i < 10; i++)
            f[i] = rand.nextFloat();

        for(float x : f)
            System.out.println(x);

        System.out.println();

        for(char c: "Hello World".toCharArray())
            System.out.println(c);
    }
}
