package com.SpringBootDemo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.util.Person;

@RestController
public class messageController {
	
	@Autowired
	private Person p;
	
	@RequestMapping("/message")
	public String message() {
		return "zcfzb,资产负债表";
	}
	
	@RequestMapping("/bean")
	public Person bean() {
		p.setName("校长");
		p.setDate(new Date());
		p.setAge(25);
		return p;
		
	}
}
