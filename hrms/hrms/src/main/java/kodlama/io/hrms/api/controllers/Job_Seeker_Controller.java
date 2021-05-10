package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.Job_Seeker_Service;
import kodlama.io.hrms.entities.concretes.Job_Seeker;

@RestController
@RequestMapping("/api/job_seeker")

public class Job_Seeker_Controller {

	private Job_Seeker_Service job_Seeker_Service;

	@Autowired
	public Job_Seeker_Controller(Job_Seeker_Service job_Seeker_Service) {
		
		this.job_Seeker_Service = job_Seeker_Service;
	}
	
	@GetMapping("/getall")
	public List<Job_Seeker> getAll() {
		return job_Seeker_Service.getAll();
	}
	
}
