package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Job_Seeker;

public interface Job_Seeker_Dao extends JpaRepository<Job_Seeker, Integer>{

	
	
}
