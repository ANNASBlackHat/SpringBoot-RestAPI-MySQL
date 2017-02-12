package com.annasblackhat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.annasblackhat.model.Course;
import com.annasblackhat.model.Topic;
import com.annasblackhat.services.CourseService;

@RestController
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topic/{topicId}/course")
	public List<Course> getAllCourses(@PathVariable int topicId){
		return courseService.getAllCourse(topicId);
	}
	
	@RequestMapping("/topic/{topicId}/course/{id}")
	public Course getCourse(@PathVariable int id){
		return courseService.getCourse(id);
	}
	
	@RequestMapping(value = "/topic/{topicId}/course", method = RequestMethod.POST)
	public void addCourse(@RequestBody Course course, @PathVariable int topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.addCource(course);
	}
	
	@RequestMapping(value = "/topic/{topicId}/course/{id}", method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable int topicId){
		course.setTopic(new Topic(topicId, "", ""));
		courseService.udpate(course);
	}
	
	@RequestMapping(value = "/topic/{topicId}/course/{id}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable int id){
		courseService.delete(id);
	}
}
