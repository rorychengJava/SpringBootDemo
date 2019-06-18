package com.SpringBootDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.SpringBootDemo.util.CompanyInfo;
import com.SpringBootDemo.util.User;

@Mapper
public interface UserMapper {
	
	//使用pagehelper分页查询
	 List<User> findUserPage ();

}
