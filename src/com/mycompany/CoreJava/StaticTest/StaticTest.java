package com.mycompany.CoreJava.StaticTest;

import net.mindview.util.CountingGenerator;

class Employee {

    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    public static int getNextId() {
        return nextId;
    }
}

public class StaticTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Tom", 40000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        for (Employee e: staff) {
            e.setId();
            System.out.println("name=" + e.getName() + ", salary=" + e.getSalary() + ", id=" + e.getId());
        }

        int n = Employee.getNextId();
        System.out.println(n);
    }
}
