package com.swich.test;

public class ContractEmployee extends Employee{

    private String federalTaxIdMember;

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                ", employeeId='" + employeeId + '\'' +
                '}';
    }

    private int monthlyPayment;

    public ContractEmployee(int monthlyPayment, String employeeId, String federalTaxIdMember) {
        this.monthlyPayment = monthlyPayment;
        this.employeeId = employeeId;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return monthlyPayment;
    }

}
