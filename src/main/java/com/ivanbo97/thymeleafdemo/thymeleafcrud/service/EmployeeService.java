package com.ivanbo97.thymeleafdemo.thymeleafcrud.service;

import java.util.List;

import com.ivanbo97.thymeleafdemo.thymeleafcrud.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int employeeId);
	
	public void save (Employee employee);
	
	public void deleteById (int employeeId);
}
