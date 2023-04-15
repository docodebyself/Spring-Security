package com.spring.security.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private String username;

    private String password;

    private String role;

    public String checkProperties() throws IllegalAccessException {
        for(Field f : getClass().getDeclaredFields()){
            if(f.get(this) == null){
                String[] arr = f.toString().split("\\.");
                String t = arr[arr.length - 1];
                if(t.equalsIgnoreCase("username")
                    || t.equalsIgnoreCase("password")
                        || t.equalsIgnoreCase("role")
                        ){
                    return t;
                }
            }
        }
        return null;
    }

}
