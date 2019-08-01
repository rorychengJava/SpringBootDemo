package com.SpringBootDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.mapper.FindProductMapper;
import com.SpringBootDemo.service.FindProducts;
import com.SpringBootDemo.util.Products;

@Service
public class FindProductsImpl implements FindProducts{

	@Autowired
	private FindProductMapper findProductMapper;
	
	@Cacheable(value="list")
	public List<Products> findAll() {
		System.out.println("从数据库中查询......");
		return findProductMapper.findAll();
	}

}
