package pe.edu.ceid.simi.operative.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.hora.HoraService;
import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;

@RestController
@RequestMapping({"/api/v1/programacionCurso/hora"})

public class HoraController {

	@Autowired
	private HoraService service;
	
	@GetMapping (path = {"/listHora/{id}"})
	public List<HoraDTO> getHora(@PathVariable int id) {
		return this.service.getHora(id);
	}
}
