package com.spring.boot.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//my controllerfile
@RestController
public class TopicController {
	
@Autowired 	
private  TopicService topiceservice;

	@RequestMapping("/Topic")
	public List<Topic> getAllTopic(List<Topic> Topic) {
		return topiceservice.getAllTopic();
		 
				
	}
	@RequestMapping("/topic/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topiceservice.getTopic(id);
			 
	}
	@RequestMapping(method=RequestMethod.POST,value="/topic")
	public void addTopic(@RequestBody Topic topic) {
		
		topiceservice.addTopics(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topic/id")
	public void UpdateTopic(@RequestBody Topic topic , @PathVariable String id) {
		
		topiceservice.UpdateTopics(id, topic);
				
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topic/id")
	public void deleteTopic(@PathVariable String id) {
		topiceservice.deleteTopic(id);
			 
	}
	
	 
		
}


