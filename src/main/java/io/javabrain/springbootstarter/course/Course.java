package io.javabrain.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import io.javabrain.springbootstarter.topic.Topic;

@Entity
public class Course {

	@Id
	private String id;
	
	private String name;
	private String description;
	
	@ManyToOne(targetEntity=Topic.class)
	private Topic topic;
	
	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}


	public Course() {}
		
	
	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
