package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.persona.PersonaService;
import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;

@RestController
@RequestMapping({"/api/v1/persona"})
public class PersonaController {

	@Autowired
	PersonaService service;
	
	@GetMapping(path = {"/datosUsuario/{id}"})
	public PersonaUsuario obtenerDatosUsuario(@PathVariable("id") int codUsuario) {
		return this.service.obtenerDatosUsuario(codUsuario);
	}
}
