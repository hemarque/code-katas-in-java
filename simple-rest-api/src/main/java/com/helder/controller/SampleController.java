package com.helder.controller;

import com.helder.domain.User;
import com.helder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping(value = "/sayHiTo")
    public String sayHiTo(@RequestParam(value = "name", required = false) String name) {
        return "Hi " + name;
    }

    @GetMapping(value = "/addUser")
    public String addUser(@RequestParam(value = "name", required = false) String name) {
        User user = new User();
        user.setName(name);
        userService.add(user);
        return name + " added";
    }

    @RequestMapping("/getUsers")
    public String getUsers() {
        String response = "";
        for (User user : userService.getUsers()) {
            response += user.getName() + "<br>";
        }
        return response;
    }

}

