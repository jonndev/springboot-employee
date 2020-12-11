package com.springboot.tutorial.controller;

import com.springboot.tutorial.entity.Employee;
import com.springboot.tutorial.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService service; 

	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@PostMapping("/addEmployees")
	public List<Employee> addEmployees(@RequestBody List<Employee> employees) {
		return service.saveEmployees(employees);
	}

	@GetMapping("/api/employees")
	public List<Employee> findAllEmployees() {
		return service.getEmployees();
	}

//	@GetMapping("/employeeById/{id}")
//	public Employee findEmployeeById(@PathVariable int id) {
//		return service.getEmployeeById(id);
//	}
//
//	@GetMapping("/employee/{name}")
//	public Employee findEmployeeByName(@PathVariable String name) {
//		return service.getEmployeeByName(name);
//	}
//
//	@PutMapping("/update")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		return service.updateEmployee(employee);
//	}
//
//	@DeleteMapping("/delete/{id}")
//	public String deleteEmployee(@PathVariable int id) {
//		return service.deleteEmployee(id);
//	}
}
