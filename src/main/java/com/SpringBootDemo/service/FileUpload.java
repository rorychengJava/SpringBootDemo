package com.SpringBootDemo.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;



public interface FileUpload {
	//文件上传
	void FileAdd(HttpServletRequest request,MultipartFile file);
}
