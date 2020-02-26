package pe.edu.ceid.simi.management.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.management.application.estadomatricula.EstadoMatriculaService;
import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/procesomatricula/estadomatricula"})
public class EstadoMatriculaController {

	@Autowired
	private EstadoMatriculaService service;

	@GetMapping(path = {"/listEstadoMatricula"})
	public List<EstadoMatricula> getEstadoMatricula() {
		return this.service.getEstadoMatricula();
	}
	
	@GetMapping(path= {"/obtenerEstadoMatriculaById/{id}"})
	public EstadoMatricula obtenerEstadoMatriculaById(@PathVariable String id) {
		return this.service.getEstadoMatriculaById(id);
	}

}
