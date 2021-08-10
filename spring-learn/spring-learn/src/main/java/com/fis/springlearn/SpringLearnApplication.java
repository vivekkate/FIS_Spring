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
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fis.springlearn.bean.Employee;

@SpringBootApplication
public class SpringLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
//		LOGGER.info("Start");
//		displayDate();
//		displayCountry();

//		displayCountries();
		
		displayEmployee();
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
