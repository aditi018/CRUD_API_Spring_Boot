package com.springboot.restapi.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.entities.Courses;
import com.springboot.restapi.services.CourseService;


@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home() {
		return "This is my home page";
	}
	
	//get all courses
	@GetMapping("/courses")
	public List<Courses> getCourses(){
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Courses getCourse(@PathVariable String courseId) {
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	@PostMapping(path ="/courses",consumes = "application/json")
	public Courses addCourse(@RequestBody Courses course) {
		 return this.courseService.addCourse(course);
	}
	
	@DeleteMapping("/courses/{courseId}")
	public Courses deleteCourses(@PathVariable String courseId) {
		return this.courseService.deleteCourses(Long.parseLong(courseId));
	}
	
	@PutMapping("/courses")
	public Courses updateCourses(@RequestBody Courses course) {
		return this.courseService.updateCourses(course);
	}
	
}
