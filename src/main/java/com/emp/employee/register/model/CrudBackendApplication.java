package com.emp.employee.register.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.emp.employee.register.entites.Employee;
import com.emp.employee.register.repositories.EmployeeRepository;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepository empRepository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(CrudBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		empRepository.save(new Employee("emp", "emp"));
		
		
	}
}
