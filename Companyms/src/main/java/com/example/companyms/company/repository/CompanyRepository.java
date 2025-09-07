package com.example.companyms.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.companyms.company.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    // Spring Data JPA automatically provides implementation
    // for basic CRUD operations and more
}
