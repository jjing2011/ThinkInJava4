package com.mycompany.ThinkInJava4;

class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

class Peeler {
    static Apple peel(Apple apple) {
        return apple;
    }
}

class Person {
    static void eat(Apple apple) {
        Apple peeled = apple.getPeeled();
        System.out.println("Yumy!");
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

}
