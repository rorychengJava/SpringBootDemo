package com.SpringBootDemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.SpringBootDemoApplication;

@RestController
public class LogbackController {
	private Logger logger=LoggerFactory.getLogger(LogbackController.class);
	
	@RequestMapping("/log")
	public String log() {
		logger.debug("debug日志");
		logger.info("info日志");
		logger.warn("warn日志");
		logger.error("error日志");
		return "log";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(LogbackController.class, args);
	}
}
