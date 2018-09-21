package com.mycompany.ThinkInJava4.polymorphism.shape;

import com.mycompany.ThinkInJava4.Print;

public class Square extends Shape {
    @Override
    public void draw() {
        Print.print("Square.draw()");
    }

    @Override
    public void erase() {
        Print.print("Square.erase()");
    }
}
