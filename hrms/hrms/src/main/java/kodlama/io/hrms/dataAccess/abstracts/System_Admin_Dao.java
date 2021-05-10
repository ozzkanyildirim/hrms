package kodlama.io.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.hrms.entities.concretes.System_Admin;

public interface System_Admin_Dao extends JpaRepository<System_Admin, Integer>{

}
