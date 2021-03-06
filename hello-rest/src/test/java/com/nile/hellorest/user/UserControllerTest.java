package com.nile.hellorest.user;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    public void tryToCallAPI(){
        List<UserModel> users = userController.getAllUsers();
        assertEquals(5 , users.size());
        assertEquals(2 , users.get(0).getId());
    }
}