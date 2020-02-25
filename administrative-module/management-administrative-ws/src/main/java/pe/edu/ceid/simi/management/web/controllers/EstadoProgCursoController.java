package pe.edu.ceid.simi.management.web.controllers;

import java.util.List;

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

import pe.edu.ceid.simi.management.application.estadoprogcurso.EstadoProgCursoService;
import pe.edu.ceid.simi.management.domain.estadoprogcurso.model.EstadoProgCurso;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/estadoprogcurso"})
public class EstadoProgCursoController {
	
	@Autowired
	private EstadoProgCursoService service;
	
	@GetMapping(path = {"/listEstadoProgCursos"})
	public List<EstadoProgCurso> getEstadoProgCursos() {
		return this.service.getEstadoProgCurso();
	}
	
	@PutMapping(path = {"/actualizarEstadoProgCurso/{id}"})
	public EstadoProgCurso actualizarEstadoProgCursoById(@RequestBody EstadoProgCurso estadoProgCurso, @PathVariable int id) {
		estadoProgCurso.setIdEstadoProgCurso(id);
		return this.service.editEstadoProgCurso(estadoProgCurso, id);
	}

	@DeleteMapping(path = {"/eliminarEstadoProgCursoById/{id}"})
	public boolean eliminarEstadoProgCursoById(@PathVariable int id) {	
			return this.service.deleteEstadoProgCurso(id);
	}
	
	@PostMapping(path = {"/crearEstadoProgCurso"})
	public EstadoProgCurso crearEstadoProgCurso(@RequestBody EstadoProgCurso estadoProgCurso) {
		return this.service.crearEstadoProgCurso(estadoProgCurso);
	}
	
	@GetMapping(path= {"/obtenerEstadoProgCursoById/{id}"})
	public EstadoProgCurso obtenerEstadoProgCurso(@PathVariable int id) {
		return this.service.getEstadoProgCursoById(id);
	}
	
}
