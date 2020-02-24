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

import pe.edu.ceid.simi.management.application.horario.HorarioService;
import pe.edu.ceid.simi.management.domain.horario.model.Horario;
import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;


@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionCurso/horario"})

public class HorarioController {

	@Autowired
	private HorarioService service;
	
	@GetMapping(path = {"/listHorarios"})
	public List<HorarioDTO> getHorarios() {
		return this.service.getHorarios();
	}
	
	@PutMapping(path = {"/actualizarHorario/{id}"})
	public Horario actualizarHorarioById(@RequestBody Horario horario, @PathVariable int id) {
		
		horario.setIdGrupoHorario(id);
		return this.service.editHorario(horario, id);
	}

	@DeleteMapping(path = {"/eliminarHorarioById/{id}"})
	public boolean eliminarHorarioById(@PathVariable int id) {	
			return this.service.deleteHorario(id);
	}
	
	@PostMapping(path = {"/crearHorario"})
	public Horario crearHorario(@RequestBody Horario horario) {
		return this.service.crearHorario(horario);
	}
	
	@GetMapping(path= {"/obtenerHorarioById/{id}"})
	public List<HorarioDTO> obtenerHorario(@PathVariable int id) {
		return this.service.getHorariosById(id);
	}
}
