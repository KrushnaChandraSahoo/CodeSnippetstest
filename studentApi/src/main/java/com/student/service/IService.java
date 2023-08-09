package com.student.service;

import java.util.List;


import com.student.entity.Department;
import com.student.entity.Student;
import com.student.entity.Subjects;

public interface IService {
	
	public List<Student> getStudent();
	public void addStudent(Student student);
	public Student getStudentById(Long id);
	public void deleteById(Long id);
	public void addDepartment(Department department);
	public void addSubjects(Subjects subject);
	public List<Department> getAllDepartment();
	public List<Subjects> getAllSubjects();

}
