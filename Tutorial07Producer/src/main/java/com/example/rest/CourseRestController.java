package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.CourseModel;
import com.example.model.StudentModel;
import com.example.service.CourseService;
import com.example.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController
{
	
	@Autowired
	CourseService courseService;
	
	@RequestMapping("/course/view/{id}")
	public CourseModel view (@PathVariable(value = "id") String id) {
			CourseModel course = courseService.selectCourse(id);
		return course;
	}
	
	@Autowired
	@RequestMapping("/course/viewall")
	public List<CourseModel> viewAll () {
			List<CourseModel> courses = courseService.selectAllCourse();
		return courses;
	}
	
}
