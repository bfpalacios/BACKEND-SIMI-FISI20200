package pe.edu.ceid.simi.management.web.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.management.application.nivel.NivelService;
import pe.edu.ceid.simi.management.domain.nivel.model.Nivel;

import java.util.List;

//@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/nivel"})

public class NivelController {

	@Autowired
	private NivelService service;
	
	@GetMapping(path = {"/listNiveles"})
	public List<Nivel> getNiveles() {
		return this.service.getNiveles();
	}
	
	
	@GetMapping(path= {"/obtenerNivelById/{id}"})
	public Nivel obtenerNivel(@PathVariable int id) {
		return this.service.getNivelById(id);
	}
	
}
