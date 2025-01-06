package com.eazybytes.eazybyteapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("/myAccount")
    public String getAccount() {
        return "Welcome to Account Information...";
    }
}
