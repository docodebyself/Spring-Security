package com.spring.security.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
@Slf4j
public class AdminController {

    @GetMapping("/manage")
    public String manage(){
        log.info("ADMIn login");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Object o1 = authentication.getName();
        Object o2 = authentication.getDetails();
        Object o3 = authentication.getCredentials();
        Object o4 = authentication.getPrincipal();
        Object o5 = authentication.getAuthorities();
        return "Welcome to admin page with username:  " + authentication.getName();
    }


}
