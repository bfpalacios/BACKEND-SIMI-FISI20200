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

import pe.edu.ceid.simi.management.application.matricula.MatriculaService;
import pe.edu.ceid.simi.management.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/procesoMatricula/matricula"})
public class MatriculaController {

	@Autowired
	private MatriculaService service;
	
	@GetMapping(path = {"/listMatriculas"})
	public List<MatriculaDTO> getMatriculas() {
		return this.service.getMatriculas();
	}
	
	@PutMapping(path = {"/actualizarMatricula/{id}"})
	public Matricula actualizarMatricula(@RequestBody Matricula curso, @PathVariable int id) {
		curso.setIdMatricula(id);
		return this.service.editMatricula(curso, id);
	}

	@DeleteMapping(path = {"/eliminarMatriculaById/{id}"})
	public boolean eliminarMatriculaById(@PathVariable int id) {	
		return this.service.deleteMatricula(id);
	}
	
	@PostMapping(path = {"/crearMatricula"})
	public Matricula crearMatricula(@RequestBody Matricula curso) {
		return this.service.crearMatricula(curso);
	}
	
	@GetMapping(path= {"/obtenerMatriculaById/{id}"})
	public MatriculaDTO obtenerMatriculaById(@PathVariable int id) {
		return this.service.getMatriculaById(id);
	}

	@GetMapping(path = {"/listMatriculasBySedePeriodo/{idSede}/{idPeriodo}"})
	public List<MatriculaDTO> getMatriculasBySedePeriodo(@PathVariable int idSede, @PathVariable int idPeriodo) {
		return this.service.getMatriculasBySedePeriodo(idSede, idPeriodo);
	}
	
}
