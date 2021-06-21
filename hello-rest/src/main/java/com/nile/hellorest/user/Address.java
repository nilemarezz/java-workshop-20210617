package com.nile.hellorest.user;

import lombok.Data;

@Data
public class Address {
    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private Geology geo;

    public Address() {
    }

    public Address(String street, String suite, String city, String zipcode, Geology geo) {
        this.street = street;
        this.suite = suite;
        this.city = city;
        this.zipcode = zipcode;
        this.geo = geo;
    }


}
