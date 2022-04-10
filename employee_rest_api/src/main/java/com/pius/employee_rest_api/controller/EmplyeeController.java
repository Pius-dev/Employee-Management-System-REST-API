package com.pius.employee_rest_api.controller;




import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;



import com.pius.employee_rest_api.model.Employee;



@RestController // @Controller + @ResponseBody
@RequestMapping("/employees")      
public class EmplyeeController {
	
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
	public String getEmployees () {
		return "Displaying the list of employees";
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
