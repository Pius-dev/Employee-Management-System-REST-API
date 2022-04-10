package com.pius.employee_rest_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pius.employee_rest_api.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
