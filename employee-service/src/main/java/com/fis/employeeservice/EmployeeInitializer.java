package com.fis.employeeservice;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.fis.employeeservice.*;
import com.fis.employeeservice.*;

@Component
class EmployeeInitializer implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    EmployeeInitializer(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("abc", "xyz", "pqr", "lmn", "stq", "qwe", "qazx")
                .forEach(employee -> employeeRepository.save(new Employee(employee)));

        employeeRepository.findAll().forEach(System.out::println);
    }
}
