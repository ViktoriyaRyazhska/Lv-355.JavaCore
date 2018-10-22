package com.swich.test;

public class Main2 {

    public static void main(String[] args) {

        Employee[] employees = {new SalariedEmployee(2, 4, "E1", "SN1"),
                                new ContractEmployee(5, "E2", "FTIM1"),
                                new SalariedEmployee(3, 5, "E3", "SN2"),
                                new ContractEmployee(6, "E4", "FTIM2")};

        employees[0].setName("Employee 1");
        employees[1].setName("Employee 2");
        employees[2].setName("Employee 3");
        employees[3].setName("Employee 4");

        Employee tmp;
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].calculatePay() < employees[j].calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }

        for (Employee employee : employees){
            System.out.println(employee);
            System.out.println("Name: " + employee.getName() + " ID: " + employee.getEmployeeId());
            System.out.println("Payment: " + employee.calculatePay());
        }

    }

}
