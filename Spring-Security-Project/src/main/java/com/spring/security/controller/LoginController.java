package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(){
        return "login2";
    }

    @GetMapping("/403")
    public String forbidden(){
        return "403";
    }
}
