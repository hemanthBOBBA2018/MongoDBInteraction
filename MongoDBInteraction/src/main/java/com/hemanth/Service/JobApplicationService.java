package com.hemanth.Service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemanth.Dao.JobApplicationDao;
import com.hemanth.Dao.JobDao;
import com.hemanth.Model.Job;
import com.hemanth.Model.JobApplication;
import com.hemanth.Model.JobApplication.JobStatus;

@Service
public class JobApplicationService {
	@Autowired
	private JobApplicationDao jobAppnServiceDaoImpl;
	
	@Autowired
	private JobDao jobdao;

	public JobApplication ApplyJobById(JobApplication application) {
		//this is the business logic.
		if(validateJobApplication(application)) {
			application.setAppId(genrateApplicationId());
			application.setStatus(JobStatus.APPLIED);
			jobAppnServiceDaoImpl.saveJobApplication(application);
			return application;
		} else {
			System.out.println("JobId not found");
			return application;
		}
		
	}
	
	private String genrateApplicationId() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public boolean validateJobApplication(JobApplication application )
	{
		Optional<Job> job = jobdao.findJobById(application.getJobId());
		return job.isPresent();
	}
	
}
