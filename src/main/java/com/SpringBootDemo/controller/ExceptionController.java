package com.SpringBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {
	@RequestMapping("/exception")
	public String testexception() {
		int a=5/0;
		System.out.println(a);
		return "exception";
	}
}
