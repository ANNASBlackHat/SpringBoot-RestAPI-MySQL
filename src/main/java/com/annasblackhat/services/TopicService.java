package com.annasblackhat.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.annasblackhat.model.Topic;
import com.annasblackhat.repository.TopicRepository;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<Topic> getAllTopic(){
		List<Topic> list = new ArrayList<Topic>();
		topicRepository.findAll()
			.forEach(list::add);
		
		return list;
	}
	
	public void addTopic(Topic topic){
		topicRepository.save(topic);
	}
	
	public Topic getTopic(int id){
		return topicRepository.findOne(id);
	}

	public void udpate(Topic topic) {
		topicRepository.save(topic);
	}

	public void delete(int id) {
		topicRepository.delete(id);
	}
}
