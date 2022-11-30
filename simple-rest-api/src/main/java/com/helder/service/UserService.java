package com.helder.service;

import com.helder.domain.User;
import com.helder.domain.UserRepository;

import java.util.List;

public class UserService {
    UserRepository repository = new UserRepository();
    public void addUser(User user) {
        repository.add(user);
    }

    public List<User> getUsers() {
        return repository.getAll();
    }
}
