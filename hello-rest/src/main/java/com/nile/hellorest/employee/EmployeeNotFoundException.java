package com.nile.hellorest.employee;

import org.springframework.http.HttpStatus;

public class EmployeeNotFoundException extends RuntimeException {

    public EmployeeNotFoundException() {
        super("Employee not found");
    }

    private HttpStatus status = HttpStatus.NOT_FOUND;

    public HttpStatus getStatus() {
        return status;
    }
}
