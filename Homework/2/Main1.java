package com.swich.test;

public class Main1 {

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("George", 12.2);
        Employee e3 = new Employee("Piter", 10.5, 4.7);

        e1.setName("Frank");
        e1.setRate(15.3);
        e1.setHours(2);

        e2.setHours(8.3);

        System.out.println(e2);
        System.out.println(e1.getName() + " salary is " + e1.salary());
        System.out.println(e3.getName() + " bonuses is " + e3.bonuses());
        System.out.println("Total salary is " + Employee.getTotalSum());

    }

}
