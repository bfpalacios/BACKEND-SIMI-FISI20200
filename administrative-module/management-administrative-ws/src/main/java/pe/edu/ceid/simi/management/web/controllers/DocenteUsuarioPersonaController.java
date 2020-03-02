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

import pe.edu.ceid.simi.management.application.docenteusuariopersona.DocenteUsuarioPersonaService;
import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionDocente/docenteusuariopersona"})
public class DocenteUsuarioPersonaController {

	@Autowired
	private DocenteUsuarioPersonaService service;
	
	@GetMapping(path = {"/listDocenteUsuarioPersona"})
	public List<DocenteUsuarioPersona> getDocenteUsuarioPersonas() {
		return this.service.getDocenteUsuarioPersona();
	}
	
	@PutMapping(path = {"/actualizarDocenteUsuarioPersona/{id}"})
	public String actualizarDocenteUsuarioPersonaById(@RequestBody DocenteUsuarioPersona docUsuPer, @PathVariable String id) {
		//docente.setCodDocente(id);
		return this.service.editDocenteUsuarioPersona(docUsuPer, id);
	}
	
	@DeleteMapping(path = {"/eliminarDocenteUsuarioPersonaById/{id}"})
	public String eliminarDocenteUsuarioPersonaById(@PathVariable String id) {	
			return this.service.deleteDocenteUsuarioPersona(id);
	}
	
	@PostMapping(path = {"/crearDocenteUsuarioPersona"})
	public String crearDocenteUsuarioPersona(@RequestBody DocenteUsuarioPersona docUsuPer) {
		return this.service.crearDocenteUsuarioPersona(docUsuPer);
	}
	
	@GetMapping(path= {"/obtenerDocenteUsuarioPersonaById/{id}"})
	public DocenteUsuarioPersona obtenerDocenteUsuarioPersona(@PathVariable String id) {
		return this.service.getDocenteUsuarioPersonaById(id);
	}

	@GetMapping(path = {"/listDocentesByCursoPeriodo/{idCurso}/{idPeriodo}"})
	public List<DocenteUsuarioPersona> getDocentesByCursoPeriodo(@PathVariable int idCurso, @PathVariable int idPeriodo) {
		return this.service.getDocentesByCursoPeriodo(idCurso, idPeriodo);
	}

	@GetMapping(path = {"/validarPasswdDocente/{codDocente}/{passwd}"})
	public String validarPasswdDocente(@PathVariable String codDocente, @PathVariable String passwd) {
		return this.service.validarPasswdDocente(codDocente, passwd);
	}
	
}


