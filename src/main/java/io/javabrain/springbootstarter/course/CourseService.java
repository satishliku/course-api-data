package io.javabrain.springbootstarter.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courserepository;
	
	public List<Course> getAllCourse()
	{
		return courserepository.findAll();
	}
	
	public Course getCourse(String id)
	{
		return courserepository.findById(id).get();
	}
	
	public Course addCourse(Course course)
	{
		return courserepository.save(course);
	}
	
	public void updateCourse(Course cs,String id)
	{
		courserepository.save(cs);
	}
	
	public void deleteCourse(String id)
	{
		courserepository.deleteById(id);
	}
}
