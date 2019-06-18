package com.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.service.FindUserPage;
import com.SpringBootDemo.util.User;

@RestController
public class findUserPageController {
		@Autowired
		private FindUserPage findUserpage;
		
		
	@RequestMapping("/page/{page}/{rows}")
	@ResponseBody
	public List<User> findUserPage(@PathVariable int page,@PathVariable int rows) {
		System.out.println(page+""+rows);
		List<User> list=findUserpage.findUserPage(page, rows);
		return list;
	}
}
