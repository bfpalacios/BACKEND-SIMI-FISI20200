package pe.edu.ceid.simi.management.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.management.application.horasclase.HorasClaseService;
import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;



//@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/horasclase"})

public class HorasClaseController {

	@Autowired
	private HorasClaseService service;
	
	@GetMapping(path = {"/listHorasClase"})
	public List<HorasClase> getHorasClase() {
		return this.service.getHorasClase();
	}
	
	@PutMapping(path = {"/actualizarHorasClase/{id}"})
	public HorasClase actualizarHorasClaseById(@RequestBody HorasClase hora, @PathVariable int id) {
		
		hora.setIdHora(id);
		return this.service.editHorasClase(hora, id);
	}

	@DeleteMapping(path = {"/eliminarHorasClaseById/{id}"})
	public boolean eliminarHorasClaseById(@PathVariable int id) {	
			return this.service.deleteHorasClase(id);
	}
	
	@PostMapping(path = {"/crearHorasClase"})
	public HorasClase crearHorasClase(@RequestBody HorasClase hora) {
		return this.service.crearHorasClase(hora);
	}
	
	@GetMapping(path= {"/obtenerHorasClaseById/{id}"})
	public HorasClase obtenerHorasClase(@PathVariable int id) {
		return this.service.getHorasClaseById(id);
	}
}
