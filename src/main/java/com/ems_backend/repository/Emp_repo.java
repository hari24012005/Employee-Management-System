package com.ems_backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems_backend.entity.Employee;

public interface Emp_repo extends JpaRepository<Employee, Integer>{
	Optional<Employee> findByEmail(String email);

}
