package com.ivanbo97.thymeleafdemo.thymeleafcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivanbo97.thymeleafdemo.thymeleafcrud.entity.Employee;
import com.ivanbo97.thymeleafdemo.thymeleafcrud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}
	
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Employee employee) {
		// TODO Auto-generated method stub

	}

}
