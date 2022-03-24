package com.finalAssignment.mapping.services;

import java.util.List;
import java.util.Optional;

import com.finalAssignment.mapping.entities.Reviewentites;

public interface ReviewServices {
	public List<Reviewentites>getReviews();

	public Optional<Reviewentites> getReview(int reviewId);

	public void addReview(Reviewentites review);

	public void updateReview(Reviewentites review);

	public void deleteReview(int reviewId);
}