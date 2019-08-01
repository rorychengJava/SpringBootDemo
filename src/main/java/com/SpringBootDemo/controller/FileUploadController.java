package com.SpringBootDemo.controller;

import javax.mail.Multipart;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
	@Autowired
	private com.SpringBootDemo.service.FileUpload fileUpload;
	
	@RequestMapping("/index")
	public String FormHtml() {
		//后缀默认已经赋予.html，默认配置中已经加上，如果加上会报错
		return "FileUpload";
	}
	
	//实现文件上传
	@RequestMapping(value="/upload",method = RequestMethod.POST)
	@ResponseBody
	public String FileUpload(HttpServletRequest request,MultipartFile file) {
		fileUpload.FileAdd(request, file);
		return "path";
	}
}
