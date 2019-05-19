/**
 * 
 */
package com.SpringBootDemo.mapper;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * @author cr
 *
 */
@Service
public interface Company {
	public List findCompanyById(int id);
}
