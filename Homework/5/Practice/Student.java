package com.swich.test;

public class Student extends Person {

    public final String TYPE_PERSON = "STUDENT";
    public void print() {
        System.out.println("I am " + TYPE_PERSON + " " + name);
    }

    public Student(String name) {
        this.name = name;
        System.out.println(TYPE_PERSON);
    }
}
