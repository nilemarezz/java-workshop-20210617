package com.nile.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable(name="id") String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        return new EmployeeResponse(_id , "Matas" , "N");
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam(name = "id" , defaultValue = "1") String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }
        return new EmployeeResponse(_id , "Matas" , "N");
    }
}