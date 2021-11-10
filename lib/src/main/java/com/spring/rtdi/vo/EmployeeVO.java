package com.spring.rtdi.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class EmployeeVO {
	private String eno;
	private String ename;
	private String desg;
	private String basicSalary;

	/*public String getEno() {
		return eno;
	}
	
	public void setEno(String eno) {
		this.eno = eno;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String getDesg() {
		return desg;
	}
	
	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	public String getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}*/

}
