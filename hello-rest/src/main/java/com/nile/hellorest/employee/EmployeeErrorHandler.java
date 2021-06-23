package com.nile.hellorest.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmployeeErrorHandler {
    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<EmployeeResponse> handleException(EmployeeNotFoundException e){
        EmployeeResponse response = new EmployeeResponse();

        System.out.println(e.getMessage());
        System.out.println(e.getStatus().value());
        return new ResponseEntity<>(response , HttpStatus.EXPECTATION_FAILED);
    }
}
