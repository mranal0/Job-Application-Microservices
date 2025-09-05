package firstapp.review.service;

import java.util.List;

import org.springframework.stereotype.Service;

import firstapp.company.model.Company;
import firstapp.company.service.CompanyService;
import firstapp.review.model.Review;
import firstapp.review.repository.ReviewRepository;

@Service
public class ReviewService {
	
	ReviewRepository reviewRepository;
	CompanyService companyService;


	public ReviewService(ReviewRepository reviewRepository, CompanyService companyService) {
		this.reviewRepository = reviewRepository;
		this.companyService = companyService;
	}

	public List<Review> getReviews(Long companyId) {
		
		List<Review> reviews = reviewRepository.findByCompanyId(companyId);
		return reviews;
	}

	public boolean addReview(Long companyId, Review review) {
		Company company = companyService.getById(companyId) ;
		if (company != null){
			review.setCompany(company);
			reviewRepository.save(review);
			return true;
		}else {
		return false;	
		}
	}

	public Review getById(Long companyId, Long reviewsId) {
		List<Review> reviews = reviewRepository.findByCompanyId(companyId);
		
		return reviews.stream()
		.filter(review -> review.getId().equals(reviewsId))
		.findFirst()
		.orElse(null);
	}
	public boolean updateReview(Long companyId, Long reviewId, Review updatedReview)
	{
		if (companyService.getById(companyId) != null)
		{ 	
			updatedReview.setCompany(companyService.getById(companyId)); 
			updatedReview.setId(reviewId);
			reviewRepository.save(updatedReview);
			return true;
		} else 
		{
			return false;
		}
	}

	public boolean deleteReview(Long companyId, Long reviewId) 
	{
		if(companyService.getById(companyId) != null && reviewRepository.existsById(reviewId))
		{
			Review review = reviewRepository.findById(reviewId).orElse(null);
			Company company = review.getCompany();
			company.getReviews().remove(review);
			review.setCompany (null);
			companyService.changeById(companyId, company);
			reviewRepository.deleteById(reviewId);
			return true;
		}
		else 
		{
			return false;
		}
	}
}
