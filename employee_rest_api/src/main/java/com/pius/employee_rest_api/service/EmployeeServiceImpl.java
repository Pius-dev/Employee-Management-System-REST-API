package com.pius.employee_rest_api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pius.employee_rest_api.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private static List<Employee> list  = new ArrayList<>();
	//Employee static object
	static {
		Employee e = new Employee();
		e.setName("Pius");
		e.setAge(24L);
		e.setDepartment("IT");
		e.setEmail("opius@gmail.com");
		e.setLocation("Tororo");
		list.add(e);
		
		e = new Employee();
		e.setName("obonyo");
		e.setAge(25L);
		e.setDepartment("LAW");
		e.setEmail("obonyo@gmail.com");
		e.setLocation("UK");
		list.add(e);
		
		e = new Employee();
		e.setName("Mary");
		e.setAge(26L);
		e.setDepartment("Business");
		e.setEmail("mary@gmail.com");
		e.setLocation("Wakiso");
		list.add(e);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return list;
	}

}
