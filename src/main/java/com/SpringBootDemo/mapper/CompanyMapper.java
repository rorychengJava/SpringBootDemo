/**
 * 
 */
package com.SpringBootDemo.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Mapper;

import com.SpringBootDemo.util.CompanyInfo;

/**
 * @author cr
 *
 */
@Mapper
public interface CompanyMapper {
	
	//根据公司ID查找
	 List<CompanyInfo> findCompanyById(String scode);
	 
	 //根据用户名查找公司对应信息
	 //由于该查询无相对应实体类字段可以接受，故直接使用map的key-value对应关系进行存数据放到list中
	 List<Map<String, Object>> findCompanyInfo(String user);
}
