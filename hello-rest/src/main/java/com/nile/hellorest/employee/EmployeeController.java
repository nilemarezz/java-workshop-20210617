package com.nile.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;
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
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employee/{id}")
    public EmployeeResponse getEmployeeByID(@PathVariable(name = "id") String id) {
        try {
            int _id = Integer.parseInt(id);
            Optional<Employee> employee = employeeRepository.findById(_id);
            if (employee.isPresent()) {
                Employee result = employee.get();
                EmployeeResponse response = new EmployeeResponse(result.getId(), result.getFirstName() +random.nextInt(10) , result.getLastName());
                return response;
            }
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        } catch (NumberFormatException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/employee")
    public EmployeeResponse getEmployeeByID2(@RequestParam(name = "id", defaultValue = "1") String id) {
        int _id = 0;
        try {
            _id = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        return new EmployeeResponse(_id, "Matas" + random.nextInt(10), "N");
    }

    @PostMapping("/employee")
    public EmployeeResponse createNewEmployee(@RequestBody EmployeeRequest employeeRequest) {

        return new EmployeeResponse(99, employeeRequest.getFname(), employeeRequest.getLname());
    }
}
