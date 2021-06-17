package com.nile;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;

    public Employee() {
        this("", "");
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}
