package com.swich.test;

public class Cleaner extends Staff {

    public final String TYPE_PERSON = "CLEANER";

    public Cleaner(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println(TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public void print() {
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }
}
