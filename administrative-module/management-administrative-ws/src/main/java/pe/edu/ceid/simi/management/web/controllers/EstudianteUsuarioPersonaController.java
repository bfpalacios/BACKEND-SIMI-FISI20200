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

import pe.edu.ceid.simi.management.application.estudianteusuariopersona.EstudianteUsuarioPersonaService;
import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/estudianteusuariopersona"})
public class EstudianteUsuarioPersonaController {

	@Autowired
	private EstudianteUsuarioPersonaService service;
	
	@GetMapping(path = {"/listEstudianteUsuarioPersonas"})
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonas() {
		return this.service.getEstudianteUsuarioPersona();
	}
	
	@PutMapping(path = {"/actualizarEstudianteUsuarioPersona/{id}"})
	public EstudianteUsuarioPersona actualizarEstudianteUsuarioPersonaById(@RequestBody EstudianteUsuarioPersona docUsuPer, @PathVariable int id) {
		//docente.setCodDocente(id);
		return this.service.editEstudianteUsuarioPersona(docUsuPer, id);
	}
	
	@DeleteMapping(path = {"/eliminarEstudianteUsuarioPersonaById/{id}"})
	public boolean eliminarEstudianteUsuarioPersonaById(@PathVariable String id) {	
			return this.service.deleteEstudianteUsuarioPersona(id);
	}
	
	@PostMapping(path = {"/crearEstudianteUsuarioPersona"})
	public EstudianteUsuarioPersona crearEstudianteUsuarioPersona(@RequestBody EstudianteUsuarioPersona docUsuPer) {
		return this.service.crearEstudianteUsuarioPersona(docUsuPer);
	}
	
	@GetMapping(path= {"/obtenerEstudianteUsuarioPersonaById/{id}"})
	public EstudianteUsuarioPersona obtenerEstudianteUsuarioPersona(@PathVariable String id) {
		return this.service.getEstudianteUsuarioPersonaById(id);
	}
	
}
