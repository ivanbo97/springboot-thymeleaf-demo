package com.ivanbo97.thymeleafdemo.thymeleafcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivanbo97.thymeleafdemo.thymeleafcrud.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
