package com.nile.hellorest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable(name="id") int id){
        return new EmployeeResponse(id , "Matas" , "N");
    }
}
