package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dto.StudentDto;

public interface StudentRepository extends JpaRepository<StudentDto, Integer>{

}
