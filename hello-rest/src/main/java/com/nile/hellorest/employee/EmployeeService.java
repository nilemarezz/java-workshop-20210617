package com.nile.hellorest.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    private MyRandom random;

    public void setRandom(MyRandom random) {
        this.random = random;
    }

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public EmployeeResponse findByID(int id){
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            Employee result = employee.get();
            EmployeeResponse response = new EmployeeResponse(result.getId(), result.getFirstName() +random.nextInt(10) , result.getLastName());
            return response;
        }
        return new EmployeeResponse();
//        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }
}
