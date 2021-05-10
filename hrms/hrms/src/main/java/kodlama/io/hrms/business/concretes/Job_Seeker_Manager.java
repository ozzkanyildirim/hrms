package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.Job_Seeker_Service;
import kodlama.io.hrms.dataAccess.abstracts.Job_Seeker_Dao;
import kodlama.io.hrms.entities.concretes.Job_Seeker;

@Service
public class Job_Seeker_Manager implements Job_Seeker_Service{

	
	private Job_Seeker_Dao job_Seeker_Dao;
	
	@Autowired
	public Job_Seeker_Manager(Job_Seeker_Dao job_Seeker_Dao) {
		this.job_Seeker_Dao = job_Seeker_Dao;
	}
	
	
	
	@Override
	public List<Job_Seeker> getAll() {
		// TODO Auto-generated method stub
		return job_Seeker_Dao.findAll();
	}

	
	
	
}
