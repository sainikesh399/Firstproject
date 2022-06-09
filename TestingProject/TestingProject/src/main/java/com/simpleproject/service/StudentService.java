package com.simpleproject.service;

import java.util.List; 

import org.springframework.stereotype.Service;

import com.simpleproject.entity.Student;

@Service
public interface StudentService {
	Student postStudent(Student student);
	List<Student> findall();
	Student findbyid(Long id);
	Student deleteStudent(Long id);
	Student updateStudent(Student student, Long id);
	

}
