package com.annasblackhat.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annasblackhat.model.Course;
import com.annasblackhat.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;
	
	public List<Course> getAllCourse(int topicId){
		List<Course> list = new ArrayList<Course>();
		courseRepository.findByTopicId(topicId)
			.forEach(list::add);
		
		return list;
	}
	
	public void addCource(Course course){
		courseRepository.save(course);
	}
	
	public Course getCourse(int id){
		return courseRepository.findOne(id);
	}

	public void udpate(Course course) {
		courseRepository.save(course);
	}

	public void delete(int id) {
		courseRepository.delete(id);
	}
}
