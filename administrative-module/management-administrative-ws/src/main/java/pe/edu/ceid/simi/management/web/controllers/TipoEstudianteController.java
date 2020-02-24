package pe.edu.ceid.simi.management.web.controllers;

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

import pe.edu.ceid.simi.management.application.tipoestudiante.TipoEstudianteService;
import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionDocente/tipoestudiante"})
public class TipoEstudianteController {
	@Autowired
	private TipoEstudianteService service;
	
	@GetMapping(path = {"/listTipoEstudiante"})
	public List<TipoEstudiante> getTipoEstudiante() {
		return this.service.getTiposEstudiante();
	}
	
	@PutMapping(path = {"/actualizarTipoEstudiante/{id}"})
	public TipoEstudiante actualizarTipoEstudianteById(@RequestBody TipoEstudiante tipoEstudiante, @PathVariable int id) {
		tipoEstudiante.setIdTipoEstudiante(id);
		return this.service.editTipoEstudiante(tipoEstudiante, id);
	}

	@DeleteMapping(path = {"/eliminarTipoEstudianteById/{id}"})
	public boolean eliminarTipoEstudianteById(@PathVariable int id) {	
		return this.service.deleteTipoEstudiante(id);
	}
	
	@PostMapping(path = {"/crearTipoEstudiante"})
	public TipoEstudiante crearTipoEstudiante(@RequestBody TipoEstudiante tipoEstudiante) {
		return this.service.crearTipoEstudiante(tipoEstudiante);
	}
	
	@GetMapping(path= {"/obtenerTipoEstudianteById/{id}"})
	public TipoEstudiante obtenerTipoEstudiante(@PathVariable int id) {
		return this.service.getTipoEstudianteById(id);
	}
	
}
