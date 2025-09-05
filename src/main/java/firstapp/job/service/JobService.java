package firstapp.job.service;

import java.util.List;

import org.springframework.stereotype.Service;

import firstapp.job.model.Job;
import firstapp.job.repository.JobRepository;
import jakarta.transaction.Transactional;



@Service
public class JobService {

    private final JobRepository JobRepository;

    public JobService(JobRepository JobRepository) {
        this.JobRepository = JobRepository;
    }

    public List<Job> findAll() {
        return JobRepository.findAll();
    }

    public Job addJob(Job job) {
        return JobRepository.save(job);
    }

    public Job getById(Long id) {
        return JobRepository.findById(id).orElse(null);
    }

    public boolean deleteJobById(Long id) {
        if (JobRepository.existsById(id)) {
            JobRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Job updateJobById(Long id, Job updatedJob) {
        return JobRepository.findById(id).map(job -> {
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
