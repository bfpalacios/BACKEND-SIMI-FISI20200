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

import pe.edu.ceid.simi.operative.application.programacion.ProgramacionService;
import pe.edu.ceid.simi.operative.domain.programacion.model.Programacion;
import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/programacionCurso/programacion"})

public class ProgramacionController {
	@Autowired
	private ProgramacionService service;
	
	@GetMapping(path = {"/listProgramacion"})
	public List<ProgramacionDTO> getProgramacion() {
		return this.service.getProgramacion();
	}
	
	@GetMapping(path = {"/listProgramacionbyID/{id}"})
	public List<ProgramacionDTO> getProgramacionbyID(@PathVariable int id) {
		return this.service.getProgramacionbyID(id);
	}
}
