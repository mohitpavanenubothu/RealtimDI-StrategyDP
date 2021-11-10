package com.spring.rtdi.dao;

import com.spring.rtdi.bo.EmployeeBO;

public interface IEmployeeDAO {
	public int insertEmployee(EmployeeBO bo) throws Exception;

}
