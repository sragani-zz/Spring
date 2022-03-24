package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalAssignment.mapping.entities.Courseentities;
import com.finalAssignment.mapping.repo.CourseRepo;


@Service
public class CoursesServicesImp implements CoursesService {
	
	@Autowired
	private CourseRepo courseDao;

	@Override
	public List<Courseentities> geCourses() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@Override
	public Optional<Courseentities> getCourse(int courseId) {
		// TODO Auto-generated method stub
		return courseDao.findById(courseId);
	}

	@Override
	public void addCourse(Courseentities course) {
		// TODO Auto-generated method stub
		
		courseDao.save(course);
		
	}

	@Override
	public void updateCourse(Courseentities course) {
		// TODO Auto-generated method stub
		courseDao.save(course);
		
	}

	@Override
	public void deleteCourse(int courseId) {
		// TODO Auto-generated method stub
		Courseentities c=courseDao.getOne(courseId);
		courseDao.delete(c);
	}
	
	
	
}
