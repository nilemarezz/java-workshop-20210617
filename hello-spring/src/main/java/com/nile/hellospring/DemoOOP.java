package com.nile.hellospring;

public class DemoOOP {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee2 = new Employee();
        System.out.println(employee);
        if(employee.equals(employee2)){
            System.out.println("true");
        }

        MyReport myReport = new MyReport();
        myReport.generate();
    }
}

abstract class Report{
    abstract void generateHeader();
    abstract void generateBody();
    abstract void generateFooter();
    public void generate(){
        generateHeader();
        generateBody();
        generateFooter();
    }
}

class MyReport extends Report{
    @Override
    void generateHeader() {
        System.out.println("generate Header");
    }

    @Override
    void generateBody() {
        System.out.println("generate Body");
    }

    @Override
    void generateFooter() {
        System.out.println("generate Footer");
    }
}