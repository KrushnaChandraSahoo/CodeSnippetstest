package com.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Department;

public interface DeptRepo extends JpaRepository<Department,Integer>{

}
