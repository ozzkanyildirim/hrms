package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Job_Positions;

public interface Job_Positions_Dao  extends JpaRepository<Job_Positions, Integer>{

}
