package com.ems_backend.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ems_backend.entity.Employee;
import com.ems_backend.repository.Emp_repo;

@Service
public class Emp_service {
	
	private Emp_repo repo;
	
	public Emp_service(Emp_repo repo) {
		this.repo = repo;
		
	}
	
	public Object insertEmp(Employee employee) {
		repo.save(employee);
		return "data inserted successfully";
	}
	
	public  Optional<Employee> fetchEmployee(int id){
		return repo.findById(id);
	}
	
	public  Optional<Employee> fetchByEmail(String email){
		return repo.findByEmail(email);
	}
	

}
