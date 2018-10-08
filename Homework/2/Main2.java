package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person("Vassay", 1987);
        Person p4 = new Person("Pupcin", 1972);
        Person p5 = new Person();

        p5.input(br);

        p1.setName("Piter");
        p2.setName("Frank");

        p2.setBirthYear(1969);

        p5.setName("George");

        System.out.println(p1.getName() + "`s age is: " + p1.getAge());
        System.out.println(p2.getName() + "`s age is: " + p2.getAge());
        System.out.println("p1 name is " + p3.getName());
        System.out.println(p5.getName() + " birth year is " + p5.getBirthYear());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

    }

}
