package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.Job_Positions_Service;
import kodlama.io.hrms.entities.concretes.Job_Positions;


@RestController
@RequestMapping("/api/job_positions")
public class Job_Positions_Controller {

	private Job_Positions_Service job_Positions_Service;
	
	@Autowired
	public Job_Positions_Controller(Job_Positions_Service job_Positions_Service) {
		
		this.job_Positions_Service = job_Positions_Service;
	}
	
	
	@GetMapping("/getall")
	public List<Job_Positions> getAll() {
		return job_Positions_Service.getall();
	}
	
}
