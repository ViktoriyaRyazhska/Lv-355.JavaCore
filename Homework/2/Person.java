package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;

public class Person {

    private String name = "";
    private int birthYear = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person() {

    }

    public void input(BufferedReader br) throws IOException {

        System.out.println("What is your name?");
        this.name = br.readLine();
        System.out.println("Your birth year?");
        this.birthYear = Integer.parseInt(br.readLine());
        System.out.println("Thanks");

    }

    public int getAge() {

        if (this.birthYear != -1) {
            int year = Calendar.getInstance().get(Calendar.YEAR);
            return year - this.birthYear;
        } else {
            return -1;
        }

    }

    @Override
    public String toString() {
        return "Person: \n" +
                " name='" + name + "'\n" +
                " birthYear=" + birthYear;
    }
}
