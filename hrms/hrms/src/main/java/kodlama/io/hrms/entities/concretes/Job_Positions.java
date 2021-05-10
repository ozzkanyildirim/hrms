package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="t_job_positions")
@Data

public class Job_Positions {

	@Id
	@GeneratedValue
	@Column(name="job_positions_id")
	private int id;
	
	@Column(name="job_positions_name")
	private String name;
}
