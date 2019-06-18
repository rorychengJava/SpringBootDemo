package com.SpringBootDemo.service.impl;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMailMessage;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.service.MailSend;
import com.SpringBootDemo.util.MailProperties;

@Service
public class MailSendImpl implements MailSend{

	
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private MailProperties mp;
//发送简单邮件	
	public void SimpleSend(String To, String subject, String Text) {
		
		SimpleMailMessage smm=new SimpleMailMessage();
		smm.setFrom(mp.getUsername());
		smm.setTo(To);
		smm.setSubject(subject);
		smm.setText(Text);
		
		mailSender.send(smm);
		
	}
//发送带有模板的邮件
	public void MineSend(String To, String subject, String Text) {
		MimeMessage mmm=mailSender.createMimeMessage();
		
        try {
        	MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mmm, true);
			mimeMessageHelper.setFrom(mp.getUsername());
			mimeMessageHelper.setTo(To);
	        mimeMessageHelper.setSubject(subject);
	        mimeMessageHelper.setText("src/main/resources/static/mail.html", true);
	        mailSender.send(mmm);
		} catch (MessagingException e) {
			e.printStackTrace();
		}
        
		
		
		
	}

}
