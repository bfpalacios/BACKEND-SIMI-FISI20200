package pe.edu.ceid.simi.operative.web.controller;

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

import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;
import pe.edu.ceid.simi.operative.application.nivel.NivelService;

import java.util.List;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/nivel"})

public class NivelController {
	@Autowired
	private NivelService service;
	
	@GetMapping(path = {"/listNivel/{id}"})
	public List<NivelDTO> getNivelbyIdioma(@PathVariable int id) {
		return this.service.getNivelbyIdioma(id);
	}

}
