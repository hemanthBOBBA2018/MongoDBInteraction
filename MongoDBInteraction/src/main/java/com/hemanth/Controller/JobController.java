package com.hemanth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hemanth.Model.Job;
import com.hemanth.Service.JobService;

@RestController
public class JobController {

	@Autowired
	private JobService jobService;
	
	/*** Retrieve all Teachers ***/
	@RequestMapping(value = "/jobs", produces = "application/json", method = RequestMethod.GET)
	public List<Job> getAllJobs() {
		List<Job> JobList = jobService.getAllJobs();
		return JobList;
	}
		

	// model input -id , output - all the details , where? in-memory ? Dao
	// (TeacherDao) fun -return details -id? ,

	/*@RequestMapping(value = "/teachers", method = RequestMethod.GET)
	public Teacher searchTeacherDeatils(@RequestParam("fullname") @NotNull String name) {
		return teacherService.getTecherDetailsGivenFullName(name);
	}
	*/

	
	@RequestMapping(value = "/jobs/{id}", method = RequestMethod.GET)
	public Job GetJobDetailsById(@PathVariable("id") String id) {
		return jobService.getSpecificJobById(id);
	}

	

	/*** Create a new Job ***/
	@PostMapping("/jobs")
	public void createJob(@RequestBody Job newJob1) {
		jobService.saveJob(newJob1);
	}

	/** Update the Job Details */
	@RequestMapping(value = "/jobs", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public void updateJob(@RequestBody Job job) {
		jobService.updateJob(job);
	}

	/** Delete the Job Details */
	@RequestMapping(value = "jobs/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void deleteTeacher(@PathVariable("id") String id) {
		jobService.deleteJob(id);
	}
	
	/*
	@RequestMapping(value = "Jobs/search", method = RequestMethod.GET, produces = "application/json")
	public List<Teacher> searcheTeachers(@RequestParam("search") String searchCriteria ) throws SearchCriteraLangException {
		return jobService.getJobs(searchCriteria);
		
	}
*/
	
}
