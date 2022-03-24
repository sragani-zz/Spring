package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finalAssignment.mapping.entities.Reviewentites;
import com.finalAssignment.mapping.repo.ReviewRepo;



	
	
	@Service
	public class ReviewServiceImp implements ReviewServices{



	@Autowired
	private ReviewRepo reviewDao;

	@Override
	public List<Reviewentites> getReviews() {
		// TODO Auto-generated method stub
		return reviewDao.findAll();
	}

	@Override
	public Optional<Reviewentites> getReview(int reviewId) {
		// TODO Auto-generated method stub
		return reviewDao.findById(reviewId);
	}

	@Override
	public void addReview(Reviewentites review) {
		// TODO Auto-generated method stub
		reviewDao.save(review);
		
	}

	@Override
	public void updateReview(Reviewentites review) {
		// TODO Auto-generated method stub
		reviewDao.save(review);
		
	}

	@Override
	public void deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		Reviewentites reviewentites=reviewDao.getOne(reviewId);
		reviewDao.delete(reviewentites);
		
	}



}
