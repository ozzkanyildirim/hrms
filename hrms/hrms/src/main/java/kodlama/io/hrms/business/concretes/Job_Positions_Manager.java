package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.Job_Positions_Service;
import kodlama.io.hrms.dataAccess.abstracts.Job_Positions_Dao;
import kodlama.io.hrms.entities.concretes.Job_Positions;

@Service
public class Job_Positions_Manager implements Job_Positions_Service{

	private Job_Positions_Dao job_Positions_Dao;
	
	
	
	@Autowired
	public Job_Positions_Manager(Job_Positions_Dao job_Positions_Dao) {
		
		this.job_Positions_Dao = job_Positions_Dao;
	}




	@Override
	public List<Job_Positions> getall() {
		// TODO Auto-generated method stub
		return job_Positions_Dao.findAll();
	}

}
