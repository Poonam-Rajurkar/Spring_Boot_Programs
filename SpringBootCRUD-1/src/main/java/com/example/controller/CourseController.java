package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Courses;
import com.example.service.CourseService;

import jakarta.validation.Valid;

@RestController
public class CourseController {

	@Autowired
	CourseService cs;
	
	@PostMapping("/Courses/setcourses")
	public ResponseEntity<Courses> saveCourse(@Valid @RequestBody Courses course){
		return new ResponseEntity<Courses>(cs.addCourse(course),
				HttpStatus.CREATED);
	} 
	
	@GetMapping("/Courses/getcourses")
	public List<Courses> getCourses(){
		return cs.getAllCourses();
	}
	
	@GetMapping("/Courses/getcourses/{cid}")
	public ResponseEntity<Courses> getCourses(@PathVariable("cid") int cid){
		return new ResponseEntity<Courses>(cs.getCourseDetail(cid),HttpStatus.OK);
	}
}
