package com.swich.test;

public class SalariedEmployee extends Employee{

    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    private int rate;
    private int hours;

    public SalariedEmployee(int rate, int hours, String employeeId, String socialSecurityNumber) {
        this.rate = rate;
        this.hours = hours;
        this.employeeId = employeeId;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return rate * hours;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }
}
