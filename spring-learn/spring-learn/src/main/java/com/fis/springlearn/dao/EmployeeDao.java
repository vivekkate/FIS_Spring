package com.fis.springlearn.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.fis.springlearn.bean.Department;
@Component
public class EmployeeDao {

	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDao.class);
	
	public EmployeeDao() {
		LOGGER.debug("Inside Employee Dao");
	}
	

}
