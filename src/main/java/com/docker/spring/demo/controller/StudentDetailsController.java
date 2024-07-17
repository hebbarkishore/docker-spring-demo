package com.docker.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.spring.demo.entity.StudentEntity;
import com.docker.spring.demo.service.StudentDetailsService;

@RestController
@RequestMapping("/student")
public class StudentDetailsController {
	
	@Autowired
	StudentDetailsService studentDetailService;
	
	@GetMapping("/getAll")
	public List<StudentEntity> getAllStudents() {
		return studentDetailService.getAllStudentDetails();
	}
	
	@PostMapping("/save")
	public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity) {
		return studentDetailService.saveStudentDetails(studentEntity);
	}

}
