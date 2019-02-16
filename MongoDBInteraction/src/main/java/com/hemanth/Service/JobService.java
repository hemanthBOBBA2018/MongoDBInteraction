package com.hemanth.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hemanth.Dao.JobDao;
import com.hemanth.Model.Job;
import com.hemanth.Model.Teacher;

@Service
public class JobService {

	@Autowired
	private JobDao jobDaoImpl;

	public Job getSpecificJobById(String Id) {
		return jobDaoImpl.GetJob(Id);
	}

	public void saveJob(Job newJob1) {
		// TODO Auto-generated method stub
		jobDaoImpl.saveJobData(newJob1);
	}

	public List<Job> getAllJobs() {
		// TODO Auto-generated method stub
		System.out.println("I am in Service Layer" + jobDaoImpl);
		return jobDaoImpl.findAllJobs();
	}

	public void updateJob(Job job) {
		jobDaoImpl.updateJob(job);

	}

	public void deleteJob(String id) {
		// TODO Auto-generated method stub
		jobDaoImpl.deleteJob(id);
	}

	/*
	 * public List<Teacher> getTeachers(String searchCriteria) throws
	 * SearchCriteraLangException { SearchCritera sc =
	 * SearchCritera.build(searchCriteria); System.out.println(sc); return
	 * DaoImpl.getTeachers(sc); }
	 */
}
