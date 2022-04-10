package com.pius.employee_rest_api.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pius.employee_rest_api.model.Employee;
import com.pius.employee_rest_api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository eRepostory;

	@Override
	public List<Employee> getEmployees() {
		
		return eRepostory.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		return eRepostory.save(employee);
	}
	


}
