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

import pe.edu.ceid.simi.management.application.docente.DocenteService;
import pe.edu.ceid.simi.management.domain.docente.model.Docente;
import pe.edu.ceid.simi.management.domain.docente.model.DocenteDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/docente"})
public class DocenteController {

	@Autowired
	private DocenteService service;
	
	@GetMapping(path = {"/listDocentes"})
	public List<DocenteDTO> getDocentes() {
		return this.service.getDocente();
	}
	
	@PutMapping(path = {"/actualizarDocente/{id}"})
	public Docente actualizarDocenteById(@RequestBody Docente docente, @PathVariable int id) {
		//docente.setCodDocente(id);
		return this.service.editDocente(docente, id);
	}
	
	@DeleteMapping(path = {"/eliminarDocenteById/{id}"})
	public boolean eliminarDocenteById(@PathVariable int id) {	
			return this.service.deleteDocente(id);
	}
	
	@PostMapping(path = {"/crearDocente"})
	public Docente crearDocente(@RequestBody Docente docente) {
		return this.service.crearDocente(docente);
	}
	
	@GetMapping(path= {"/obtenerDocenteById/{id}"})
	public DocenteDTO obtenerDocente(@PathVariable int id) {
		return this.service.getDocenteById(id);
	}
	
}
