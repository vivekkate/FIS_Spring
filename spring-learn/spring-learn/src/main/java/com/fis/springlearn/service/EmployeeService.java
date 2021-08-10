package com.fis.springlearn.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.bean.Department;
import com.fis.springlearn.dao.EmployeeDao;

public class EmployeeService {
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
	
	EmployeeDao employeeDao;
	
	public EmployeeService() {
		LOGGER.debug("Inside Employee Service");
	}
	
	
	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

}
