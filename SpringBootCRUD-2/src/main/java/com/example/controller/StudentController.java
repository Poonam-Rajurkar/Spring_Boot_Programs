package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("Student/addStudent")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student stud){
		return new ResponseEntity<Student>(ss.addStudent(stud), HttpStatus.CREATED);
	}

}
