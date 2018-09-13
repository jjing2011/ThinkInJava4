package com.mycompany.ThinkInJava4;

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void h(Character... args) {
        System.out.println("second");
    }

    public static void main(String[] args) {
        f(1);
        f(1, 'a');
        f('a', 'b');

    }

}
