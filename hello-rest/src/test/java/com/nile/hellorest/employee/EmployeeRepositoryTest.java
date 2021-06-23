package com.nile.hellorest.employee;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    @Order(1)
    public void foundWithID1(){
        Employee emp1 = new Employee("demoname1" , "demolastname");
        Employee save = employeeRepository.save(emp1);
        Employee employee = employeeRepository.getById(1);
        assertEquals(save.getId() , employee.getId());
        assertEquals("demoname1" , employee.getFirstName());
        assertEquals("demolastname" , employee.getLastName());
    }

    @Test
    @Order(2)
    public void foundWithID2(){
        Employee emp1 = new Employee("demoname1" , "demolastname");
        Employee save = employeeRepository.save(emp1);
        Employee employee = employeeRepository.getById(save.getId());
        assertEquals(save.getId() , employee.getId());
        assertEquals("demoname1" , employee.getFirstName());
        assertEquals("demolastname" , employee.getLastName());
    }
}