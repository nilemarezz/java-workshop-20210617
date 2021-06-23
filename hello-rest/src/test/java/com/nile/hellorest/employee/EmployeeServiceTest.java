package com.nile.hellorest.employee;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EmployeeServiceTest {

    @Mock
    private MyRandom random;

    @Mock
    private EmployeeRepository employeeRepository;


    @Test
    public void foundEmployee(){
        Employee empRes = new Employee(1 , "name" , "lastname");
        when(employeeRepository.findById(1)).thenReturn(Optional.of(empRes));
        when(random.nextInt(10)).thenReturn(7);
        EmployeeService service = new EmployeeService();
        service.setRandom(random);
        service.setEmployeeRepository(employeeRepository);
        EmployeeResponse response = service.findByID(1);
        assertEquals(1 , response.getId());
        assertEquals("name7" , response.getFname());
        assertEquals("lastname" , response.getLname());
    }

    @Test
    public void notFoundEmployee(){
        EmployeeService service = new EmployeeService();
        service.setRandom(random);
        service.setEmployeeRepository(employeeRepository);
        EmployeeNotFoundException exception = assertThrows(EmployeeNotFoundException.class , () -> service.findByID(100));
        assertEquals("Employee not found" , exception.getMessage());
        assertEquals(404 , exception.getStatus().value());

    }
}