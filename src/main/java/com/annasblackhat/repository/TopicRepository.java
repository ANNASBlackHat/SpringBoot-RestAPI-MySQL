package com.annasblackhat.repository;

import org.springframework.data.repository.CrudRepository;

import com.annasblackhat.model.Topic;

public interface TopicRepository extends CrudRepository<Topic, Integer> {
	
}
