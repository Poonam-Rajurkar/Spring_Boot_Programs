package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	private int did;
	
	@Column(length = 20, nullable = true)
    
	private String deptName;
	
	@Column(length = 20)
	private String deptHOD;
	
	@Column(length = 40, nullable = true)
	
	private int noOfEmp;

	public Object getOnOfEmpl() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setOnOfEmpl(Object onOfEmpl) {
		// TODO Auto-generated method stub
		
	}
	
}
