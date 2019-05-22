package io.javabrain.springbootstarter.topic;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		return topicservice.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	
	@PostMapping(value="/topics")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic tp,@PathVariable String id)
	{
		topicservice.updateTopic(tp,id);
	}
	
	@RequestMapping(value="/topics/{id}",method=RequestMethod.DELETE)
	public void deleteTopic(@PathVariable String id)
	{
		topicservice.deleteTopic(id);
	}
}

