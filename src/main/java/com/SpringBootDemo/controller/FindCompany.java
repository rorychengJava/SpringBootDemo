package com.SpringBootDemo.controller;

import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.mapper.CompanyMapper;
import com.SpringBootDemo.util.CompanyInfo;

@RestController
public class FindCompany {

	@Autowired
	private CompanyMapper companyMapper;
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/findCompany")
	public List<CompanyInfo> company () {
		List<CompanyInfo> list=companyMapper.findCompanyById("1001");
		return list;
	}
	
	@RequestMapping("/findCompanyInfo")
	public List<Map<String, Object>> findCompanyInfo(){
		String user="szc";
		List<Map<String, Object>> list=companyMapper.findCompanyInfo(user);
		return list;
	}
	
	@RequestMapping("/say/{info}")
	public String say(@PathVariable String info) {
		return "say"+info;
		
	}
}
