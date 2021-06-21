package com.nile.hellorest.user;

import lombok.Data;

@Data
public class Geology {
    private String lat;
    private String lng;

    public Geology() {
    }

    public Geology(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

}
