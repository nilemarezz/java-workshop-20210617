package com.nile.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerMockTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MyRandom random;

    @MockBean
    private EmployeeRepository employeeRepository;

    @Test
    public void callAPIWithPathVariableAndDatabase(){
        // Mock

        Employee expects = new Employee(123 , "Matas" , "N" );
        when(random.nextInt(10)).thenReturn(7);
        when(employeeRepository.findById(123)).thenReturn((Optional.of(expects)));
        EmployeeResponse response = restTemplate.getForObject("/employee/123" , EmployeeResponse.class);
        assertEquals(123 , response.getId());
        assertEquals("Matas7", response.getFname());
        assertEquals("N" , response.getLname());
//        assertEquals(expects , response);
    }

    @Test
    public void callAPIWithPathVariableAndDatabaseandEmpty(){
        // Mock

        Employee expects = new Employee(123 , "Matas" , "N" );
        when(random.nextInt(10)).thenReturn(7);
        when(employeeRepository.findById(123)).thenReturn((Optional.empty()));
        EmployeeResponse response = restTemplate.getForObject("/employee/123" , EmployeeResponse.class);
        System.out.println(response);
        assertEquals(0 , response.getId());
        assertEquals(null, response.getFname());
        assertEquals(null , response.getLname());
//        assertEquals(expects , response);
    }

}