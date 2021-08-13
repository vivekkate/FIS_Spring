package com.fis.employeeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fis.employeeservice.*;

interface EmployeeRepository extends JpaRepository<Employee, Long> {}