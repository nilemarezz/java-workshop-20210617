package com.nile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    @DisplayName("Create Employee without name + lastname")
    void testGetFullName1() {
        Employee employee = new Employee();
        assertEquals(" " , employee.getFullName());
    }

    @Test
    @DisplayName("Create Employee with name + lastname")
    void testGetFullName2() {
        String firstName = "Matas";
        String lastName = "P.";
        Employee employee = new Employee(firstName , lastName);
        assertEquals("Matas P." , employee.getFullName());
    }
}