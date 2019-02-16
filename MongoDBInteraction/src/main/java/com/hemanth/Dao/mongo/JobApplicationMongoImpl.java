package com.hemanth.Dao.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hemanth.Dao.JobApplicationDao;
import com.hemanth.Model.JobApplication;

@Component
public class JobApplicationMongoImpl implements JobApplicationDao {

	@Autowired
    private MongoDao<JobApplication> JobApplicationDoa;

	@Override
	public void saveJobApplication(JobApplication application) {
		JobApplicationDoa.save(application);
	}

	
	
	
	

	
		
}
