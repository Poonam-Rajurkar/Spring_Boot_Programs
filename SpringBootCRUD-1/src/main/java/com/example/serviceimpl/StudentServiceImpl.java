package com.example.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Student;
import com.example.exception.StudentIdNotException;
import com.example.repository.StudentRepository;
import com.example.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository srepo;
	
	@Override
	public Student addStudents(Student stud) {
		return srepo.save(stud);
	}

	@Override
	public Student getStudentDetail(int sid) {
		return srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
	}

	@Override
	public Student updateStudentDetail(Student stud, int sid) {
		Student updatedstudent = srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));

		//set new values
		updatedstudent.setSeducation(stud.getSeducation());
		srepo.save(updatedstudent);
		return updatedstudent;
	}

	@Override
	public void deleteStudentDetail(int sid) {
		srepo.findById(sid).orElseThrow(()-> new StudentIdNotException("Student id is incorrect"));
		srepo.deleteById(sid);
		
	}

}
