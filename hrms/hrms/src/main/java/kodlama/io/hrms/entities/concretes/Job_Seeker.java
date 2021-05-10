package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="t_job_seeker")
@Data
public class Job_Seeker {

	@Id
	@GeneratedValue
	@Column(name="job_seeker_id")
	private int id;
	
	@Column(name="fist_name")
	private String first_Name;
	
	@Column(name="last_name")
	private String last_Name;
	
	@Column(name="tckn")
	private String tckn;
	
	@Column(name="birth_date")
	private String birth_Date;
	
	@Column(name="email")
	private String email;
	
	@Column(name="system_password")
	private String password;
	
	@Column(name="job_position_id")
	private String job_Position_Id;
	
	
}
