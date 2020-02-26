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

import pe.edu.ceid.simi.management.application.sede.SedeService;
import pe.edu.ceid.simi.management.domain.sede.model.Sede;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/sede"})
public class SedeController {
	
	@Autowired
	private SedeService service;
	
	@GetMapping(path = {"/listSedes"})
	public List<Sede> getSedes() {
		return this.service.getSedes();
	}
	
	@PutMapping(path = {"/actualizarSede/{id}"})
	public Sede actualizarSedeById(@RequestBody Sede sede, @PathVariable int id) {
		
		sede.setIdSede(id);
		return this.service.editSede(sede, id);
	}

	@DeleteMapping(path = {"/eliminarSedeById/{id}"})
	public String eliminarSedeById(@PathVariable int id) {	
			return this.service.deleteSede(id);
	}
	
	@PostMapping(path = {"/crearSede"})
	public Sede crearSede(@RequestBody Sede sede) {
		return this.service.crearSede(sede);
	}
	
	@GetMapping(path= {"/obtenerSedeById/{id}"})
	public Sede obtenerSede(@PathVariable int id) {
		return this.service.getSedeById(id);
	}
	
}
