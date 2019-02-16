package com.hemanth.Dao;

import java.util.List;
import java.util.Optional;

import javax.validation.constraints.NotNull;

import com.hemanth.Model.Job;

public interface JobDao {

	void saveJobData(Job t);
	
	Job GetJob(String id);

	List<Job> findAllJobs();
	
	void updateJob(Job job);
   
	void deleteJob(String id);
	
	Optional<Job> findJobById(String id);

   	/*List<Teacher> getTeachers(SearchCritera searchCriteria);*/
}

