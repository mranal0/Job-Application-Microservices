package com.example.reviewms.review.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.reviewms.review.model.Review;
import com.example.reviewms.review.repository.ReviewRepository;



@Service
public class ReviewService {
	
	ReviewRepository reviewRepository;


	public ReviewService(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}

	public List<Review> getReviews(Long companyId) {
		
		List<Review> reviews = reviewRepository.findByCompanyId(companyId);
		return reviews;
	}

	public boolean addReview(Long companyId, Review review) 
	{
		if (companyId != null) {
			review.setCompanyId(companyId); reviewRepository.save(review);
			return true;
	} else {
		return false;
		}
	}
	public Review getReviewById(Long reviewId) {
		return reviewRepository.findById(reviewId).orElse(null);
		}
	
	
	public boolean updateReview(Long reviewId, Review updatedReview)
	{
		Review review = reviewRepository.findById(reviewId).orElse(null);
		if (review != null)
		{ 	
			review.setTitle(updatedReview.getTitle());
			review.setDescription(updatedReview.getDescription());
			review.setRating(updatedReview.getRating());
			review.setCompanyId(updatedReview.getCompanyId());
			reviewRepository.save(review);
			return true;
		} else 
		{
			return false;
		}
	}

	public boolean deleteReview(Long reviewId) 
	{
		Review review = reviewRepository.findById(reviewId).orElse(null);
		
		if (review != null){
		reviewRepository.delete(review);
			return true;
		}
		else 
		{
			return false;
		}
	}
}
