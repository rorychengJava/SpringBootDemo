package com.SpringBootDemo.service.impl;

import java.io.File;
import java.io.IOException;

import javax.mail.Multipart;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.SpringBootDemo.service.FileUpload;

@Service
public class FileUploadImpl implements FileUpload{

	public void FileAdd(HttpServletRequest request,MultipartFile file) {
		//创建服务器端的文件夹
		String path=request.getServletContext().getRealPath("/upload");
		File files=new File(path);
		if(!files.exists()) {
			files.mkdirs();
		}
		//获取文件名
		String filename=file.getOriginalFilename();
		File filess=new File(files+"/"+filename);
		try {
			file.transferTo(filess);
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
	}

}
