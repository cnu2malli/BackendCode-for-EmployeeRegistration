package com.emp.employee.register.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emp.employee.register.entites.Employee;
import com.emp.employee.register.repositories.EmployeeRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="http://localhost:4200", allowedHeaders="*")
public class EmployeeRegisterController {
	@Autowired
	private EmployeeRepository empRepository;

	@GetMapping("/employees")
	public static List<Employee> getEmployess() {
		return empRepository.findAll();
	}
 
	@GetMapping("/emp/{id}")
	public static Employee getEmp(@PathVariable Long id) {
		return empRepository.findOne(id);
	}

	@DeleteMapping("/emp/{id}")
	public static boolean deleteEmp(@PathVariable Long id) {
		empRepository.delete(id);
		return true;
	}

	@PutMapping("/emp")
	public static Employee updateEmp(@RequestBody Employee user) {
		return empRepository.save(user);
	}

	@PostMapping("/emp")
	public static Employee createEmp(@RequestBody Employee user) {
		return empRepository.save(user);
	}

}
