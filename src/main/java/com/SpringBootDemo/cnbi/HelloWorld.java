package com.SpringBootDemo.cnbi;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloWorld {
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	
		@RequestMapping("/hello")
		public String Hello() {
			return "HelloWorld";
		}
		@RequestMapping("/datasource")
		public String DataSource() {
			return username +"\n"+ password;
		}
}
