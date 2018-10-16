package com.swich.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Employee[] employees = new Employee[5];

        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("E" + (i + 1), (int)(Math.random()*5), (int)(Math.random()*10));
        }

        int central = Integer.parseInt(br.readLine());

        ArrayList<Employee> emp =  getSame(central, employees);

        System.out.println(Arrays.toString(emp.toArray()));

        System.out.println(Arrays.toString(getSorted(employees)));

    }

    private static ArrayList<Employee> getSame(int dep, Employee[] emps){
        ArrayList<Employee> emp = new ArrayList<>();
        for (Employee e : emps){
            if (e.getDepartmentNumber() == dep){
                emp.add(e);
            }
        }
        return emp;
    }

    private static Employee[] getSorted(Employee[] emps){

        for (int i = 0; i < emps.length; i++) {
            for (int j = i + 1; j <emps.length ; j++) {
                if (emps[i].getSalary() < emps[j].getSalary()){
                    Employee tmp = emps[i];
                    emps[i] = emps[j];
                    emps[j] = tmp;
                }
            }
        }

        return emps;
    }

}
