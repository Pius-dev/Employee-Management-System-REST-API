package com.pius.employee_rest_api.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;



import com.pius.employee_rest_api.model.Employee;
import com.pius.employee_rest_api.service.EmployeeService;



@RestController // @Controller + @ResponseBody
//@RequestMapping("/api/employees")    // The Base path is set on the property file  
public class EmplyeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@Value("${app.name}")
	private String appName;
	
	@Value("${app.version}")
	private String appVersion;
	
	@GetMapping("/version")
	public String getAppDetails () {
		return appName+ " _ "+appVersion;
	}
	
	
	//@RequestMapping(value= "/employees", method = RequestMethod.GET)
	
	@GetMapping("/getAll")
	public List<Employee> getEmployees () {
		return eService.getEmployees();
	}
	 
	 @GetMapping("/get/{id}")
	 public String getEmployee (@PathVariable Long id) {
		 
		 return "Fatching the employee details for the id " + id;
			
		}
	 @PostMapping("/add")
	 public String saveEmployee (@RequestBody Employee employee) {
		return "Saving the employees details on the database" + employee;
		 
	 }
	 
	 @PutMapping("/update/{id}")
	 public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
		 System.out.println("Updating the employee data for the id"+id);
		 return employee;
		 
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public String deleteEmployee (@RequestParam Long id ) {
		 
		 return "Deleting the employee details forthe id" + id;
		 
	 }

}
