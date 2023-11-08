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
@Table(name="StudentsInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Student name cannot be blank.")
	private String sname;
	
	@Column(length = 25)
	private String ssurname;
	
	@Column(length = 25, nullable = false, unique = true)
	@NotNull(message = "Student phone cannot be null.")
	private long sphone;
	
	@Column(length = 25, nullable = false, unique = true)
	@NotBlank(message = "Student email cannot be blank.")
	@Email(message = "Email is incorrect.")
	private String semail;
	
	@Column(length = 25, nullable = false)
	@NotBlank(message = "Student Education cannot be blank.")
	private String seducation;
	
	@Column(length = 50, nullable = false)
	@NotBlank(message = "Student address cannot be blank.")
	private String saddress;

	
	
}
