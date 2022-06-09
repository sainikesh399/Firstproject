package com.simpleproject.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpleproject.entity.Student;
import com.simpleproject.repo.StudentRepo;
import com.simpleproject.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo studentrepo;

	@Override
	public Student postStudent(Student student) {
		
		return studentrepo.save(student);
	}

	@Override
	public List<Student> findall() {
		
		return studentrepo.findAll();
	}

	@Override
	public Student deleteStudent(Long id) {
		Optional<Student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			Student thisproduct = optional.get();
			studentrepo.delete(thisproduct);
		}
		return null;
	}

	@Override
	public Student updateStudent(Student student, Long id) {
		Optional<Student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			studentrepo.save(student);
			return student;
		}
		return null;
	}

	@Override
	public Student findbyid(Long id) {
		Optional<Student> optional = studentrepo.findById(id);
		if(optional.isPresent()) {
			Student student = optional.get();
			return student;
		}
		return null;
	}

}
