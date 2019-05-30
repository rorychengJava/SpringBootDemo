package com.SpringBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.SpringBootDemo")
@MapperScan("com.SpringBootDemo.mapper.*")

public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}

/*	public class SpringBootDemoApplication extends SpringBootServletInitializer{
		
		protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
			return builder.sources(SpringBootDemoApplication.class);
	}
		public static void main(String[] args) {
			SpringApplication.run(SpringBootDemoApplication.class, args);
		}
	
}*/
