package com.docker.spring.demo.reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docker.spring.demo.entity.StudentEntity;

public interface StudentDetailsRepository extends JpaRepository<StudentEntity, Integer> {

}
