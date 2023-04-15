package com.spring.security.controller;

import com.spring.security.request.UserDTO;
import com.spring.security.response.BaseResponse;
import com.spring.security.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final UserService userService;

    @PostMapping("/register-account")
    public ResponseEntity<BaseResponse> registerAccount(@RequestBody UserDTO userDTO) {
        return ResponseEntity.ok(userService.registerAccount(userDTO));
    }
}
