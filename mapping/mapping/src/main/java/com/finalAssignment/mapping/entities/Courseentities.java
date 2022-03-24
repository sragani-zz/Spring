package com.finalAssignment.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courseentities {
	@Id
	private int courseId;

	private String courseName;

	private String courseDuration;

	@Override
	public String toString() {
		return "Courseentities [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}

	public Courseentities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courseentities(int courseId, String courseName, String courseDuration) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
	}
}
