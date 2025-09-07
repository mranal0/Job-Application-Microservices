package com.example.jobms.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jobms.job.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
    // Spring Data JPA automatically provides implementation
    // for basic CRUD operations and more
}
