package com.nile.hellorest.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmployeeRequest {

    @JsonProperty("first_name")
    private String fname;
    private String lname;

    public EmployeeRequest() {
    }

    public EmployeeRequest(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }


    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
