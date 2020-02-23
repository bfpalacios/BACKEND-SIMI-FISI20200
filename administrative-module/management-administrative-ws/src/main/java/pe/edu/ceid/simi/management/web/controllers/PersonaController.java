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

import pe.edu.ceid.simi.management.application.persona.PersonaService;
import pe.edu.ceid.simi.management.domain.persona.model.Persona;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/periodoacademico"})
public class PersonaController {

	@Autowired
	private PersonaService service;
	
	@GetMapping(path = {"/listPersonas"})
	public List<Persona> getPersonas() {
		return this.service.getPersonas();
	}
	
	@PutMapping(path = {"/actualizarPersona/{id}"})
	public Persona actualizarPersonaById(@RequestBody Persona persona, @PathVariable int id) {
		persona.setIdPersona(id);
		return this.service.editPersona(persona, id);
	}

	@DeleteMapping(path = {"/eliminarPersonaById/{id}"})
	public boolean eliminarPersonaById(@PathVariable int id) {	
		return this.service.deletePersona(id);
	}
	
	@PostMapping(path = {"/crearPersona"})
	public Persona crearPersona(@RequestBody Persona persona) {
		return this.service.crearPersona(persona);
	}
	
	@GetMapping(path= {"/obtenerPersonaById/{id}"})
	public Persona obtenerPersona(@PathVariable int id) {
		return this.service.getPersonaById(id);
	}
	
}
