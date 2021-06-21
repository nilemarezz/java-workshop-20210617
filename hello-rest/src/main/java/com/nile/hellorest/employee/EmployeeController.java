package com.nile.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController

public class EmployeeController {

//    @Autowired
//    private MyRandom random;
//    @Bean
//    public Random createNewRandom(){
//        return new Random();
//    }

    @Autowired
    private MyRandom random;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable(name="id") String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }


        return new EmployeeResponse(_id , "Matas" + random.nextInt(10) , "N" );
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam(name = "id" , defaultValue = "1") String id){
        int _id = 0;
        try{
            _id = Integer.parseInt(id);
        }catch (NumberFormatException e){
            System.out.println("NumberFormatException");
        }


        return new EmployeeResponse(_id , "Matas" + random.nextInt(10), "N");
    }
}
