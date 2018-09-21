package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Wind extends Instrument {
    @Override
    void play(Note n) {
        Print.print("Wind.play()" + n);
    }
    @Override
    String what() {
        return "Wind";
    }
    @Override
    void adjust() {
        Print.print("Adjusting wind");
    }
}
