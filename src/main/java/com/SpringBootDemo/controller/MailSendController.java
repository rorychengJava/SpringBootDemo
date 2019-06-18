package com.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.service.MailSend;


@RestController
public class MailSendController {
	
	@Autowired
	private MailSend mailSend;
	
	@RequestMapping("/mail")
	public String MailSendTest() {
		
		String To="1032377347@qq.com";
		String subject="ceshi";
		String text="this is a test text";
		mailSend.SimpleSend(To,subject,text);
		
		return "ok";
	}
}
