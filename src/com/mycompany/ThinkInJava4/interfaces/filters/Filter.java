package com.mycompany.ThinkInJava4.interfaces.filters;

public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public Waveform process(Waveform input) { return input; }
}

