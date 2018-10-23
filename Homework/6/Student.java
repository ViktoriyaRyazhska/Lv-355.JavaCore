package com.swich.test;

import java.util.*;

public class Student {

    private String name;
    private int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(course, student.course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    public void printStudents(List<Student> list){

        for (Student s : list) {
            if (s.getCourse() == this.course) {
                System.out.print(s.getName() + " ");
            }
        }

    }

    static class NameComparator implements Comparator {

        public int compare(Object s1, Object s2) {

            return ((Student)s1).getName().compareTo(((Student)s2).getName());

        }

    }

    static class CourseComparator implements Comparator {

        public int compare(Object s1, Object s2) {

            return ((Student)s1).getCourse() - ((Student)s2).getCourse();

        }

    }

}
