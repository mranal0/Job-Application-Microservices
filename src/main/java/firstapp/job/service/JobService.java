package firstapp.job.service;

import java.util.List;

import org.springframework.stereotype.Service;

import firstapp.job.model.Job;
import firstapp.job.repository.JobRepo;
import jakarta.transaction.Transactional;



@Service
public class JobService {

    private final JobRepo jobRepo;

    public JobService(JobRepo jobRepo) {
        this.jobRepo = jobRepo;
    }

    public List<Job> findAll() {
        return jobRepo.findAll();
    }

    public Job addJob(Job job) {
        return jobRepo.save(job);
    }

    public Job getById(Long id) {
        return jobRepo.findById(id).orElse(null);
    }

    public boolean deleteJobById(Long id) {
        if (jobRepo.existsById(id)) {
            jobRepo.deleteById(id);
            return true;
        }
        return false;
    }

    @Transactional
    public Job updateJobById(Long id, Job updatedJob) {
        return jobRepo.findById(id).map(job -> {
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
