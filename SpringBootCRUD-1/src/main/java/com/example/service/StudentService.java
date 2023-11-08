package com.example.service;

import com.example.entity.Student;

public interface StudentService {

	//method for saving Student details in db table
	Student addStudents(Student stud);
	
	//method to fetch Student details based on sid from db table
	Student getStudentDetail(int sid);
	
	//method to modify Student details based on sid from db table
	Student updateStudentDetail(Student stud,int sid);
	
	//method to remove Student details based on sid from db table
	void deleteStudentDetail(int sid);
}
