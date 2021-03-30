package com.ivanbo97.thymeleafdemo.thymeleafcrud.service;

import java.util.List;
import java.util.Optional;

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
		return employeeRepository.findAllByOrderByLastNameAsc();
	}

	@Override
	public Employee findById(int employeeId) {
		
		Optional<Employee> result = employeeRepository.findById(employeeId);
		
		Employee theEmployee = null;
		if(result.isPresent()) {
			theEmployee = result.get();
		} else {
			throw new RuntimeException("Did not find employee id  - " + employeeId);
		}
		
		return theEmployee;
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
