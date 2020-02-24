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

import pe.edu.ceid.simi.management.application.estudiante.EstudianteService;
import pe.edu.ceid.simi.management.domain.estudiante.model.Estudiante;
import pe.edu.ceid.simi.management.domain.estudiante.model.EstudianteDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/estudiante"})
public class EstudianteController {

	@Autowired
	private EstudianteService service;

	@GetMapping(path = {"/listEstudiantes"})
	public List<EstudianteDTO> getEstudiantes() {
		return this.service.getEstudiantes();
	}
	
	@PutMapping(path = {"/actualizarEstudiante/{id}"})
	public Estudiante actualizarEstudianteById(@RequestBody Estudiante estudiante, @PathVariable int id) {
		estudiante.setCodEstudiante(id);
		return this.service.editEstudiante(estudiante, id);
	}

	@DeleteMapping(path = {"/eliminarEstudianteById/{id}"})
	public boolean eliminarEstudianteById(@PathVariable int id) {	
			return this.service.deleteEstudiante(id);
	}
	
	@PostMapping(path = {"/crearEstudiante"})
	public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
		return this.service.crearEstudiante(estudiante);
	}
	
	@GetMapping(path= {"/obtenerEstudianteById/{id}"})
	public EstudianteDTO obtenerEstudiante(@PathVariable int id) {
		return this.service.getEstudianteById(id);
	}
	
}
