package com.nile.hellorest.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private MyRandom random;

    @Test
    public void callAPIWithPathVariable(){
        // Mock
        when(random.nextInt(10)).thenReturn(7);
        EmployeeResponse expects = new EmployeeResponse(123 , "Matas7" , "N" );
        EmployeeResponse response = restTemplate.getForObject("/employee/123" , EmployeeResponse.class);
        assertEquals(123 , response.getId());
        assertEquals("Matas7", response.getFname());
        assertEquals("N" , response.getLname());
        assertEquals(expects , response);
    }

    @Test
    public void callAPIWithRequestParameter(){
        //Mock
        when(random.nextInt(10)).thenReturn(7);
        EmployeeResponse expects = new EmployeeResponse(123 , "Matas7", "N");
        EmployeeResponse response = restTemplate.getForObject("/employee?id=123" , EmployeeResponse.class);
        assertEquals(123 , response.getId());
        assertEquals("Matas7" , response.getFname());
        assertEquals("N" , response.getLname());
        assertEquals(expects , response);
    }
}