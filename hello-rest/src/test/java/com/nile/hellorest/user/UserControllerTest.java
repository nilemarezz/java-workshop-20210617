package com.nile.hellorest.user;

import com.nile.hellorest.employee.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    Geology geo1 = new Geology("-37.3159", "81.1496");
    Address address1 = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo1);
    Company company1 = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");
    User user1 = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address1, "1-770-736-8031 x56442", "hildegard.org", company1);

    @Autowired
    private TestRestTemplate restTemplate;

    @MockBean
    private UserController userController;

    @Test
    public void testGetAllUsers() {
        List<User> users = new ArrayList<User>() {{
            add(user1);
        }};
        UserResponse expect = new UserResponse();
        expect.setUsers(users);
        when(userController.getAllUsers()).thenReturn(expect);

        UserResponse response = restTemplate.
                getForObject("/users", UserResponse.class);
        List<User> responseUsers = response.getUsers();

        assertEquals(responseUsers.size(), users.size());
        assertEquals(responseUsers.get(0).getId(), users.get(0).getId());
    }

    @Test
    public void testGetUserByID() {
        when(userController.getUserByID("1")).thenReturn(user1);
        User response = restTemplate.
                getForObject("/users/1", User.class);
        assertEquals(response , user1);
    }

}