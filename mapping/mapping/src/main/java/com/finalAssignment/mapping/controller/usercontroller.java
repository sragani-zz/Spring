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
import com.finalAssignment.mapping.entities.userentities;
//import com.finalAssignment.mapping.services.CoursesImplement;
import com.finalAssignment.mapping.services.userService;



@RestController
@RequestMapping("/user")

public class usercontroller {
	
	@Autowired
	private userService userService;



	@GetMapping("/get")
	public List<userentities>getUsers(){
	return this.userService.getUsers();
	}

	@GetMapping("/get/{userId}")
	public Optional<userentities> getUser(@PathVariable int userId){
	return this.userService.getUser(userId);

	}

	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addUser(@RequestBody userentities user){

	try {
	this.userService.addUser(user);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	@PutMapping("/update")
	public ResponseEntity<HttpStatus> updateUser(@RequestBody userentities user){

	try {
	this.userService.updateUser(user);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	}

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable int userId){
	try {
	this.userService.deleteUser(userId);
	return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	}
	}


