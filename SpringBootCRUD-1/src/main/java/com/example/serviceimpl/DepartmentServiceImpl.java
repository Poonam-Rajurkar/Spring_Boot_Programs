package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Department;
import com.example.exception.DepartmentIdNotFoundException;
import com.example.repository.DepartmentRepository;
import com.example.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	DepartmentRepository drepo;
	
	@Override
	public Department getDeptDetail(int did) {
		return drepo.findById(did).orElseThrow(()-> new DepartmentIdNotFoundException("Incorrect Department id"));
	}

	@Override
	public List<Department> getAllDept() {
		return drepo.findAll();
	}

	@Override
	public Department updateDeptDetail(Department department, int did) {
		Department newDept = drepo.findById(did).orElseThrow(()-> new DepartmentIdNotFoundException("Incorrect Department id"));
		
		newDept.setOnOfEmpl(department.getOnOfEmpl());
		newDept.setDeptHOD(department.getDeptHOD());
			
			drepo.save(newDept);
			return newDept;
	}

	@Override
	public Department addDepartment(Department department) {
		// TODO Auto-generated method stub
		return drepo.save(department);
	}

}
