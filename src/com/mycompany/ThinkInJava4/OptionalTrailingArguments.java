package com.mycompany.ThinkInJava4;

public class OptionalTrailingArguments {
    static void f(int required, String... trailing) {
        System.out.print("required: " + required + " ");
        for(String s: trailing) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    static void g(Character... args) {
        System.out.println(args.getClass());
        System.out.println("Length is " + args.length);
    }

    static void h(int... args) {
        System.out.println(args.getClass());
        System.out.println("Length is " + args.length);
    }

    public static void main(String[] args) {
        f(1, "one");
        f(2, "one", "two");
        f(3, "one", "two", "three");
        f(4);

        g('a');
        g();

        h(1);
        h();
    }
}
