package com.student.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Department;
import com.student.entity.Student;
import com.student.entity.Subjects;
import com.student.repository.DeptRepo;
import com.student.repository.StdRepo;
import com.student.repository.SubRepo;

@Service
public class Stdserviceimpl implements IService {
	
	
	@Autowired
	private StdRepo stdr;
	@Autowired
	private DeptRepo dept;
	@Autowired
	private SubRepo sub;

	@Override
	public List<Student> getStudent() {
		return stdr.findAll();
	}

	@Override
	public void addStudent(Student student) {
		stdr.save(student);
		
	}

	@Override
	public Student getStudentById(Long id) {
		return stdr.findById(id).orElseThrow(null);
	}

	@Override
	public void deleteById(Long id) {
		stdr.deleteById(id);
	}

	

	@Override
	public void addDepartment(Department department) {
		dept.save(department);
		
	}

	@Override
	public void addSubjects(Subjects subject) {
		sub.save(subject);
		
	}

	@Override
	public List<Department> getAllDepartment() {
		// TODO Auto-generated method stub
		return dept.findAll();
	}

	@Override
	public List<Subjects> getAllSubjects() {
		// TODO Auto-generated method stub
		return sub.findAll();
	}

	
	}
	


