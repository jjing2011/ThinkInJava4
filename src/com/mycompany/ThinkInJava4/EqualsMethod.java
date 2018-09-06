package com.mycompany.ThinkInJava4;

class Dog {
    String name;
    String says;
}

public class EqualsMethod {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.name = "Spot";
        d1.says = "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";

        System.out.println("Dog " + d1.name + " says " + d1.says);
        System.out.println("Dog " + d2.name + " says " + d2.says);

        Dog d3 = d1;

        System.out.println(d3 == d1);
        System.out.println(d1.equals(d3));
    }

}
