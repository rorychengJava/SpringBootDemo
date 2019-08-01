package com.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.service.FindProducts;
import com.SpringBootDemo.util.Products;

@RestController
public class FindProductController {
	
	@Autowired
	private FindProducts findProducts;
	
	@RequestMapping("/product")
	public List<Products> findAll(){
		
		return findProducts.findAll();
	}

}
