package io.javabrain.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.javabrain.springbootstarter.topic.Topic;
import io.javabrain.springbootstarter.topic.TopicService;

public class CourseController {

	@Autowired
	private CourseService courseservice;
	@Autowired 
	private TopicService topicService;
	
	@GetMapping("/topics/{id}/courses")
	public List<Course> getAllCourse()
	{
		return courseservice.getAllCourse();
	}
	
	@GetMapping("/topics/{topicid}/course/{id}")
	public Course getCourse(@PathVariable String id)
	{
		return courseservice.getCourse(id);
	}
	
	@RequestMapping(value="/topics/{topicId}/course",method=RequestMethod.POST)
	public Course addCourse(@PathVariable(name="topicId") String topicId,@RequestBody Course course)
	{
		Topic topic=topicService.getTopic(topicId);
		
		course.setTopic(topic);
		return	courseservice.addCourse(course);
	}
}
