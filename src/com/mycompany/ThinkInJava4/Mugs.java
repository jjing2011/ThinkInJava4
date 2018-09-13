package com.mycompany.ThinkInJava4;

class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug mug1;
    Mug mug2;
    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("mug1 & mug2 initialized");
    }

    Mugs() {
        System.out.println("Mugs()");
    }

    Mugs(int i) {
        System.out.println("Mugs(int)");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        new Mugs();
        System.out.println("new Mugs() completed");
        new Mugs(1);
        System.out.println("new Mugs(1) completed");

        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;

        a2 = a1;

        for(int i = 0; i < a2.length; i++) {
            a2[i] += 1;
        }
        for(int i = 0; i < a2.length; i++) {
            System.out.println(i + ": " + a1[i]);
        }
    }
}
