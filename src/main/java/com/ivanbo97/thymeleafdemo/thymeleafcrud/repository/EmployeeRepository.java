package com.ivanbo97.thymeleafdemo.thymeleafcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivanbo97.thymeleafdemo.thymeleafcrud.entity.Employee;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	public List<Employee> findAllByOrderByLastNameAsc();
}
