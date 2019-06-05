package com.SpringBootDemo.exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class TestException {
	
	//捕获其他程序所抛出的异常
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> testexception(Exception exception){
		
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("erroCode", 500);
		map.put("erroString", exception.toString());
		return map;
	}

}
