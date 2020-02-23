package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.domain.alumno.model.Alumno;
import pe.edu.ceid.simi.operative.domain.alumno.model.AlumnoDTO;
import pe.edu.ceid.simi.operative.application.alumno.AlumnoService;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/alumno"})
public class AlumnoController {
	@Autowired
	private AlumnoService service;
	
	@GetMapping(path= {"/{id}"})
	public AlumnoDTO obtenerAlumnoById(@PathVariable int id) {
		return this.service.getAlumnoById(id);
	}
	
}
