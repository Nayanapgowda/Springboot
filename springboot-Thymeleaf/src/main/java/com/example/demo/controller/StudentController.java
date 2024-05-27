package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dto.StudentDto;
import com.example.demo.service.StudentService;
//@Component
@Controller
//@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/inserthtml")
	public String insert() {
		return "insert.html";
	}
	
	@ResponseBody
	@PostMapping("/insert")
	public String insert(@ModelAttribute StudentDto studentDto) {
//		System.out.println(studentDto);
		return service.insert(studentDto);
	}
	
	@GetMapping("/fetchall")
	public ModelAndView fetchAll() {
		List<StudentDto> list=service.fetchAll();
		ModelAndView modelAndView=new ModelAndView("fa.html");
		modelAndView.addObject("objects", list);
		return modelAndView;
	
	}
}
