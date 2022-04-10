package com.pius.employee_rest_api.service;


import java.util.List;
import java.util.Optional;

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

	@Override
	public Employee getSingleEmployee(Long id) {
		
		Optional<Employee> employee = eRepostory.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		}
		throw new RuntimeException("Employee not found  for the id "+ id);
	}

	@Override
	public void deleteEmployee(Long id) {
		eRepostory.deleteById(id);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return eRepostory.save(employee);
	}
	


}
