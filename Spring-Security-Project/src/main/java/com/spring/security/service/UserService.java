package com.spring.security.service;

import com.spring.security.request.UserDTO;
import com.spring.security.response.BaseResponse;

public interface UserService {

    BaseResponse registerAccount(UserDTO userDTO);
}
