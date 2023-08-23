package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Department;
import com.student.entity.Student;
import com.student.entity.Subjects;
import com.student.service.IService;

@RestController
public class Controller {

	@Autowired
	private IService serv;
//	@By

	@GetMapping("/getStudent")
	public List<Student> getStudent() {
		return serv.getStudent();

	}

	@GetMapping("/getDept")
	public List<Department> getAllDepartment() {
		return serv.getAllDepartment();
	}

	@GetMapping("/getSub")
	public List<Subjects> getSubjects() {
		return serv.getAllSubjects();

	}

	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student student) {
		serv.addStudent(student);
	}

	@PostMapping("/addDept")
	public void addDepartment(@RequestBody Department department) {
		serv.addDepartment(department);
	}

	@PostMapping("/addSubject")
	public void addSubbjects(@RequestBody Subjects subject) {
		serv.addSubjects(subject);
	}

	@GetMapping("/getStudentById/{id}")
	public Student getStudentById(@PathVariable Long id) {
		return serv.getStudentById(id);

	}

	@DeleteMapping
	public void deleteById(@PathVariable Long id) {
		serv.deleteById(id);
	}

}
