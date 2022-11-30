package com.helder.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {
    @RequestMapping("/")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping(value = "/sayHiTo")
    public String sayHiTo(@RequestParam(value = "name", required = false) String name) {
        return "Hi " + name;
    }
}

