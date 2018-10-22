package com.swich.test;

public class Main2 {

    public static void main(String[] args) {

        Person[] people = new Person[3];

        people[0] = new Student("S1");
        people[1] = new Teacher("T1", 10);
        people[2] = new Cleaner("C1", 5);

        for (Person p : people) {
            p.print();
            if (p instanceof  Staff) {
                ((Staff) p).salary();
            }
        }

    }

}
