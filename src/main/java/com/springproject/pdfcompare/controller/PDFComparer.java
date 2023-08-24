package com.springproject.pdfcompare.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.pdfcompare.entity.Course;
import com.springproject.pdfcompare.service.CourseService;
import com.springproject.pdfcompare.service.CourseServiceImp;



@RestController
@CrossOrigin(origins= {"http://localhost:3001"})
public class PDFComparer {
	
	
//	this way we can't create list and return to rest controller
//	List<Course> courseList = new ArrayList<>();
//
//    // Adding courses to the list
//    courseList.add(new Course("React", 500, 1));
//    courseList.add(new Course("Java", 600, 2));
//    courseList.add(new Course("Python", 400, 3));
    
//	this is a way to add courses in list through controller itself 
	@GetMapping("/course")
    public List<Course> func(){
    	List<Course> courseList = new ArrayList<>();

        // Adding courses to the list
        courseList.add(new Course(1,"React", 500, 1));
        courseList.add(new Course(2,"Java", 600, 2));
        courseList.add(new Course(3,"Python", 400, 3));
        
        return courseList;
    }
	
//	private CourseService courseservice =  new CourseServiceImp();     //this will work
	
	@Autowired
	private CourseService courseservice;        //to make this working i added annotation autowired which automatic made an object
												//also we need to add @service in serviceimp to made this annotation work
	@GetMapping("/home")
	public List<Course> getCourse(){
		return  this.courseservice.getCourse();
	}
    
    

	
}
