package com.ems_backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
	
	@Id
   private int emp_id;
   
   private String emp_name;
   
   
   @Column(name = "email")
   private String email;
   
   
   private String emp_dept;
   
   public int getEmp_id() {
	return emp_id;
   }
   public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
   }
   public String getEmp_name() {
	return emp_name;
   }
   public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
   }
  
   public String getEmail() {
	return email;
}
   public void setEmail(String email) {
	this.email = email;
   }
   public String getEmp_dept() {
	return emp_dept;
   }
   public void setEmp_dept(String emp_dept) {
	this.emp_dept = emp_dept;
   }
}
