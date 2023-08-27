package com.springboot.restapi.services;

import java.util.List;

import com.springboot.restapi.entities.Courses;

public interface CourseService {
	
	public List<Courses> getCourses();
	public Courses getCourse(long courseId);
	public Courses addCourse(Courses course);
}
