package com.example.companyms.company.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.companyms.company.model.Company;
import com.example.companyms.company.repository.CompanyRepository;
import jakarta.transaction.Transactional;

@Service
public class CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company addCompany(Company company) {
        return companyRepository.save(company);
    }

    public Company getById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public boolean deleteCompanyById(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Company updateCompanyById(Long id, Company updatedCompany) {
        return companyRepository.findById(id).map(company -> {
            company.setName(updatedCompany.getName());
            company.setDescription(updatedCompany.getDescription());
            return company;
        }).orElse(null);
    }
}
