package com.SpringBootDemo.service.impl;

import org.springframework.stereotype.Service;

import com.SpringBootDemo.util.User;

@Service
public interface FindUserByName {
	
	User findUserByName(String suser);
	
	void insertUser();

}
