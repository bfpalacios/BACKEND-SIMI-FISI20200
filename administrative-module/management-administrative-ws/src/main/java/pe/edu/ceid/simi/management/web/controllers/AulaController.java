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

import pe.edu.ceid.simi.management.application.aula.AulaService;
import pe.edu.ceid.simi.management.domain.aula.model.Aula;
import pe.edu.ceid.simi.management.domain.aula.model.AulaDTO;


@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/aula"})
public class AulaController {
	@Autowired
	private AulaService service;
	
	@GetMapping(path = {"/listAulas"})
	public List<AulaDTO> getAulas() {
		return this.service.getAulas();
	}
	
	@PutMapping(path = {"/actualizarAula/{id}"})
	public Aula actualizarAula(@RequestBody Aula aula, @PathVariable int id) {
		aula.setIdAula(id);
		return this.service.editAula(aula, id);
	}

	@DeleteMapping(path = {"/eliminarAulaById/{id}"})
	public String eliminarAulaById( @PathVariable int id) {	
		return this.service.deleteAula(id);
	}
	
	@PostMapping(path = {"/crearAula"})
	public Aula crearAula(@RequestBody Aula aula) {
		return this.service.crearAula(aula);
	}
	
	@GetMapping(path= {"/obtenerAulaById/{id}"})
	public AulaDTO obtenerAulaById(@PathVariable int id) {
		return this.service.getAulaById(id);
	}

	@GetMapping(path = {"/listAulasBySede/{id}"})
	public List<AulaDTO> getAulasBySede(@PathVariable int id) {
		return this.service.getAulasBySede(id);
	}
	
}
