package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.Employers_Service;
import kodlama.io.hrms.entities.concretes.Employers;

@RestController
@RequestMapping("/api/employers")
public class Employers_Controller {

	private Employers_Service employers_Service;

	@Autowired
	public Employers_Controller(Employers_Service employers_Service) {
		
		this.employers_Service = employers_Service;
	}
	
	@GetMapping("/getall")
	public List<Employers> getAll() {
		return employers_Service.getAll();
	}
	
}
