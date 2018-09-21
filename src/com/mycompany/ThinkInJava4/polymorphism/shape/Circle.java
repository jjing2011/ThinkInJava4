package com.mycompany.ThinkInJava4.polymorphism.shape;

import com.mycompany.ThinkInJava4.Print;

public class Circle extends Shape {
    @Override
    public void draw() {
        Print.print("Circle.draw()");
    }
    @Override
    public void erase() {
        Print.print("Circle.erase()");
    }
}
