package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.Employers_Service;
import kodlama.io.hrms.dataAccess.abstracts.Employers_Dao;
import kodlama.io.hrms.entities.concretes.Employers;

@Service
public class Employers_Manager  implements Employers_Service{

	private Employers_Dao employers_Dao;
	
	
	@Autowired
	public Employers_Manager(Employers_Dao employers_Dao) {
		
		this.employers_Dao = employers_Dao;
	}
	
	
	
	@Override
	public List<Employers> getAll() {
		// TODO Auto-generated method stub
		return employers_Dao.findAll();
	}




}
