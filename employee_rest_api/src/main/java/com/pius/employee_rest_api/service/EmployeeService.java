package com.pius.employee_rest_api.service;

import java.util.List;

import com.pius.employee_rest_api.model.Employee;

public interface EmployeeService {
	
	List<Employee> getEmployees();
	
	Employee saveEmployee (Employee employee);
	

}
