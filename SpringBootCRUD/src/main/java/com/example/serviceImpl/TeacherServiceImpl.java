package com.example.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.repository.TeacherRepository;
import com.example.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	//it will take all getters setters of repository class automatically
	@Autowired
	TeacherRepository trepo;
	
	@Override
	public Teacher addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		return trepo.save(teacher);
	}

}
