package com.helder.service;

import com.helder.domain.UserRepository;

import java.util.List;

public class UserService {
    UserRepository repository = new UserRepository();
    public void addUser(String name) {
        repository.add(name);
    }

    public List<String> getUsers() {
        return repository.getAll();
    }
}
