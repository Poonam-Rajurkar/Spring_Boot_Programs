package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="TrainersInfo")
@Data	//Getter & Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

	@Id
	private int tid;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Trainer name cannot be blank.")
	private String tname;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Trainer surname cannot be blank.")
	private String tsurname;
	
	@Column(length=25, nullable = false, unique = true)
	@NotBlank(message = "Trainer email id cannot be blank.")
	@Email(message = "Email id is incorrect.")
	private String temail;
	
	@Column(length=11, nullable = false, unique = true)
	@NotNull(message = "Trainer phone number cannot be null.")
	private long tphone;
	
	@Column(length=25, nullable = false)
	@NotBlank(message = "Designation cannot be blank.")
	private String designation;
	
}
