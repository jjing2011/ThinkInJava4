package com.mycompany.ThinkInJava4.interfaces.music5;

import com.mycompany.ThinkInJava4.polymorphism.music3.Note;
import com.mycompany.ThinkInJava4.Print;

interface Instrument {
    int VALUE = 5;
    void play(Note n);
    void adjust();
}

class Wind implements Instrument {
    public void play(Note n) {
        Print.print(this + ".play()." + n);
    }
    public String toString() {
        return "Wind";
    }
    public void adjust() {
        Print.print(this + ".adjust()");
    }
}

class Percussion implements Instrument {
    public void play(Note n) {
        Print.print(this + ".play()." + n);
    }
    public void adjust() {
        Print.print(this + ".adjust()");
    }
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {
    public void play(Note n) {
        Print.print(this + ".play()." + n);
    }
    public void adjust() {
        Print.print(this + ".adjust()");
    }
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    public String toString() {
        return "Woodwind";
    }
}

public class Music5 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for(Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
