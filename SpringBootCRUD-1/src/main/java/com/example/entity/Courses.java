package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Data
public class Courses {
	@Id
	private int cid;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Course name cannot be blank.")
	private String courseName;
	
	@Column(length = 8, nullable  = false)
	@NotBlank(message = "Duration cannot be blank.")
	private String duration;
	
	@Column(length = 10, nullable = true)
	@NotNull(message = "Fees cannot be null.")
	private double courseFee;
}
