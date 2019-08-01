package com.SpringBootDemo.util;

import java.io.Serializable;


public class Products implements Serializable{
	
	private String productCode;
	private String productName;
	
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}
