package com.fis.springlearn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.bean.Employee;
import com.fis.springlearn.controller.EmployeeController;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
//		SpringApplication.run(SpringLearnApplication.class, args);
//		LOGGER.info("Start");
//		displayDate();
//		displayCountry();

//		displayCountries();
		
//		displayEmployee();
		
//		getEmployeeController();
		
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeController.class);
		displayEmployeeControllerAnnotation(applicationContext);
	}
	
	
	
	public static void displayEmployeeControllerAnnotation(ApplicationContext applicationContext) {
		LOGGER.info("START");
		EmployeeController employeeController = applicationContext.getBean("employeeController",
				EmployeeController.class);
		LOGGER.debug("EmployeeController : {}", employeeController);
		LOGGER.info("END");

	}
	
	
	static void getEmployeeController() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		EmployeeController employeeController = context.getBean("controller", EmployeeController.class);
		LOGGER.debug("EmployeeController : {}", employeeController);
	}
	
	
	static void displayEmployee() {
		ApplicationContext context = new ClassPathXmlApplicationContext("employee.xml");
		Employee emp =context.getBean("employee", Employee.class);

		LOGGER.debug("Employee : {}", emp.toString());
	}

	static void displayCountries() {

		LOGGER.debug("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		ArrayList<Country> countriesList = context.getBean("countryList",ArrayList.class);

		LOGGER.debug("Countries "+countriesList);

		LOGGER.debug("END");
	}

	static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
		try {
			Date parseDate = format.parse("31/12/2018");
			System.out.println(parseDate);
			LOGGER.debug(parseDate.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

		LOGGER.info("End");
	}

	static void displayCountry() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("country", Country.class);
		Country anotherCountry = context.getBean("country", Country.class);

		LOGGER.debug("Country : {}", country.toString());

	}

}
