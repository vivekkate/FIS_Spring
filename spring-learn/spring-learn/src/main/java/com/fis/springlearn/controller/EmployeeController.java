package com.fis.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fis.springlearn.bean.Department;
import com.fis.springlearn.service.EmployeeService;

public class EmployeeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);
	
	EmployeeService employeeService;
	
	public EmployeeController() {
		
		LOGGER.debug("Inside Employee Controller");
	}
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


}
