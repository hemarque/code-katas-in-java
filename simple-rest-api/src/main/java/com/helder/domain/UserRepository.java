package com.helder.domain;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    List<String> users = new ArrayList<String>();
    public void add(String name) {
        users.add(name);
    }

    public List getAll() {
        return users;
    }
}
