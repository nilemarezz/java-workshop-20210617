package com.nile.DemoCollection;

import com.nile.Employee;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Name1");
        myList.add("Name2");
        for(String name : myList){
            System.out.println(name);
        }
        for(int i = 0 ; i < myList.size() ; i ++){
            System.out.println(myList.get(i));
        }

        System.out.println("======= MAP =====");

        Map<Integer , Employee> employees = new HashMap<>();
        employees.put(1,new Employee("Matas" , "Nile"));
        employees.put(2,new Employee("Matas2" , "Nile2"));
        for(Integer key : employees.keySet()){
            Employee employee = employees.get(key);
            System.out.println(employee.getFullName());
        }
    }
}
