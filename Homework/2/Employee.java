package com.swich.test;

public class Employee {

    private String name = "";
    private double rate = -1;
    private double hours = -1;

    public static double totalSum = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {

        if(this.rate != -1 && this.hours != -1){
            totalSum -= this.salary() + this.bonuses();
        }
        this.rate = rate;
        if(this.hours != -1){
            totalSum += this.salary() + this.bonuses();
        }
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if(this.rate != -1 && this.hours != -1){
            totalSum -= this.salary() + this.bonuses();
        }
        this.hours = hours;
        if(this.rate != -1){
            totalSum += this.salary() + this.bonuses();
        }
    }

    public Employee() {

    }

    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += this.salary() + this.bonuses();
    }

    public double salary() {
        if (this.rate != -1 && this.hours != -1) {
            return this.rate * this.hours;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + this.salary() +
                ", bonuses=" + this.bonuses() +
                '}';
    }

    public double bonuses() {
        if (this.salary() != 1) {
            return this.salary() / 10.0;
        } else {
            return -1;
        }
    }
}
