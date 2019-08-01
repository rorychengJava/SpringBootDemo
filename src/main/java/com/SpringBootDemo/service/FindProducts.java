package com.SpringBootDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.SpringBootDemo.util.Products;

@Service
public interface FindProducts {
		
	List<Products> findAll();
}
