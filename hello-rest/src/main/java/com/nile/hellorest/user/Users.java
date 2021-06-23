package com.nile.hellorest.user;

import java.util.List;

public class Users {
    private List<UserModel> users;

    public Users(List<UserModel> users) {
        this.users = users;
    }

    public List<UserModel> getUsers() {
        return users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }
}
