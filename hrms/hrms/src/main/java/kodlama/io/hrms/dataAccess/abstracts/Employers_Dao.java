package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.Employers;

public interface Employers_Dao extends JpaRepository<Employers, Integer>{

}
