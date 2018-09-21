package com.mycompany.ThinkInJava4.polymorphism.shape;

import com.mycompany.ThinkInJava4.Print;

public class Triangle extends Shape {
    @Override
    public void draw() {
        Print.print("Triangle.draw()");
    }

    @Override
    public void erase() {
        Print.print("Triangle.erase()");
    }
}
