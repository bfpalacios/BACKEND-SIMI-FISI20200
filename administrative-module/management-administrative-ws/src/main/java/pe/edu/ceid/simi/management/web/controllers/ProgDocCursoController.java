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

import pe.edu.ceid.simi.management.application.progdoccurso.ProgDocCursoService;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCurso;
import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionDocente/progdoccurso"})
public class ProgDocCursoController {

	@Autowired
	private ProgDocCursoService service;
	
	@GetMapping(path = {"/listProgDocCursos"})
	public List<ProgDocCursoDTO> getProgDocCursos() {
		return this.service.getProgDocCursos();
	}
	
	@PutMapping(path = {"/actualizarProgDocCurso/{id}"})
	public String actualizarProgDocCurso(@RequestBody ProgDocCurso progDocCurso, @PathVariable int id) {
		
		progDocCurso.setIdProgDocCur(id);
		return this.service.editProgDocCurso(progDocCurso, id);
	}

	@DeleteMapping(path = {"/eliminarProgDocCursoById/{id}"})
	public String eliminarProgDocCursoById( @PathVariable int id) {	
		return this.service.deleteProgDocCurso(id);
	}
	
	@PostMapping(path = {"/crearProgDocCurso"})
	public String crearProgDocCurso(@RequestBody ProgDocCurso progDocCurso) {
		return this.service.crearProgDocCurso(progDocCurso);
	}
	
	@GetMapping(path= {"/obtenerProgDocCursoById/{id}"})
	public ProgDocCursoDTO obtenerProgDocCursoById(@PathVariable int id) {
		return this.service.getProgDocCursoById(id);
	}

	@GetMapping(path = {"/listProgDocCursosByPeriodo/{id}"})
	public List<ProgDocCursoDTO> getProgDocCursosByPeriodo(@PathVariable int id) {
		return this.service.getProgDocCursosByPeriodo(id);
	}

	@GetMapping(path = {"/listProgDocCursosByPeriodoIdioma/{idPeriodo}/{idIdioma}"})
	public List<ProgDocCursoDTO> getProgDocCursosByPeriodoIdioma(@PathVariable int idPeriodo,
			@PathVariable int idIdioma) {
		return this.service.getProgDocCursosByPeriodoIdioma(idPeriodo, idIdioma);
	}

	@GetMapping(path = {"/listProgDocCursosByDocenteCursoPeriodo/{codDocente}/{idCurso}/{idPeriodo}"})
	public List<ProgDocCursoDTO> getProgDocCursosByDocenteCursoPeriodo(@PathVariable String codDocente,
			@PathVariable int idCurso, @PathVariable int idPeriodo) {
		return this.service.getProgDocCursosByDocenteCursoPeriodo(codDocente, idCurso, idPeriodo);
	}
	
}
