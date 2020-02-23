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

import pe.edu.ceid.simi.operative.application.grupo.GrupoService;
import pe.edu.ceid.simi.operative.domain.grupo.model.Grupo;


@RestController
@RequestMapping({"/api/v1/programacionCurso/grupoHorario"})

public class GrupoController {
	@Autowired
	private GrupoService service;
	
	@GetMapping (path = {"/listGrupo"})
	public List<Grupo> getGrupo() {
		return this.service.getGrupo();
	}

}
