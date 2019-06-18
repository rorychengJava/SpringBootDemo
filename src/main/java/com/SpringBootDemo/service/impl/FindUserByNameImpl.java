package com.SpringBootDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SpringBootDemo.mapper.UserMapper2;
import com.SpringBootDemo.util.User;

@Service
public class FindUserByNameImpl implements FindUserByName {
	
	@Autowired
	private UserMapper2 userMapper2;
	
	public User findUserByName(String suser) {
		
		return userMapper2.findUserByName(suser);
	}
	
	@Transactional
	public void insertUser() {
		User user=new User();
		user.setSuser("rorycheng2");
		user.setSpassword("123456");
		userMapper2.insertUser(user);
//		int i=6/0;
//		userMapper2.insertUser(suser, spassword);
	}

}
