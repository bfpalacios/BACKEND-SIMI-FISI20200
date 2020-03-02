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

import pe.edu.ceid.simi.operative.application.DocenteCurso.DocenteCursoService;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;

import java.util.List;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionDocente/curso"})

public class DocenteCursoController {
	@Autowired
	private DocenteCursoService service;
	
	@GetMapping(path = {"/listCurso/{id}"})
	public List<DocenteCurso> listCursoByDocente(@PathVariable int id) {
		return this.service.listCursoByDocente(id);
	}

}
