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
@RequestMapping({"/api/v1/programacionCurso/progcurso"})
public class ProgCursoController {

	@Autowired
	private ProgCursoService service;

	@GetMapping(path = {"/listProgCursos"})
	public List<ProgCursoDTO> getProgCursos() {
		return this.service.getProgCursos();
	}

	@GetMapping(path = {"/listProgCursosByCursoPeriodo/{idCurso}/{idPeriodo}"})
	public List<ProgCursoDTO> getProgCursosByCursoPeriodo(@PathVariable int idCurso, @PathVariable int idPeriodo) {
		return this.service.getProgCursosByCursoPeriodo(idCurso, idPeriodo);
	}

	@GetMapping(path = {"/listProgCursosByCursoHorarioPeriodo/{idCurso}/{idHorario}/{idPeriodo}"})
	public List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(@PathVariable int idCurso,
			@PathVariable int idHorario, @PathVariable int idPeriodo) {
		return this.service.getProgCursosByCursoHorarioPeriodo(idCurso, idHorario, idPeriodo);
	}

	@GetMapping(path = {"/listProgCursosByPeriodo/{idPeriodo}"})
	public List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(@PathVariable int idPeriodo) {
		return this.service.getProgCursosByPeriodo(idPeriodo);
	}

	@GetMapping(path = {"/listProgCursosBySedePeriodo/{idSede}/{idPeriodo}"})
	public List<ProgCursoDTO> getProgCursosBySedePeriodo(@PathVariable int idSede, @PathVariable int idPeriodo) {
		return this.service.getProgCursosBySedePeriodo(idSede, idPeriodo);
	}

	@GetMapping(path = {"/listProgCursosBySedePeriodoIdioma/{idSede}/{idPeriodo}/{idIdioma}"})
	public List<ProgCursoDTO> getProgCursosBySedePeriodoIdioma(@PathVariable int idSede,
			@PathVariable int idPeriodo, @PathVariable int idIdioma) {
		return this.service.getProgCursosBySedePeriodoIdioma(idSede, idPeriodo, idIdioma);
	}

	@GetMapping(path = {"/obtenerIdProgCursoByCursoHorarioSedePeriodo/{idCurso}/{idHorario}/{idSede}/{idPeriodo}"})
	public Integer getIdProgCursoByCursoHorarioSedePeriodo(@PathVariable int idCurso, @PathVariable int idHorario,
			@PathVariable int idSede, @PathVariable int idPeriodo) {
		return this.service.getIdProgCursoByCursoHorarioSedePeriodo(idCurso, idHorario, idSede, idPeriodo);
	}
	
	@PutMapping(path = {"/actualizarProgCurso/{id}"})
	public String actualizarProgCurso(@RequestBody ProgCurso progCurso, @PathVariable int id) {
		progCurso.setIdProgCurso(id);
		return this.service.editProgCurso(progCurso, id);
	}

	@DeleteMapping(path = {"/eliminarProgCursoById/{id}"})
	public String eliminarProgCursoById( @PathVariable int id) {	
		return this.service.deleteProgCurso(id);
	}
	
	@PostMapping(path = {"/crearProgCurso"})
	public String crearProgCurso(@RequestBody ProgCurso progCurso) {
		return this.service.crearProgCurso(progCurso);
	}

	@GetMapping(path= {"/obtenerProgCursoById/{id}"})
	public ProgCursoDTO obtenerProgCursoById(@PathVariable int id) {
		return this.service.getProgCursoById(id);
	}

	@GetMapping(path= {"/docenteOcupado/{idProgDocente}/{idHorario}/{idPeriodo}"})
	public String docenteOcupadoByDocenteHorarioPeriodo(@PathVariable int idProgDocente,
			@PathVariable int idHorario, @PathVariable int idPeriodo) {
		return this.service.docenteOcupadoByDocenteHorarioPeriodo(idProgDocente, idHorario, idPeriodo);
	}
	
}
