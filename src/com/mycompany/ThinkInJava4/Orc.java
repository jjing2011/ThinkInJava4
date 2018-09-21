package com.mycompany.ThinkInJava4;

class Villian {
    private String name;

    protected void set(String nm) { name = nm; }

    public Villian(String name) { this.name = name; }

    public String toString() {
        return "I'm a Villian and my name is " + name;
    }

}

public class Orc extends Villian {
    private int orcNumber;

    public Orc(String name, int number) {
        super(name);
        this.orcNumber = number;
    }

    public void change(String name, int number) {
        super.set(name);
        this.orcNumber = number;
    }

    public String toString() {
        return "Orc " + orcNumber + ": " + super.toString();
    }

    public static void main(String[] args) {
        Orc orc = new Orc("Limburger", 12);
        Print.print(orc);
        orc.change("bob", 19);
        Print.print(orc);
    }
}
