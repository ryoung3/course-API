package com.spring.springbootquickstart.controller;

import java.util.List;
import java.util.Stack;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.springbootquickstart.topic.Topic;
import com.spring.springbootquickstart.topic.TopicService;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
		
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Stack<Topic> getTopic(@PathVariable int id){
		
		return topicService.getTopic(id);
	}
	
	@RequestMapping(value="/topics", method = RequestMethod.POST)
	public void addNewTopic(@RequestBody Topic topic){
		topicService.addTopic(topic);
	}

	@RequestMapping(value="/topics/{id}", method = RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic, @PathVariable int id){
		topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(value="/topics/{id}", method = RequestMethod.DELETE)
	public void deleteTopic( @PathVariable int id){
		topicService.deleteTopic(id);
	}

}
