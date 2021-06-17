package com.nile;

public class Employee {
    private int id;
    private int firstName;
    private int lastName;

    public Employee() {

    }

    public String getFullName(){
        return firstName + " " +lastName;
    }
}
