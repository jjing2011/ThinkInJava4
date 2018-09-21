package com.mycompany.ThinkInJava4;

class Homer {
    char doh(char c) {
        Print.print("doh(char)");
        return 'd';
    }

    float doh(float f) {
        Print.print("doh(float)");
        return 1.0f;
    }
}

class Milhouse {}

class Bart extends Homer {
    void doh(Milhouse m) {
        Print.print("doh(Milhouse)");
    }
}

class Lisa extends Homer {
    // @Override
    void doh(Milhouse m) {
        Print.print("doh(Milhouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b = new Bart();
        b.doh(1);
        b.doh('c');
        b.doh(1.0f);
        b.doh(new Milhouse());

    }
}
