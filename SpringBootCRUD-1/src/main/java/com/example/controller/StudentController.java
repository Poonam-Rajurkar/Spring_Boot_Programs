package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/Students/addStudents")
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody Student stud){
		return new ResponseEntity<Student>(ss.addStudents(stud),
				HttpStatus.CREATED);
	}
	
	@GetMapping("/Students/getStudents/{sid}")
	public ResponseEntity<Student> getStudent(@PathVariable("sid") int sid){
		return new ResponseEntity<Student>(ss.getStudentDetail(sid),HttpStatus.OK);
	}
	
	@DeleteMapping("Students/removeStudents/{sid}")
	public ResponseEntity<String> deleteStudent(@PathVariable("sid") int sid){
		ss.deleteStudentDetail(sid);
		return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
	}
	
	@PutMapping("/Students/editStudents/{sid}")
	public ResponseEntity<Student> editStudent(@Valid @PathVariable("sid") int sid, @RequestBody Student stud){
		return new ResponseEntity<Student>(ss.updateStudentDetail(stud, sid), HttpStatus.OK);
	}
}
