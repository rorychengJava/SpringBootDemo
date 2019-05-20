package com.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringBootDemo.mapper.CompanyMapper;
import com.SpringBootDemo.util.CompanyInfo;


@Controller
public class FindCompany {

	@Autowired
	private CompanyMapper companyMapper;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}
	
	@RequestMapping("/findCompany")
	@ResponseBody
	public List<CompanyInfo> company () {
		List<CompanyInfo> list=companyMapper.findCompanyById("1001");
		
		return list;
	}
}
