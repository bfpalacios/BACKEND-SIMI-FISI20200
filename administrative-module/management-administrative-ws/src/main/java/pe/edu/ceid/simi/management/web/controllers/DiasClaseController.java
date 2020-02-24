package pe.edu.ceid.simi.management.web.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.management.application.diasclase.DiasClaseService;
import pe.edu.ceid.simi.management.domain.diasclase.model.DiasClase;


@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/diasclase"})
public class DiasClaseController {

	@Autowired
	private DiasClaseService service;
	
	@GetMapping(path = {"/listDiasClase"})
	public List<DiasClase> getDiasClase() {
		return this.service.getDiasClase();
	}
	
	@PutMapping(path = {"/actualizarDiasClase/{id}"})
	public DiasClase actualizarDiasClaseById(@RequestBody DiasClase dia, @PathVariable int id) {
		
		dia.setIdDia(id);
		return this.service.editDiasClase(dia, id);
	}

	@DeleteMapping(path = {"/eliminarDiasClaseById/{id}"})
	public boolean eliminarDiasClaseById(@PathVariable int id) {	
			return this.service.deleteDiasClase(id);
	}
	
	@PostMapping(path = {"/crearDiasClase"})
	public DiasClase crearDiasClase(@RequestBody DiasClase dia) {
		return this.service.crearDiasClase(dia);
	}
	
	@GetMapping(path= {"/obtenerDiasClaseById/{id}"})
	public DiasClase obtenerDiasClase(@PathVariable int id) {
		return this.service.getDiasClaseById(id);
	}
}
