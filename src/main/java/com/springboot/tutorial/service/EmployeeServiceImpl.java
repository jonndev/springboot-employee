package com.springboot.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.tutorial.entity.Employee;
import com.springboot.tutorial.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeRepository repo;
	
	@Override
	public List<Employee> listAll() {
		return repo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee emp) {
		repo.save(emp);
		return emp;
	}

	@Override
	public Employee findEmployeeById(Long id) {
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<Employee> saveEmployees(List<Employee> employeeList) {
		return repo.saveAll(employeeList);
	}

	@Override
	public List<Employee> getEmployees() {
		return repo.findAll();
	}

//	@Override
//	public Employee getEmployeeById(int id) {
//		return repo.findById(id).orElse(null);
//	}
//
//	@Override
//	public Employee getEmployeeByName(String employee) {
//		return repo.findByName(employee);
//	}
//
//	@Override
//	public String deleteEmployee(int id) {
//		repo.deleteById(id);
//		return "employee removed !! " + id;
//	}

}
