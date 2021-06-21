package com.nile.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
}
