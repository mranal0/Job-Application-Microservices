package firstapp.job.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import firstapp.job.model.Job;



public interface JobRepository extends JpaRepository<Job, Long> {

//	When your application starts:
	
//		Spring scans your code.
//		Sees that JobRepo extends JpaRepository.
//		Generates a runtime implementation of JobRepo (a hidden class you don’t see).
//		Stores that object in its big box of beans (the Spring Context).
}
