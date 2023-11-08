package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Teacher;
import com.example.exception.TeacherIdNotFoundException;
import com.example.repository.TeacherRepository;
import com.example.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	TeacherRepository trepo;

	//use save() of Jpa repository for saving details
	@Override
	public Teacher addTeacher(Teacher teach) {
		// TODO Auto-generated method stub
		return trepo.save(teach);
	}

	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	@Override
	public Teacher getTeacherDetail(int tid) {
		return trepo.findById(tid).
	         orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	}

	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	// if found update phone,designation & save new records
	@Override
	public Teacher updateTeacherDetail(Teacher teach, int tid) {
		Teacher updatedTeacher = trepo.findById(tid).
		         orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));

		//set new values
		updatedTeacher.setTphone(teach.getTphone());
		updatedTeacher.setDesignation(teach.getDesignation());
		
		trepo.save(updatedTeacher); //saving updated details 
		return updatedTeacher; 
	}

	//use findById of Jpa repository for fetching record if not found
	//then throw custom exception
	//if found use deleteById to remove record
	@Override
	public void deleteTeacherDetail(int tid){
		trepo.findById(tid).
		orElseThrow(()-> new TeacherIdNotFoundException("Teacher Id is not correct"));
	    trepo.deleteById(tid);
	}

	//use findTeacherByPhone of Teacher repository for fetching record
	@Override
	public Teacher getTeacherByPhone(long tphone) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByPhone(tphone);
	}

	//use findTeacherByName of Teacher repository for fetching record
	@Override
	public List<Teacher> getTeacherByName(String tname) {
		// TODO Auto-generated method stub
		return trepo.findTeacherByName(tname);
	}

	@Override
	public List<Teacher> getTeacherDesignation(String designation) {
		// TODO Auto-generated method stub
		return trepo.findTeacherDesignation(designation);
	}
	
}
