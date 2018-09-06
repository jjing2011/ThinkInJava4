package com.mycompany.ThinkInJava4;

import java.util.*;

class Coin {
    boolean side;
}

public class CoinFlipping {
    public static void main(String[] args) {
        Coin c = new Coin();

        Random rand = new Random(47);

        c.side = rand.nextBoolean();
        System.out.println(c.side);

        c.side = rand.nextBoolean();
        System.out.println(c.side);

        c.side = rand.nextBoolean();
        System.out.println(c.side);

    }
}
