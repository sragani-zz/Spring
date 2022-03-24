package com.finalAssignment.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finalAssignment.mapping.entities.Courseentities;
import com.finalAssignment.mapping.services.CoursesService;
import com.finalAssignment.mapping.services.CoursesServicesImp;

@RestController
@RequestMapping("/course")
public class Coursescontroller {
	@Autowired
	private CoursesService coursesService;
	//get the Employee Details



	@GetMapping("/get")
	public List<Courseentities>getCourses(){
	return this.coursesService.geCourses();
	}

	@GetMapping("/get/{courseId}")
	public Optional<Courseentities> getCourse(@PathVariable int courseId){
	return this.coursesService.getCourse(courseId);

	}

	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addCourse(@RequestBody Courseentities course){

	try {
	this.coursesService.addCourse(course);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	@PutMapping("/update")
	public ResponseEntity<HttpStatus> updateCourse(@RequestBody Courseentities course){

	try {
	this.coursesService.updateCourse(course);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	@DeleteMapping("/delete/{courseId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable int courseId){
	try {
	this.coursesService.deleteCourse(courseId);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	}
	
}
	
	