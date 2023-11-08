package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Courses;
import com.example.exception.CourseNotFoundException;
import com.example.repository.CourseRepository;
import com.example.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService{

	@Autowired
	CourseRepository crepo;
	
	@Override
	public Courses getCourseDetail(int cid) {
		return crepo.findById(cid).orElseThrow(()-> new CourseNotFoundException("Incorrect Course Entered"));
	}

	@Override
	public List<Courses> getAllCourses() {
		// TODO Auto-generated method stub
		return crepo.findAll();
	}

	@Override
	public Courses addCourse(Courses course) {
		// TODO Auto-generated method stub
		return crepo.save(course);
	}

}
