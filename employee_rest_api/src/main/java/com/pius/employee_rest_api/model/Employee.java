package com.pius.employee_rest_api.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "Name")
	private String name;
	
	//@JsonIgnore This ignores 
	@Column(name = "Age")
	private Long age;
	
	@Column(name = "Location")
	private String location;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Department")
	private String department;
	

}
