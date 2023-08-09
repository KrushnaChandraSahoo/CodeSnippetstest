package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Student;

public interface StdRepo extends JpaRepository<Student, Long>{

}
