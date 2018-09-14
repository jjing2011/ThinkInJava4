package com.mycompany.ThinkInJava4;

public class PrintTest {
    public static void main(String[] args) {
        Print.print();
        Print.print(3.14);

        for(int i : Range.range(2, 20, 2)) {
            Print.print(i);
        }
    }
}
