/**
 * 
 */
package com.SpringBootDemo.util;

import java.io.Serializable;

/**
 * @author cr
 *
 */

public class CompanyInfo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String scode;
	
	private String sname;
	
	private int nlevel;

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getNlevel() {
		return nlevel;
	}

	public void setNlevel(int nlevel) {
		this.nlevel = nlevel;
	}
	
}
