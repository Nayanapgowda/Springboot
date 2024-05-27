package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.demo.Dto.StudentDto;
import com.example.demo.repository.StudentRepository;

@Component
public class StudentDao {

	@Autowired
	StudentRepository repository;
	
	public String insert(StudentDto studentDto) {
		repository.save(studentDto);
		return "data inserted";
	}
	
	public List<StudentDto> fetchAll() {
      	return	repository.findAll();
//		return "data is fetched";
	}
}
