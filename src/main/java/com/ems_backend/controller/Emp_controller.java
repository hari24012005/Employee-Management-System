package com.ems_backend.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ems_backend.entity.Employee;
import com.ems_backend.service.Emp_service;

@RestController
@RequestMapping("/employee")
public class Emp_controller {
	
	private final Emp_service service;
	
	public Emp_controller (Emp_service service) {
		this.service = service;
	}
	
	@PostMapping("/save")
	public Object insertingEmp(@RequestBody Employee employee) {
		return service.insertEmp(employee);
	}
	
	@GetMapping("/id")
	public Optional<Employee> fetchData(@PathVariable int id){
		return service.fetchEmployee(id);
	}
	
	@GetMapping("/email")
	public Optional<Employee> fetchByEmail(@PathVariable String email){
		return service.fetchByEmail(email);
	}
	

}
