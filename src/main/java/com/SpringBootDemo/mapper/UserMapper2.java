package com.SpringBootDemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.SpringBootDemo.util.User;
@Mapper
public interface UserMapper2 {
	
	//通过mybatis注解的方式进行配置
	@Select("select suser,spassword from sys_user where suser=#{suser}")
	User findUserByName(@Param("suser") String suser);
	
	@Insert("insert into sys_user(suser,spassword) values(#{suser},#{spassword})")
//	void insertUser(@Param("suser") String suser,@Param("spassword") String spassword);
	void insertUser(User user);

}
