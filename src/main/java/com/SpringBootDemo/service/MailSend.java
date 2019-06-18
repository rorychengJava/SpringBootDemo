package com.SpringBootDemo.service;

import org.springframework.stereotype.Service;

@Service
public interface MailSend {
	
	//发送简单格式邮件
	 void SimpleSend(String To,String subject,String Text);
	//发送带有模板的邮件
	 void MineSend(String To,String subject,String Text);
}
