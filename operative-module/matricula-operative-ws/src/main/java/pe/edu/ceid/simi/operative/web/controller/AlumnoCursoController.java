package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.AlumnoCurso.AlumnoCursoService;
import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;

@RestController
@RequestMapping({"/api/v1/programacionDocente/alumno"})
public class AlumnoCursoController {
	@Autowired
	private AlumnoCursoService service;
	
	@GetMapping(path= {"/listAlumnoCurso/{id}"})
	public List<AlumnoCurso> getAlumnoByCurso(@PathVariable int id) {
		return this.service.getAlumnoByCurso(id);
	}
	
	
}
