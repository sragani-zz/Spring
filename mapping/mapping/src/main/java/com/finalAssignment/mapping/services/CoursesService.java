package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import com.finalAssignment.mapping.entities.Courseentities;

public interface CoursesService {
	public List<Courseentities>geCourses();

	public Optional<Courseentities> getCourse(int courseId);

	public void addCourse(Courseentities course);

	public void updateCourse(Courseentities course);

	public void deleteCourse(int courseId);
}
