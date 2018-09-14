package com.mycompany.ThinkInJava4;

class Art {
    Art() { Print.print("Art() constructor"); }
}

class Drawing extends Art {
    Drawing() { Print.print("Drawing() constructor"); }
}

public class Cartoon extends Drawing {
    Cartoon() { Print.print("Cartoon() constructior"); }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
