package com.example.controller;

import java.util.List;

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

import com.example.entity.Teacher;
import com.example.service.TeacherService;

import jakarta.validation.Valid;

//handle all incoming request of Teacher Entity
@RestController
public class TeacherController {

	@Autowired
	TeacherService ts;
	
	//use post-mapping to insert data 
	@PostMapping("Teacher/addTeacher")
	public ResponseEntity<Teacher> saveTeacher(@Valid @RequestBody Teacher teach)
	{
		return new ResponseEntity<Teacher>(ts.addTeacher(teach), HttpStatus.CREATED);
	}
	
	//use get-mapping to fetch data from db table
		@GetMapping("/Teacher/getTeacher/{tid}")
		public ResponseEntity<Teacher> getTeacher(@PathVariable("tid") int tid){
			return new ResponseEntity<Teacher>(ts.getTeacherDetail(tid),HttpStatus.OK);
		}
		
		//use put-mapping to edit existing data
		@PutMapping("/Teacher/editTeacher/{tid}")
		public ResponseEntity<Teacher> editTeacher(@Valid @PathVariable("tid") int tid, @RequestBody Teacher teacher){
			return new ResponseEntity<Teacher>(ts.updateTeacherDetail(teacher, tid), HttpStatus.OK);
		}
		
		
		//use delete-mapping to remove existing data
		@DeleteMapping("Teacher/removeTeacher/{tid}")
		public ResponseEntity<String> deleteTeacher(@PathVariable("tid") int tid){
			ts.deleteTeacherDetail(tid);
			return new ResponseEntity<String>("Deleted Successfully..", HttpStatus.OK);
		}
		
		@GetMapping("Teacher/getTName/{tname}")
		public List<Teacher> getTeacherName(@PathVariable("tname") String tname){
			return ts.getTeacherByName(tname);
		}
		
		@GetMapping("Teacher/getTPhone/{tphone}")
		public ResponseEntity<Teacher> getTeacherPhone(@PathVariable("tphone") long tphone){
			return new ResponseEntity<Teacher>(ts.getTeacherByPhone(tphone), HttpStatus.OK);
		}
		
		
		@GetMapping("Teacher/getTDesignation/{designation}")
		public List<Teacher> getTeacherDesignation(@PathVariable("designation") String designation){
			return ts.getTeacherDesignation(designation);
		}
}

