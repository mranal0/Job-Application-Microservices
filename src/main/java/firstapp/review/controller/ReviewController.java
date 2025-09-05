package firstapp.review.controller;

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
import org.springframework.web.bind.annotation.RestController;

import firstapp.review.model.Review;
import firstapp.review.service.ReviewService;

@RestController
@RequestMapping("/company/{companyId}")
public class ReviewController {
	
	private ReviewService reviewService;

	public ReviewController(ReviewService reviewService) {
		this.reviewService = reviewService;
	}
	
	@GetMapping("/reviews")
	public ResponseEntity<List<Review>> getReviews(@PathVariable Long companyId) 
	{
	    return new ResponseEntity<List<Review>>(reviewService.getReviews(companyId), HttpStatus.OK); 
	}//
	
	@PostMapping("/reviews")
	public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review)
	{	
		boolean isReviewSaved = reviewService.addReview(companyId, review);
		if (isReviewSaved)
		return new ResponseEntity<> ("Review Added Successfully",
		HttpStatus.OK);
		else
		return new ResponseEntity<> ("Review Not Saved" ,
		HttpStatus.NOT_FOUND) ;
	}
	
	
	@GetMapping("/reviews/{reviewsId}")
	public ResponseEntity<Review> getReviewById(@PathVariable Long companyId , @PathVariable Long reviewsId)
	{
		return new ResponseEntity<Review>(reviewService.getById(companyId, reviewsId), HttpStatus.OK);
	}
	
//	@DeleteMapping("/{id}")
//	public ResponseEntity<String> deleteReview(@PathVariable Long id)
//	{
//		boolean deleted = reviewService.deletelById(id);
//		if(deleted)
//		{
//			return new ResponseEntity<>("Review deleted successfully", HttpStatus.OK);
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
//	
//	@PutMapping("/{id}")
//	public ResponseEntity<String> ChangeReview(@PathVariable Long id, @RequestBody Review updatedReview)
//	{
//		boolean changed = reviewService.changeById(id, updatedReview);
//		
//		if(changed)
//		{
//			return new ResponseEntity<>("Review changed successfully", HttpStatus.OK);
//		}
//		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	}
	
}

