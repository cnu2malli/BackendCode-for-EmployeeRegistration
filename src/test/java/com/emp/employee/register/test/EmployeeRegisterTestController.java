package com.emp.employee.register.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.emp.employee.register.controllers.EmployeeRegisterController;
import com.emp.employee.register.entites.Employee;

public class EmployeeRegisterTestController {
	Employee employee = new Employee();
	EmployeeRegisterController controller = new EmployeeRegisterController();

	@Test
	public void testCreateEmployee_Successfully() {
		employee.setFname("sreenivas");
		employee.setLname("gownori");
		employee.setGender("male");
		employee.setDepartment("IT");
		 controller.createEmp(employee);
		
		assertEquals(employee.getFname(), controller.createEmp(employee).getFname());
		assertEquals(employee.getLname(), controller.createEmp(employee).getLname());
		assertEquals(employee.getDepartment(), controller.createEmp(employee).getDepartment());
	}
	@Test
	public void testUpdateEmployee_Successfully() {
		employee.setFname("sreenivas");
		employee.setLname("gownori");
		employee.setGender("male");
		employee.setDepartment("IT");
		 controller.updateEmp(employee);
		
		 assertEquals(employee.getFname(), controller.createEmp(employee).getFname());
			assertEquals(employee.getLname(), controller.createEmp(employee).getLname());
			assertEquals(employee.getDepartment(), controller.createEmp(employee).getDepartment());
	}
	@Test
	public void testDeleteEmployee_Successfully() {
		
		
		 controller.deleteEmp(employee.getId());
		 assertEquals(employee.getId(), controller.deleteEmp((employee).getId()));
	}
	@Test
	public void testGetAllEmployees() {


		List<Employee> emps = controller.getEmployess();
		if (emps != null) {
			assertEquals(emps, controller.getEmployess());

		}
	}

}
