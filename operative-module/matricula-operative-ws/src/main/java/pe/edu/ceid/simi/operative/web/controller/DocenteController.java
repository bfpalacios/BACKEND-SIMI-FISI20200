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

import pe.edu.ceid.simi.operative.application.docente.DocenteService;
import pe.edu.ceid.simi.operative.domain.docente.model.DocenteDTO;

@CrossOrigin(origins = "localhost:4200")
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
