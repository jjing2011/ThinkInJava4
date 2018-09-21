package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        Print.print("Percussion.play()" + n);
    }
    @Override
    String what() {
        return "Percussion";
    }
    @Override
    void adjust() {
        Print.print("Adjusting Percussion");
    }
}
