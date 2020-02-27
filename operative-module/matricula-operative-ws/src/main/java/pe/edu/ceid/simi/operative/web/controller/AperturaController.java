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

import pe.edu.ceid.simi.operative.domain.apertura.model.Apertura;
import pe.edu.ceid.simi.operative.domain.apertura.model.AperturaDTO;
import pe.edu.ceid.simi.operative.application.apertura.AperturaService;

@RestController
@RequestMapping({"/api/v1/programacionCurso/apertura"})
public class AperturaController {
	
	@Autowired
	private AperturaService service;
	
	@GetMapping (path = {"/listApertura"})
	public List<AperturaDTO> getApertura() {
		return this.service.getApertura();
	}
	
	@GetMapping (path = {"/listApertura/{id}"})
	public List<AperturaDTO> getAperturabyID(@PathVariable int id) {
		return this.service.getAperturabyID(id);
	}
	
	@PostMapping (path = {"/crearApertura"})
	public Apertura crearApertura(@RequestBody Apertura apertura) {
		return this.service.crearApertura(apertura);
	}
	
}
