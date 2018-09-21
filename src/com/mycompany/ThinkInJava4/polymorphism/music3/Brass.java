package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Brass extends Wind {
    @Override
    void play(Note n) {
        Print.print("Brass.play()" + n);
    }
    @Override
    void adjust() {
        Print.print("Adjusting Brass");
    }
}
