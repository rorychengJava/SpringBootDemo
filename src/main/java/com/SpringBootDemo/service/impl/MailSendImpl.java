package com.SpringBootDemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.service.MailSend;
import com.SpringBootDemo.util.MailProperties;

@Service
public class MailSendImpl implements MailSend{

	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private MailProperties mp;
	
	public void SimpleSend(String To, String subject, String Text) {
		
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom(mp.getUsername());
		smm.setTo(To);
		smm.setSubject(subject);
		smm.setText(Text);
		
		mailSender.send(smm);
		
	}

}
