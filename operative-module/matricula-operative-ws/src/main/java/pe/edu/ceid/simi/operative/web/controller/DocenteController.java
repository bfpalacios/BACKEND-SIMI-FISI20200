package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.docente.DocenteService;
import pe.edu.ceid.simi.operative.domain.docente.model.DocenteDTO;

@RestController
@RequestMapping({"/api/v1/programacionDocente/docente"})
public class DocenteController {

	@Autowired
	private DocenteService service;
	
	@GetMapping(path = {"/listDocentes"})
	public List<DocenteDTO> getDocentes() {
		return this.service.getDocente();
	}
	
}
