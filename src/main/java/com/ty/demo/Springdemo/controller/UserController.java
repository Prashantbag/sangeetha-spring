package com.ty.demo.Springdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ty.demo.Springdemo.dto.User;
import com.ty.demo.Springdemo.service.UserService;
import com.ty.demo.Springdemo.util.ResponseStructure;


@Component
public class UserController {

	@Autowired
	UserService userService;
	
	
	@PostMapping("save-user")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user){
		
		return userService.saveUser(user);
		
	}
}
