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

import pe.edu.ceid.simi.management.application.progcurso.ProgCursoService;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/progcurso"})
public class ProgCursoController {

	@Autowired
	private ProgCursoService service;
	
	@GetMapping(path = {"/listProgCursos"})
	public List<ProgCursoDTO> getProgCursos() {
		return this.service.getProgCursos();
	}
	
	@PutMapping(path = {"/actualizarProgCurso/{id}"})
	public ProgCurso actualizarProgDocCurso(@RequestBody ProgCurso progCurso, @PathVariable int id) {
		progCurso.setIdProgDocCur(id);
		return this.service.editProgCurso(progCurso, id);
	}

	@DeleteMapping(path = {"/eliminarProgCursoById/{id}"})
	public boolean eliminarProgCursoById( @PathVariable int id) {	
		return this.service.deleteProgCurso(id);
	}
	
	@PostMapping(path = {"/crearProgCurso"})
	public ProgCurso crearProgCurso(@RequestBody ProgCurso progCurso) {
		return this.service.crearProgCurso(progCurso);
	}
	
	@GetMapping(path= {"/obtenerProgCursoById/{id}"})
	public ProgCursoDTO obtenerProgCursoById(@PathVariable int id) {
		return this.service.getProgCursoById(id);
	}
	
}