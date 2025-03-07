package com.abc.manager.controller;

import com.abc.manager.Services.UserService;
import com.abc.manager.etities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {
	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody User user) {
		userService.registerUser(user.getUsername(), user.getPassword(), "ROLE_USER");
		return ResponseEntity.ok("User registered successfully");
	}
}
