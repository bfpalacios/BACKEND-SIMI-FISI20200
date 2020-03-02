package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.idioma.IdiomaService;
import pe.edu.ceid.simi.operative.domain.idioma.model.IdiomaDTO;

@RestController
@RequestMapping({"/api/v1/programacionCurso/idioma"})

public class IdiomaController {
	
	@Autowired
	private IdiomaService service;
	
	@GetMapping (path = {"/listIdioma"})
	public List<IdiomaDTO> getIdioma() {
		return this.service.getIdioma();
	}

}
