package com.pius.employee_rest_api.controller;




import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


import com.pius.employee_rest_api.model.Employee;
import com.pius.employee_rest_api.repository.EmployeeRepository;
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
	 public Employee getEmployee (@PathVariable Long id) {
		 
		return eService.getSingleEmployee(id);
			
		}
	 @PostMapping("/add")
	 public Employee saveEmployee (@RequestBody Employee employee) {
		 
		        return eService.saveEmployee(employee);
		
	 }
	 
	 @PutMapping("/update/{id}")
	 public Employee updateEmployee (@PathVariable Long id, @RequestBody Employee employee) {
		 employee.setId(id);
		 return eService.updateEmployee(employee);
		 
	 }
	 
	 @DeleteMapping("/delete/{id}")
	 public void deleteEmployee (@RequestParam Long id ) {
		 
		 eService.deleteEmployee(id);
		 
	 }

}
