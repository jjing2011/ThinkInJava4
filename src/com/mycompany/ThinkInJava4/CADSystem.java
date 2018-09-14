package com.mycompany.ThinkInJava4;

import java.awt.*;

class Shape {
    Shape(int i) { Print.print("Shape constructor"); }
    void dispose() { Print.print("Shape dispose"); }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        Print.print("Circle constructor");
    }

    void dispose() {
        Print.print("Circle dispose");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        Print.print("Triangle constructor");
    }
    void dispose() {
        Print.print("Triangle dispose");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        Print.print("Drawing Line: " + start + ", " + end);
    }
    void dispose() {
        Print.print("Earsing Line: " + start + "," + end);
        super.dispose();
    }
}

public class CADSystem extends Shape{
    private Circle c;
    private Triangle t;
    private Line[] lines = new Line[3];

    public CADSystem(int i) {
        super(i + 1);
        for(int j = 0 ; j < lines.length ; j ++ ) {
            lines[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        Print.print("CADSystem constructor");
    }

    public void dispose() {
        Print.print("CADSystem dispose");
        t.dispose();
        c.dispose();
        for(int i = lines.length - 1 ; i >= 0 ; i--) {
            lines[i].dispose();
        }
        super.dispose();
    }

    public static void main(String[] args) {
        CADSystem x = new CADSystem(11);
        try {

        } finally {
            x.dispose();
        }
    }
}
