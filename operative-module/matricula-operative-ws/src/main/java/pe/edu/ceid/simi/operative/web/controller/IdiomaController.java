package pe.edu.ceid.simi.operative.web.controller;

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

import pe.edu.ceid.simi.operative.domain.idioma.model.IdiomaDTO;
import pe.edu.ceid.simi.operative.application.idioma.IdiomaService;

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
