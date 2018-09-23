package com.emp.employee.register.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.employee.register.entites.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
