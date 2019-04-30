package com.example.demo.controller;

import com.example.demo.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController("/user")
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping(value = "login")
    public void login(@RequestParam String userName,@RequestParam String passWord ){

    }
}
