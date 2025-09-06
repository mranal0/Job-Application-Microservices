package firstapp.job.service;

import java.util.List;

import org.springframework.stereotype.Service;

import firstapp.job.model.Job;
import firstapp.job.repository.JobRepository;
import jakarta.transaction.Transactional;



@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    public Job getById(Long id) {
        return jobRepository.findById(id).orElse(null);
    }

    public boolean deleteJobById(Long id) {
        if (jobRepository.existsById(id)) {
            jobRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Job updateJobById(Long id, Job updatedJob) {
        return jobRepository.findById(id).map(job -> {
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setMinSalary(updatedJob.getMinSalary());
            job.setMaxSalary(updatedJob.getMaxSalary());
            job.setLocation(updatedJob.getLocation());
            job.setCompany(updatedJob.getCompany());
            return job;
        }).orElse(null);
    }
}
