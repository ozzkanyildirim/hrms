package kodlama.io.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hrms.business.abstracts.System_Admin_Service;
import kodlama.io.hrms.dataAccess.abstracts.System_Admin_Dao;
import kodlama.io.hrms.entities.concretes.System_Admin;

@Service
public class System_Admin_Manager implements System_Admin_Service{

	private System_Admin_Dao system_Admin_Dao;
	
	
	
	@Autowired
	public System_Admin_Manager(System_Admin_Dao system_Admin_Dao) {
		
		this.system_Admin_Dao = system_Admin_Dao;
	}




	@Override
	public List<System_Admin> getAll() {
		// TODO Auto-generated method stub
		return system_Admin_Dao.findAll();
	}

}
