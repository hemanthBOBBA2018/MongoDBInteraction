package com.hemanth.Dao.mongo;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.hemanth.Model.JobApplication;
import com.hemanth.Model.Teacher;


@Component
public class MongoDao<T> {

	@Autowired
	private MongoTemplate mongotemp;
	
	final static Logger logger = Logger.getLogger(MongoDao.class);
	
	public void save(T object) {
		mongotemp.save(object);
	}

	public List<T> findAll(Class<T> clazz) {
		List<T> teachers = mongotemp.findAll(clazz);
		return teachers;
	}
	

	public List<T> getAll(List<Criteria> criteria ,Class<T> clazz) {
		
		if (criteria == null)
		{
			System.out.println("Hitting in here for Null");
		List<T> teachers = mongotemp.findAll(clazz);
		return teachers;
		}
		else {
			System.out.println("Hitting in here for Not Null");
		Query query = new Query();
		for(Criteria cri  : criteria) {
			query.addCriteria(cri);
		}
		return mongotemp.find(query, clazz);
		}
	}
	
public List<T> getAll(List<Criteria> criteria , int limit , Class<T> clazz) {
		
		if (criteria == null)
		{
			System.out.println("Hitting in here for Null");
		List<T> teachers = mongotemp.findAll(clazz);
		return teachers;
		}
		else {
			System.out.println("Hitting in here for Not Null");
		Query query = new Query();
		for(Criteria cri  : criteria) {
			query.addCriteria(cri);
		}
		query.limit(limit);
		return mongotemp.find(query, clazz);
		}
	}


	public void delete(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(id));

		mongotemp.remove(query, "teachers");
		
	}
	
	
	/*
	 * public String FindJobById(String id, Class<T> clazz) { Query query = new
	 * Query(); query.addCriteria(Criteria.where("jobId").is(id));
	 * System.out.println("The value of Id is " + id);
	 * 
	 * //JobApplication jobAppn = (JobApplication) mongotemp.findById(id, clazz);
	 * JobApplication jobAppn = (JobApplication) mongotemp.findById(id, clazz,
	 * "JobApplication");
	 * 
	 * if (jobAppn == null) System.out.println(" Job Not Found");
	 * 
	 * System.out.println(" Job is Found"); return jobAppn.getAppId();
	 * 
	 * 
	 * 
	 * }
	 */


}
