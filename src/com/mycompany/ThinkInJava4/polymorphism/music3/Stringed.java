package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Stringed extends Instrument {
    @Override
    void play(Note n) {
        Print.print("Stringed.play()" + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        Print.print("Adjusting Stringed");
    }
}
