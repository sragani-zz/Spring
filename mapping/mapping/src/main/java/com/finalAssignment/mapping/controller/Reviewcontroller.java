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
	 import org.springframework.web.bind.annotation.RestController;

import com.finalAssignment.mapping.entities.Reviewentites;
import com.finalAssignment.mapping.services.ReviewServices;

	
	 @RestController
	 @RequestMapping("/review")
	 public class Reviewcontroller { 
		 
		 @Autowired
		 private ReviewServices reviewService;



		 @GetMapping("/get")
		 public List<Reviewentites>geReviews(){
		 return this.reviewService.getReviews();
		 }

		 @GetMapping("/get/{reviewId}")
		 public Optional<Reviewentites> getReview(@PathVariable int reviewId){
		 return this.reviewService.getReview(reviewId);

		 }

		 @PostMapping("/add")
		 public ResponseEntity<HttpStatus> addReview(@RequestBody Reviewentites review){

		 try {
		 this.reviewService.addReview(review);
		 return new ResponseEntity<>(HttpStatus.OK);
		 } catch (Exception e) {
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 }

		 @PutMapping("/update")
		 public ResponseEntity<HttpStatus> updateReview(@RequestBody Reviewentites review){

		 try {
		 this.reviewService.updateReview(review);
		 return new ResponseEntity<>(HttpStatus.OK);
		 } catch (Exception e) {
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }
		 }

		 @DeleteMapping("/delete/{designationId}")
		 public ResponseEntity<HttpStatus> deleteReview(@PathVariable int reviewId){
		 try {
		 this.reviewService.deleteReview(reviewId);
		 return new ResponseEntity<>(HttpStatus.OK);
		 } catch (Exception e) {
		 return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		 }

		 }
	 }
	 