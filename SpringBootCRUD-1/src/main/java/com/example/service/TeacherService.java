package com.example.service;

import java.util.List;

import com.example.entity.Teacher;

//abstract method for performing CRUD on teacher entity
public interface TeacherService {

	//method for saving teacher details in db table
	Teacher addTeacher(Teacher teach);
	
	//method to fetch teacher details based on tid from db table
	Teacher getTeacherDetail(int tid);
		
	//method to modify teacher details based on tid from db table
	Teacher updateTeacherDetail(Teacher teach, int tid);
	
	//method to remove teacher detail based on tid from db table
	void deleteTeacherDetail(int tid);
	
	//method to fetch teacher details based on phone number from db table
	Teacher getTeacherByPhone(long tphone);
	
	//method to fetch teacher details based on first name
	List<Teacher> getTeacherByName(String tname);
	
	//method to fetch teacher details based on designation
	List<Teacher> getTeacherDesignation(String designation);
	
}
