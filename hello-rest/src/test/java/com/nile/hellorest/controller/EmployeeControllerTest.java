package com.nile.hellorest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void callAPIWithPathVariable(){
        EmployeeResponse expects = new EmployeeResponse(123 , "Matas" , "N");
        EmployeeResponse response = restTemplate.getForObject("/employee/123" , EmployeeResponse.class);
        assertEquals(123 , response.getId());
        assertEquals("Matas" , response.getFname());
        assertEquals("N" , response.getLname());
        assertEquals(expects , response);
    }

    @Test
    public void callAPIWithRequestParameter(){
        EmployeeResponse expects = new EmployeeResponse(123 , "Matas" , "N");
        EmployeeResponse response = restTemplate.getForObject("/employee?id=123" , EmployeeResponse.class);
        assertEquals(123 , response.getId());
        assertEquals("Matas" , response.getFname());
        assertEquals("N" , response.getLname());
        assertEquals(expects , response);
    }
}