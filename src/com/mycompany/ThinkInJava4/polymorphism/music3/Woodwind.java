package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Woodwind extends Wind {
    @Override
    void play(Note n) {
        Print.print("Woodwind.play()" + n);
    }
    @Override
    String what() {
        return "Woodwind";
    }
}
