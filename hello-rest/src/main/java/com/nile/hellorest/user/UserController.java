package com.nile.hellorest.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserGateway userGateway;

    @GetMapping("/users")
    public List<UserModel> getAllUsers(){
        List<UserModel> users = userGateway.getAllUsers().getUsers();
        List<UserModel> response = new ArrayList<>();
        for (UserModel user : users){
            if(user.getId() % 2 == 0){
                response.add(user);
            }
        }

        return response;
    }
}
