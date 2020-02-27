package pe.edu.ceid.simi.management.web.controllers;

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

import pe.edu.ceid.simi.management.application.curso.CursoService;
import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;

import java.util.List;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/curso"})
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping(path = {"/listCursos"})
	public List<CursoDTO> getCursos() {
		return this.service.getCursos();
	}
	
	@PutMapping(path = {"/actualizarCurso/{id}"})
	public String actualizarCurso(@RequestBody Curso curso, @PathVariable int id) {
		
		curso.setIdCurso(id);
		return this.service.editCurso(curso, id);
	}

	@DeleteMapping(path = {"/eliminarCursoById/{id}"})
	public String eliminarCursoById(@PathVariable int id) {	
		return this.service.deleteCurso(id);
	}
	
	@PostMapping(path = {"/crearCurso"})
	public String crearCurso(@RequestBody Curso curso) {
		return this.service.crearCurso(curso);
	}
	
	@GetMapping(path= {"/obtenerCursoById/{id}"})
	public CursoDTO obtenerCursoById(@PathVariable int id) {
		return this.service.getCursoById(id);
	}

	@GetMapping(path = {"/listCursosByIdioma/{id}"})
	public List<CursoDTO> getCursosByIdioma(@PathVariable int id) {
		return this.service.getCursosByIdioma(id);
	}

	@GetMapping(path = {"/listCursosByPeriodo/{id}"})
	public List<CursoDTO> getCursosByPeriodo(@PathVariable int id) {
		return this.service.getCursosByIdioma(id);
	}
	
}
