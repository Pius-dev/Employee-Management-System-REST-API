package com.pius.employee_rest_api.model;




import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {
	
	//@JsonProperty("full_name")
	private String name;
	
	//@JsonIgnore This ignores 
	private Long age;
	
	private String location;
	
	private String email;
	
	private String department;
	

}
