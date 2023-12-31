package com.springboot.restapi.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.restapi.entities.Courses;

@Service

public class CourseServiceimpl implements CourseService {
	
	List<Courses> list;
	
	public CourseServiceimpl() {
		list = new ArrayList<>();
		list.add(new Courses(145,"Java Core Course" , "This course contains basic of java."));
		list.add(new Courses(4343, "Spring Boot Course","Creating restapi using spring boot."));
	}

	@Override
	public List<Courses> getCourses() {
		return list;
	}

	@Override
	public Courses getCourse(long courseId) {
		
		Courses c = null;
		for ( Courses course : list) {
			if(course.getId()==courseId) {
				c = course;
				break;
			}
		}
		
		return c;
	}

	@Override
	public Courses addCourse(Courses course) {
		list.add(course);
		return course;
	}

	@Override
	public Courses deleteCourses(long courseId) {
		Courses c = null;
		Iterator<Courses> iterator = list.iterator();
		while(iterator.hasNext()) {
			Courses course = iterator.next();
			if(course.getId()==courseId) {
				c = course;
				iterator.remove();
				break;
			}
		}
		return c;
	}

	@Override
	public Courses updateCourses(Courses course) {
		for (Courses c : list) {
			if(c.getId()==course.getId()) {
				c.setTitleString(course.getTitleString());
				c.setDescriptionString(course.getDescriptionString());
				return c;
			}
		}
		return null;
	}

}
