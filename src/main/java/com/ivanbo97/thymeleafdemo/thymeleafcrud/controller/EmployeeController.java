package com.ivanbo97.thymeleafdemo.thymeleafcrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import com.ivanbo97.thymeleafdemo.thymeleafcrud.entity.Employee;
import com.ivanbo97.thymeleafdemo.thymeleafcrud.service.EmployeeService;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.EMPLOYEES_BASE_URL;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.EMPLOYEES_FORM_URL;
import static com.ivanbo97.thymeleafdemo.thymeleafcrud.util.ApplicationConstants.EMPLOYEES_FORM_SAVE_URL;

@Controller
public class EmployeeController {

	private EmployeeService employeeService;
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping(EMPLOYEES_BASE_URL)
	public String getEmployees(Model theModel) {
		
		List<Employee> employees = employeeService.findAll();
		
		theModel.addAttribute("employees", employees);
		return "employee-list";
	}
	
	@GetMapping(EMPLOYEES_FORM_URL)
	public String showEmployeeFrom(Model theModel) {
		
		Employee employee = new Employee();
		
		theModel.addAttribute("employee", employee);
		
		return "employee-form";
	}
	
	@PostMapping(EMPLOYEES_FORM_SAVE_URL)
	public String saveEmployee(@ModelAttribute("employee")Employee employee) {
		
		employeeService.save(employee);
		return "redirect:"+EMPLOYEES_BASE_URL;
	}
}
