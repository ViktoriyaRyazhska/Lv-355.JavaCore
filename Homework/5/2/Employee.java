package com.swich.test;

public abstract class Employee implements Calculate {

    protected String employeeId;

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
