package com.example.service;

import java.util.List;

import com.example.entity.Department;

public interface DepartmentService {

	Department addDepartment(Department department);
	
	Department getDeptDetail(int did);
	
	List<Department> getAllDept();
		
	Department updateDeptDetail(Department department, int did);

}
