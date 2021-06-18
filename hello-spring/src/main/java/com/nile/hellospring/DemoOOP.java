package com.nile.hellospring;

public class DemoOOP {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        System.out.println(employee);
        if(employee.equals(employee2)){
            System.out.println("true");
        }
    }
}
