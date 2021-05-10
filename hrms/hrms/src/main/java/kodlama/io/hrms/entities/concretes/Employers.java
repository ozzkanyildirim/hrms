package kodlama.io.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="t_employers")
@Data

public class Employers {

	@Id
	@GeneratedValue
	@Column(name="employers_id")
	private int id;
	
	@Column(name="company_name")
	private String name;
	
	@Column(name="web_site")
	private String web_site;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="system_password")
	private String password;
	
	
}
