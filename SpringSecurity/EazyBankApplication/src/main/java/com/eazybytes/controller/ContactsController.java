package com.eazybytes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("/welcome")
    public String sayWelcome() {
        return "Welcome to Spring Security";
    }
}
