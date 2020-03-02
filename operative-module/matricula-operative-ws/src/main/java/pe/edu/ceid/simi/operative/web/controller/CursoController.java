package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.curso.CursoService;
import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;


@RestController
@RequestMapping({"/api/v1/programacionCurso/curso"})
public class CursoController {

	@Autowired
	private CursoService service;
	
	@GetMapping (path = {"/listCurso/{idIdioma}/{idNivel}"})
	public List<CursoDTO> getCursobyNivel(@PathVariable("idIdioma") int id1, @PathVariable("idNivel") int id2) {
		return this.service.getCursobyNivel(id1, id2);
	}
}
