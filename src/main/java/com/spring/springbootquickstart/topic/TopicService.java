package com.spring.springbootquickstart.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =   new ArrayList<>(Arrays.asList(
			new Topic(5,"Lisa Pasta", "famous chef"),
			new Topic(2,"Sean Jean", "fashion designer"),
			new Topic(12,"Barak Obama", "President"),
			new Topic(1,"Black Girl Magic", "Melanin on Fleek"),
			new Topic(2,"Instagram","Lots of pictures"),
			new Topic(9,"Family","Loves of my life")
			));
	
	public List<Topic> getAllTopics() {
		
		return topics;
	}

	public Stack<Topic> getTopic(int id) {
		
		Stack<Topic> topicStack = new Stack<Topic>();
		for(Topic topic: topics){
			if (topic.getId() == id){
				topicStack.push(topic);
			}
		}
		return topicStack;
	}

	public void addTopic(Topic topic) {
		
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, int id) {
		for(Topic t: topics){
			if(t.getId() == id){
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
				
			}
		}
		
	}

	public void deleteTopic(int id) {
		for(Topic t: topics){
			if(t.getId() == id){
				topics.remove(t);
				
			}
		}		
	}

	
	
}
