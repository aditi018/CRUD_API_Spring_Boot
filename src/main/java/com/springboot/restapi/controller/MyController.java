package com.springboot.restapi.controller;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entities.Courses;


@RestController
public class MyController {
	
	//get all courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		
		
	}
	
}
