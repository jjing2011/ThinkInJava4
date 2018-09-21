package com.mycompany.ThinkInJava4.interfaces.interfaceprocessor;

import com.mycompany.ThinkInJava4.Print;

public class Apply {
    public static void process(Processor p, Object s) {
        Print.print("Using Processor" + p.name());
        Print.print(p.process(s));
    }
}
