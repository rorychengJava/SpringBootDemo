package com.SpringBootDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootDemo.util.User;

@Service
public interface FindUserPage {

	//pagehelper分页查询
	public List<User> findUserPage(int page,int rows);

}
