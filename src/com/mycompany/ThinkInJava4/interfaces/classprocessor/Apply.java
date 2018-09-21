package com.mycompany.ThinkInJava4.interfaces.classprocessor;

import java.util.*;
import com.mycompany.ThinkInJava4.Print;
import org.omg.CORBA.OBJ_ADAPTER;

import javax.print.DocFlavor;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) { return input; }
}

class Upcase extends Processor {

    @Override
    String process(Object input) {
        return ((String)input).toUpperCase();
    }
}

class Downcase extends Processor {

    @Override
    String process(Object input) {
        return ((String)input).toLowerCase();
    }
}

class Splitter extends Processor {

    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {

    public static void process(Processor p, Object s) {
        Print.printnb("Using Processor" + p.name());
        Print.printnb(p.process(s));
    }

    public static String s = "Disagreement with beliefs is by definition incorrect";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}
