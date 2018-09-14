package com.mycompany.ThinkInJava4;

class Sundae {
    private Sundae() {}
    static Sundae makeASundae() {
        return new Sundae();
    }
}

public class IceCream {
    public static void main(String[] args) {
        Sundae sundae = Sundae.makeASundae();
    }
}
