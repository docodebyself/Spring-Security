package com.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
@Slf4j
public class AuthController {

    @GetMapping("/hello")
    public String helloWorld(){
        log.info("Call API /hello from Index class for permit all ");
        return "Hello World";
    }

    @GetMapping("/welcome")
    public String index(){
        log.info("CALL API /welcome");
        return "Welcome to my web";
    }


}
