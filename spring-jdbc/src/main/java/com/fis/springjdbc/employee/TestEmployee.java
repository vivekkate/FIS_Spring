package com.fis.springjdbc.employee;

import java.util.*;
import java.lang.*;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springjdbc.product.Product;

//import com.fis.springjdbc.employee.Employee;
//import com.fis.springjdbc.employee.EmployeeDAOImpl;
//import com.fis.springjdbc.product.Product;

public class TestEmployee {
	
	
	
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoexample.xml");
		EmployeeDAOImpl bean = context.getBean("employeeDao", EmployeeDAOImpl.class);
		
		
		System.out.println("===============================");
		System.out.println("Insert a Employee");
		Employee newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("abc");
		bean.insertEmployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Delete Employee");
		int id = 10;
		bean.deleteEmployee(id);
		System.out.println("===============================");
		System.out.println("Get Employee Based on Id");
		id = 20;
		Employee employeeById = bean.getEmployeetById(id);
		System.out.println(employeeById);
		System.out.println("===============================");
		System.out.println("Update Employee");
		newEmployee = new Employee();
		newEmployee.setId(30);
		newEmployee.setName("xyz");
		bean.updateEmployee(newEmployee);
		System.out.println("===============================");
		System.out.println("Get All Employees");
		System.out.println(bean.getAllEmployee1());
		System.out.println("===============================");

		context.close();

	}
	
	
	
	



}
