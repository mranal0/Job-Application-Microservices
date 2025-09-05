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
		
		
	}
		
	
	
	
	
	
	
	
	

//	public boolean deletelById(Long id) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	public boolean changeById(Long id, Review updatedReview) {
//		// TODO Auto-generated method stub
//		return false;
//	}

}
