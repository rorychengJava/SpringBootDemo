package com.SpringBootDemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
//@ComponentScan("com.SpringBootDemo.controller.LogbackController")
//@ComponentScan("com.SpringBootDemo")
@MapperScan("com.SpringBootDemo.mapper.*")
//@EnableCaching
@EnableAsync
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		//获取Spring容器
		ConfigurableApplicationContext ap=SpringApplication.run(SpringBootDemoApplication.class, args);
		//通过ap对象getBean(.class),加载完类后获取bean对象
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
