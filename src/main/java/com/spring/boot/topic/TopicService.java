package com.spring.boot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService   {  
 
	
 private  List <Topic> topices = new ArrayList<> (Arrays.asList(
			new Topic("spring" ,"My SpringBoot framwork", "Spring framwork description"),
			
			new Topic("java" ,"HTTP", " Test dependency"),
			
			new Topic("web dependency" ," Script", "Spring  core"),
			
			new Topic("Security dependency" ," Script", "Spring  core")
			
			));
			 
			
 
 
/* public <topicRepository> List<Topic> getAllTopic(){
	return topices;
	 
	 
	 
 }*/
 
 
	
	public Topic getTopic(String id) {
		 
		return  topices.stream().findFirst().filter(t->t.getId().equals(id)).get();
		
		
	}



	public void addTopics(Topic topic) {
	topices.add(topic)	;	 	
	}



	public void UpdateTopics(String id, Topic topic) {
		 for(int i =0; i < topices.size(); i++) {
			 
			 Topic t = topices.get(i);
			 if(t.getId().equals(id)) {
				 topices.set(i, topic);
				 return;
			 }
			 
			 
			 
			 
			 
		 }
		
	}



 



	public Topic deleteTopic(String id) {
		 topices.removeIf(t -> t.getId().equals(id));
		return null;
	}
	

	


}
