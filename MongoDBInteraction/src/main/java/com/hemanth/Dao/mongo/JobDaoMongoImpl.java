package com.hemanth.Dao.mongo;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Component;

import com.hemanth.Dao.JobDao;
import com.hemanth.Model.Job;

@Component
public class JobDaoMongoImpl implements JobDao{

	@Autowired
	private MongoDao<Job> jobDoa;
	
	
	@Override
	public void saveJobData(Job t) {
		// TODO Auto-generated method stub
		jobDoa.save(t);
	}

	@Override
	public Job GetJob(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Job> findAllJobs() {
		// TODO Auto-generated method stub
		return jobDoa.findAll(Job.class);
	}

	@Override
	public void updateJob(Job job) {
		// TODO Auto-generated method stub
		jobDoa.save(job);
	}

	@Override
	public void deleteJob(String id) {
		// TODO Auto-generated method stub
		jobDoa.delete(id);
	}

	@Override
	public Optional<Job> findJobById(String id) {
		Criteria jobCriteria = Criteria.where("jobId").is(id);
		List<Job> collection = jobDoa.getAll(Collections.singletonList(jobCriteria), 1 , Job.class);
		if(collection != null && !collection.isEmpty()) {
			return Optional.of(collection.get(0));
		} else {
			return Optional.empty();
		}
			 
	}
	
	

}
