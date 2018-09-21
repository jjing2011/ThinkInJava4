package com.mycompany.ThinkInJava4.polymorphism.music3;

import com.mycompany.ThinkInJava4.Print;

public class Instrument {
    void play(Note n) {
        Print.print("Instrument.play()" + n);
    }
    String what() {
        return "Instrument";
    }
    void adjust()
    {
        Print.print("Adjusting instrument");
    }
}
