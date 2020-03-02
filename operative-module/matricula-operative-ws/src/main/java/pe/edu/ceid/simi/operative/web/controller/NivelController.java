package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.nivel.NivelService;
import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;

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
