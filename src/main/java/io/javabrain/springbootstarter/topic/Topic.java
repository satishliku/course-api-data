package io.javabrain.springbootstarter.topic;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import io.javabrain.springbootstarter.course.Course;

@Entity
public class Topic {

	@Id
	private String id;
	private String name;
	private String description;

	@OneToMany
	@JoinColumn(name="id")
	private List<Course> couresList;
	
	public List<Course> getCouresList() {
		return couresList;
	}

	public void setCouresList(List<Course> couresList) {
		this.couresList = couresList;
	}

	public Topic() {
		}

	public Topic(String id, String name, String description) {
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
