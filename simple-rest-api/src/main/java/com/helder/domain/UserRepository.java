package com.helder.domain;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<User> users = new ArrayList<User>();
    public void add(User user) {
        users.add(user);
    }

    public List<User> getAll() {
        return users;
    }
}
