/**
 * 
 */
package com.SpringBootDemo.mapper;

import java.util.List;

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
}
