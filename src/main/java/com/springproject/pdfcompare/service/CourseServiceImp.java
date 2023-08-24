package com.springproject.pdfcompare.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.pdfcompare.entity.Course;
@Service
public class CourseServiceImp implements CourseService {

	List<Course> courseList;
	
	public CourseServiceImp() {
		courseList = new ArrayList<>();
		  courseList.add(new Course(1,"React", 500, 1));
	        courseList.add(new Course(2,"Java", 600, 2));
	        courseList.add(new Course(3,"Python", 400, 3));
	}
	@Override
	public List<Course> getCourse() {
		return courseList;
	}

}
