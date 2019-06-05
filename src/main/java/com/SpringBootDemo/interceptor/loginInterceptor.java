package com.SpringBootDemo.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


@Configuration
public class loginInterceptor extends WebMvcConfigurerAdapter{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {

		
		HandlerInterceptorAdapter adapter=new HandlerInterceptorAdapter() {

			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
				System.out.println("自定义拦截器...........");
				return true;
			}

			@Override
			public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
					ModelAndView modelAndView) throws Exception {
				// TODO Auto-generated method stub
				super.postHandle(request, response, handler, modelAndView);
			}

			@Override
			public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
					Exception ex) throws Exception {
				// TODO Auto-generated method stub
				super.afterCompletion(request, response, handler, ex);
			}
			
		};
		
		//设定需要拦截的请求url
		registry.addInterceptor(adapter).addPathPatterns("/**");
	}
	
}
