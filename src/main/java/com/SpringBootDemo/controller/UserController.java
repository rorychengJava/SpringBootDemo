package com.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.service.impl.FindUserByName;
import com.SpringBootDemo.util.User;

@RestController
public class UserController {
	
	@Autowired
	private FindUserByName findUserByName;
	
	@RequestMapping("/findUser/{suser}")
	public User findUser(@PathVariable String suser) {
		
		return findUserByName.findUserByName(suser);
	}
	
	@RequestMapping("/insertUser")
	public String insertUser() {
		findUserByName.insertUser();
		return "ok";
	}
}
