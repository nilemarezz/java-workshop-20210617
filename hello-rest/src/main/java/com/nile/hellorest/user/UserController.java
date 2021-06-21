package com.nile.hellorest.user;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
//    Geology geo1 = new Geology("-37.3159", "81.1496");
//    Address address1 = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo1);
//    Company company1 = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
//    User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address1, "1-770-736-8031 x56442", "hildegard.org", company1);
//
//    Geology geo2 = new Geology("-43.9509", "34.4618");
//    Address address2 = new Address("Victor Plains", "Suite 87", "Wisokyburgh", "90566-7771", geo2);
//    Company company2 = new Company("Deckow-Crist", "Proactive didactic contingenc", "synergize scalable supply-chains");
//    User user2 = new User(2, "Ervin Howel", "Antonette", "Shanna@melissa.tv", address2, "010-692-6593 x09125", "anastasia.net", company2);
//    List<User> users = new ArrayList<User>() {
//        {
//            add(user1);
//            add(user2);
//        }
//    };

    // read from json file


    @GetMapping("/users")
    public UserResponse getAllUsers() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<User> users = objectMapper.readValue(new File("user.json"), new TypeReference<List<User>>() {});
            UserResponse response = new UserResponse();
            response.setUsers(users);
            return response;
        } catch (IOException e) {
            return null;
        }
    }

    @GetMapping("/users/{id}")
    public User getUserByID(@PathVariable(name = "id") String id) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            List<User> users = objectMapper.readValue(new File("user.json"), new TypeReference<List<User>>() {});
            int _id = Integer.parseInt(id);
            for (User user : users) {
                if (user.getId() == _id) {
                    return user;
                }
            }
            return null;
        } catch (NumberFormatException | IOException e) {
            return null;
        }
    }
}
