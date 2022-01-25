package com.reshman.jsfexample.services;

import com.reshman.jsfexample.entities.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserService {

    @Inject
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String passwordChecker() {
        if (user.getPassword().equals("password")) {
            return "welcome";
        } else {
            return "error";
        }
    }

    public String home() {
        return "index";
    }

    private void resetDetails() {
        user.setName("");
        user.setPassword("");
    }
}
