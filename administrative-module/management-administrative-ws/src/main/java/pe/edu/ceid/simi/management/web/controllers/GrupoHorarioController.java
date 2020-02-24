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

import pe.edu.ceid.simi.management.application.grupohorario.GrupoHorarioService;
import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorario;
import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorarioDTO;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/grupoHorario"})
public class GrupoHorarioController {

	@Autowired
	private GrupoHorarioService service;
	
	@GetMapping(path = {"/listGrupoHorario"})
	public List<GrupoHorarioDTO> getGrupoHorario() {
		return this.service.getGrupoHorario();
	}
	
	@PutMapping(path = {"/actualizarGrupoHorario/{id}"})
	public GrupoHorario actualizarGrupoHorarioById(@RequestBody GrupoHorario grupoHorario, @PathVariable int id) {
		grupoHorario.setIdGrupoHorario(id);
		return this.service.editGrupoHorario(grupoHorario, id);
	}

	@DeleteMapping(path = {"/eliminarGrupoHorarioById/{id}"})
	public boolean eliminarGrupoHorarioById(@PathVariable int id) {	
		return this.service.deleteGrupoHorario(id);
	}
	
	@PostMapping(path = {"/crearGrupoHorario"})
	public GrupoHorario crearGrupoHorario(@RequestBody GrupoHorario grupoHorario) {
		return this.service.crearGrupoHorario(grupoHorario);
	}
	
	@GetMapping(path= {"/obtenerGrupoHorarioById/{id}"})
	public GrupoHorarioDTO obtenerGrupoHorario(@PathVariable int id) {
		return this.service.getGrupoHorarioById(id);
	}
}
