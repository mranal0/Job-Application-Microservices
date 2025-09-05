package firstapp.company.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import firstapp.company.model.Company;





public interface CompanyRepository extends JpaRepository<Company, Long> {

//	When your application starts:
	
//		Spring scans your code.
//		Sees that JobRepo extends JpaRepository.
//		Generates a runtime implementation of JobRepo (a hidden class you don’t see).
//		Stores that object in its big box of beans (the Spring Context).
}
