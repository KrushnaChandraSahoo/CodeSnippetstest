package com.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.student.entity.Subjects;


public interface SubRepo extends JpaRepository<Subjects,String>{

}
