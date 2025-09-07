package com.example.reviewms.review.controller;

import java.util.List;

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

import com.example.reviewms.review.model.Review;
import com.example.reviewms.review.service.ReviewService;

@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<List<Review>> getReviewsByCompany(@RequestParam Long companyId){
    	return new ResponseEntity<>(reviewService.getReviews(companyId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> addReview(@RequestParam Long companyId, @RequestBody Review review){
    	
    		boolean isReviewsaved = reviewService.addReview(companyId, review);
    		if (isReviewsaved)
    		return new ResponseEntity<> ("Review Added Successfully",HttpStatus.OK);
    		else
    		return new ResponseEntity<>("Review Not Saved",HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{reviewId}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long reviewId) {
    	Review review = reviewService.getReviewById(reviewId);
    	if(review != null)
    		return new ResponseEntity<Review>(review, HttpStatus.OK);
    	else
    		return new ResponseEntity<Review>(review, HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{reviewId}")
    	public ResponseEntity<String> deleteReview(@PathVariable Long reviewId){
    		boolean isReviewDeleted = reviewService.deleteReview(reviewId);
    		if (isReviewDeleted)
    		return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
    		else
    		return new ResponseEntity<> ("Review not deleted", HttpStatus.OK);
    }
    		

    @PutMapping("/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long reviewId, @RequestBody Review updatedReview) {
        boolean isReviewUpdated = reviewService.updateReview(reviewId, updatedReview);
        
        if (isReviewUpdated)
        return new ResponseEntity<>("Review updated successfully", HttpStatus.OK);
        else
        return new ResponseEntity<>("Review not updated", HttpStatus.NOT_FOUND);
    }
}
