package com.ebm.users.dto;


import com.ebm.users.web.model.User;
import lombok.Getter;

@Getter
public class LoginResponse {
    private final User user;

    public LoginResponse(User user) {
        this.user = user;

    }

}
