package com.ebm.users.dto;

import org.springframework.security.core.userdetails.User;

public class LoginResponse {
    private String token;  // ou d'autres informations que vous voulez renvoyer
    private User user;

    public LoginResponse(com.ebm.users.web.model.User user) {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
