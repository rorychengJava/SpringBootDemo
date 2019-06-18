package com.SpringBootDemo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.mapper.UserMapper;
import com.SpringBootDemo.service.FindUserPage;
import com.SpringBootDemo.util.User;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class FindUserPageImpl implements FindUserPage{

		@Autowired
		private UserMapper userMapper;
		
	public List<User> findUserPage(int page, int rows) {
		//这个方法就是类似我们数据库操作的limit start ， count
		PageHelper.startPage(page, rows);
		List<User> list= userMapper.findUserPage();
		//获取分页对象
		PageInfo<User> pageInfo=new PageInfo<User>(list);
		//获取分页条数
		List<User> list2=pageInfo.getList();
		return list2;
	}

}
