package com.simpleproject.repo;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.simpleproject.entity.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}