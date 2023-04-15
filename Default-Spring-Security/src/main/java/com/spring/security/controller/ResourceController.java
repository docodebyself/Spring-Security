package com.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
@RequestMapping("/resource")
public class ResourceController {

    @GetMapping("/person")
    public String helloWorld(Authentication authentication){
        log.info("Call API /person");
        return "Hello " + authentication.getName();
    }


    @GetMapping("/person2")
    public String helloWorld2(Principal principal){
        log.info("Call API /person2");
        return "Hello " + principal.getName();
    }
}
