package com.mycompany.ThinkInJava4;

class Soup {
    private String s;
    Soup() {
        Print.print("Soup()");
        s = "constructed";
    }

    public String toString() {
        return s;
    }

}

public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soup castille;
    private int i;
    private float toy;

    public Bath() {
        Print.print("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castille = new Soup();
    }

    { i = 47; }

    public String toString() {
        if(s4 == null) {
            s4 = "Joy";
        }

        return "s1 = " + s1 + " s2 = " + s2 + " s3 = " + s3 + " s4 = " + s4 + "\n" +
                "i = " + i + " toy = " + toy + " castille = " + castille;
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        Print.print(bath);
    }
}
