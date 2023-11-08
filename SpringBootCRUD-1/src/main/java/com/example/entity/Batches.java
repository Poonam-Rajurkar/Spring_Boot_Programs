package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Batches {

	@Id
	private int bid;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Batch name cannot be blank.")
	private String bname;
	
	@Column(length = 20, nullable = false)
	@NotBlank(message = "Batch subject cannot be blank.")
	private String subject;
	
	private String startDate;
	
	private String endDate;
	
	private int duration;
	
}
