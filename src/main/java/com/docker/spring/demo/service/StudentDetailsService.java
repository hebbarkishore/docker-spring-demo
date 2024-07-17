package com.docker.spring.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.docker.spring.demo.entity.StudentEntity;
import com.docker.spring.demo.reposity.StudentDetailsRepository;

@Service
public class StudentDetailsService {
	
	@Autowired
	StudentDetailsRepository StudentRepository;
	
	@Transactional
	public StudentEntity saveStudentDetails(StudentEntity StudentEntity) {
		return StudentRepository.save(StudentEntity);
	}
	
	@Transactional
	public List<StudentEntity> getAllStudentDetails() {
		return StudentRepository.findAll();
	}

}
