package firstapp.company.controller;

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

import firstapp.company.model.Company;
import firstapp.company.service.CompanyService;




@RestController
@RequestMapping("/company")
public class CompanyController
{
	 
	private CompanyService companyService;
	

	public CompanyController(CompanyService companyService) {
		this.companyService = companyService;
	}

	@GetMapping
	public ResponseEntity<List<Company>> getcompany() 
	{
	    return new ResponseEntity<List<Company>>(companyService.findAll(), HttpStatus.OK); 
	}
	
	@PostMapping
	public ResponseEntity<String> addcompany(@RequestBody Company company)
	{	
		companyService.addAll(company);
		return new ResponseEntity<String>("successfully added", HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Company> getCompanyById(@PathVariable long id)
	{
		Company job = companyService.getById(id);
		if(job != null)
		{
			return new ResponseEntity<Company>(job, HttpStatus.OK);	
		}
		return new ResponseEntity<Company>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCompany(@PathVariable Long id)
	{
		boolean deleted = companyService.deletelById(id);
		if(deleted)
		{
			return new ResponseEntity<>("company deleted successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> ChangeCompany(@PathVariable Long id, @RequestBody Company updatedcompany)
	{
		boolean changed = companyService.changeById(id, updatedcompany);
		
		if(changed)
		{
			return new ResponseEntity<>("company changed successfully", HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
}

