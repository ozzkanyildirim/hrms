package kodlama.io.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.hrms.business.abstracts.System_Admin_Service;
import kodlama.io.hrms.entities.concretes.System_Admin;

@RestController
@RequestMapping("/api/system_admin")
public class System_Admin_Controller {

	private System_Admin_Service admin_Service;

	@Autowired
	public System_Admin_Controller(System_Admin_Service admin_Service) {
		
		this.admin_Service = admin_Service;
	}
	
	
	@GetMapping("/getall")
	public List<System_Admin> getAll() {
		return admin_Service.getAll();
	}
	
}
