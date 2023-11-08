package com.example.service;

import java.util.List;

import com.example.entity.Courses;

public interface CourseService {

	Courses addCourse(Courses course);
	
	Courses getCourseDetail(int cid);
	
	List<Courses> getAllCourses();
		
}
