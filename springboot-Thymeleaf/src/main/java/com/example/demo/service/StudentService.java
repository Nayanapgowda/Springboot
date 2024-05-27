package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Dto.StudentDto;

@Service
public class StudentService {
	
@Autowired
StudentDao dao;

public String insert(StudentDto studentDto) {
	return dao.insert(studentDto);
}

public List<StudentDto> fetchAll(){
	List<StudentDto> list=dao.fetchAll();
	if(list.isEmpty()) {
		return null;
	}
	else
		return list;
}
}
