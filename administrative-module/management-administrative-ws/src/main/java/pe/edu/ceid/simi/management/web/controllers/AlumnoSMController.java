package pe.edu.ceid.simi.management.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.management.application.alumnosm.AlumnoSMService;
import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/procesomatricula/alumnosm"})
public class AlumnoSMController {
	
	@Autowired
	private AlumnoSMService service;
	
	@GetMapping(path = {"/listAlumnoSM"})
	public List<AlumnoSM> getAlumnoSM() {
		return this.service.getAlumnoSM();
	}
	
	@GetMapping(path= {"/obtenerAlumnoSMById/{id}"})
	public AlumnoSM obtenerAlumnoSMById(@PathVariable String id) {
		return this.service.getAlumnoSMById(id);
	}

}
