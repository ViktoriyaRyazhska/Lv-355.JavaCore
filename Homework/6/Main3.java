package com.swich.test;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            students.add(new Student("S" + i, (int)(Math.random() * 3)));
        }

        students.sort(new Student.NameComparator());

        System.out.println(students);

        students.sort(new Student.CourseComparator());

        System.out.println(students);

        students.get(0).printStudents(students);

    }

}
