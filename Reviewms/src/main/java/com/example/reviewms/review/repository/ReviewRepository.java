package com.example.reviewms.review.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.reviewms.review.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

	List<Review> findByCompanyId(Long companyId);
    // Spring Data JPA automatically provides implementation
    // for basic CRUD operations and more
}
