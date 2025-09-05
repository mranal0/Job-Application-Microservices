package firstapp.review.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import firstapp.review.model.Review;


public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findByCompanyId(Long companyId);//this tells springboot to build an implementation of this method 

}
