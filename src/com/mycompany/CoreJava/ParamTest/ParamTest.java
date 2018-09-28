package com.mycompany.CoreJava.ParamTest;

class Employee {
    private String name;
    private double salary;

    public Employee(String n, double s) {
        this.name = n;
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}

public class ParamTest {

    public static void tripleValue(double x) {
        x = 3 * x;
        System.out.println("x=" + x);
    }

    public static void tripleSalary(Employee x) {
        x.raiseSalary(200);
        System.out.println("Salary: " + x.getSalary());
    }

    public static void swap(Employee x, Employee y) {
        Employee tmp = x;
        x = y;
        y = tmp;
        System.out.println("x=" + x.getName());
        System.out.println("y=" + y.getName());
    }

    public static void main(String[] args) {
        // Test 1
        System.out.println("Testing tripleValue: ");
        double percent = 10;
        System.out.println("Before percent=" + percent);
        tripleValue(percent);
        System.out.println("After percent=" + percent);

        // Test 2
        System.out.println();
        System.out.println("Testing tripleSalary");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before salary:" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After salary:" + harry.getSalary());

        // Test 3
        System.out.println();
        System.out.println("Testing swap:");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before a=" + a.getName());
        System.out.println("Before b=" + b.getName());
        swap(a, b);
        System.out.println("After a=" + a.getName());
        System.out.println("After b=" + b.getName());


    }
}
