package com.mycompany.ThinkInJava4;

class A {}

public class Varargs {
    static void printArry(Object[] args) {
        for(Object obj : args) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArry(new Object[]{new Integer(4), new Float(3.14), new Double(11.11)});
        printArry(new Object[]{"one", "two", "three"});
        printArry(new Object[]{new A(), new A(), new A()});
    }
}
