package com.SpringBootDemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.SpringBootDemo.mapper.CompanyMapper;
import com.SpringBootDemo.util.CompanyInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Autowired
	private CompanyMapper companyMapper;
	
	@Test
	public void test1() {
		List<CompanyInfo> list=companyMapper.findCompanyById("1001");
		for (CompanyInfo companyInfo : list) {
			System.out.println(companyInfo.getScode());
		}
		
		
	}

}
