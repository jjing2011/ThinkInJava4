package com.mycompany.ThinkInJava4;


public class Detergent2 {
    private Cleanser x = new Cleanser();

    public void append(String a) {
        x.append(a);
    }

    public void dilute() {
        x.dilute();
    }

    public void apply() {
        x.apply();
    }

    public void scrub() {
        append(" Detergent.scrub()");
        x.scrub();
    }

    public void foam() {
        append(" foam()");
    }

    public String toString() {
        return x.toString();
    }

    public static void main(String[] args) {
        Detergent2 dt2 = new Detergent2();

        dt2.dilute(); dt2.apply(); dt2.scrub(); dt2.foam();

        Print.print(dt2);

    }

}
