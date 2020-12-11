package com.springboot.tutorial.service;

import java.util.List;
import com.springboot.tutorial.entity.Employee;
public interface EmployeeService {

	List<Employee> listAll();

	Employee saveEmployee(Employee employee);

	Employee findEmployeeById(Long id);

	List<Employee> saveEmployees(List<Employee> employeeList);

	List<Employee> getEmployees();
//
//	Employee getEmployeeById(int id);
//
//	Employee getEmployeeByName(String employee);
//
//	String deleteEmployee(int id);

//	Employee updateEmployee(Employee product);


}
