package com.abc.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class Dashboard {

    @RequestMapping("/home")
    public String home() {
        return "Welcome to the dashboard!";
    }

    @RequestMapping("/profile")
    public String profile() {
        return "Welcome to your profile!";
    }

    @RequestMapping("/settings")
    public String settings() {
        return "Welcome to your settings!";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "You have been logged out!";
    }
}
