package com.mycompany.ThinkInJava4;

class Insect {
    private int i = 0;
    protected int j;
    Insect() {
        Print.print("i = " + i + " j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static.x1 initialized");

    static int printInit(String s) {
        Print.print(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        Print.print("k = " + k);
        Print.print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        Print.print("Beetle constructor");
        Beetle b = new Beetle();
    }

}
