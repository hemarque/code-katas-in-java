package com.helder.service;

import com.helder.domain.User;
import com.helder.domain.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repository;
    public void add(User user) {
        repository.save(user);
    }

    public Iterable<User> getUsers() {
        return repository.findAll();
    }
}
