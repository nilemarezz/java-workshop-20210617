package com.nile.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class UserGateway {

    @Autowired
    private RestTemplate restTemplate;

    public Users getAllUsers(){
        ResponseEntity<UserModel[]> response = restTemplate.getForEntity("https://jsonplaceholder.typicode.com/users", UserModel[].class);
        UserModel[] users = response.getBody();
        return new Users(Arrays.asList(users));
    }
}
