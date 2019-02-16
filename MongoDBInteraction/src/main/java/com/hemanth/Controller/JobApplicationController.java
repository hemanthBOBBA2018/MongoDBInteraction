package com.hemanth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hemanth.Model.JobApplication;
import com.hemanth.Service.JobApplicationService;

@RestController
public class JobApplicationController {

	
	@Autowired
	private JobApplicationService jobAppnService;
	
	/*** Apply for the Job ***/
	@PostMapping(value = "/jobs/apply", consumes = MediaType.APPLICATION_JSON_VALUE)
	public JobApplication applyJobs(@Validated @RequestBody JobApplication application) {
		return jobAppnService.ApplyJobById(application);
		
	}
}
