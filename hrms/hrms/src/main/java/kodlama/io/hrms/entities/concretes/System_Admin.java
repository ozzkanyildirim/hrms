package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="t_system_admin")
@Data

public class System_Admin {
	
	@Id
	@GeneratedValue
	@Column(name="system_admin_id")
	private int id;
	
	@Column(name="first_name")
	private String first_Name;
	
	@Column(name="last_name")
	private String last_Name;
	
	

}
