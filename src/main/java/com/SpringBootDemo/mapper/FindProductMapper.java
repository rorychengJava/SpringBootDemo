package com.SpringBootDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.SpringBootDemo.util.Products;

@Mapper
public interface FindProductMapper {
	//搜索mysql中的products表中字段
	List<Products> findAll();
}
