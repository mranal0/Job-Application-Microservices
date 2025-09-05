package firstapp.company.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import firstapp.company.model.Company;
import firstapp.company.repository.CompanyRepository;
import jakarta.transaction.Transactional;


@Service
public class CompanyService {
	
	private final CompanyRepository companyrepository;//dependency injection needed

	public CompanyService(CompanyRepository companyrepository)//Constructor injection
	{
	    this.companyrepository = companyrepository;
	}


	public List<Company> findAll() 
	{
		return companyrepository.findAll();
	}

	public String addAll(Company company) 
	{	
		companyrepository.save(company);
		return "successfully created";
	}
	
	public Company getById(Long id)
	{
		return companyrepository.findById(id).orElse(null);
	}

	public boolean deletelById(Long id) 
	{
		try
		{
			companyrepository.deleteById(id);
			return true;
		}
		catch(IllegalArgumentException e)
		{
			return false;
		}
	}

	 @Transactional
	    public boolean changeById(Long id, Company updatedcompany) {
		 
	        Optional<Company> optcompany = companyrepository.findById(id);
	        if (optcompany.isPresent()) {
	            Company company = optcompany.get();

	            company.setName(updatedcompany.getName());
	            company.setDescription(updatedcompany.getDescription());

	            // No need to call save() explicitly because of @Transactional
	            return true;
	        }
	        return false;

}
}

