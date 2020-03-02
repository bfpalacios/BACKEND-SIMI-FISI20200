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

import pe.edu.ceid.simi.management.application.estudianteusuariopersona.EstudianteUsuarioPersonaService;
import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/procesomatricula/estudianteusuariopersona"})
public class EstudianteUsuarioPersonaController {

	@Autowired
	private EstudianteUsuarioPersonaService service;

	@GetMapping(path = {"/listEstudianteUsuarioPersonas"})
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonas() {
		return this.service.getEstudianteUsuarioPersona();
	}

	@GetMapping(path = {"/listEstudiantesMatriculadosByProgCurso/{id}"})
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonasMatriculadosByProgCurso(@PathVariable int id) {
		return this.service.getEstudianteUsuarioPersonaMatriculadosByProgCurso(id);
	}

	@GetMapping(path = {"/listEstudiantesByTipoEstudiante/{id}"})
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaByTipoEstudiante(@PathVariable int id) {
		return this.service.getEstudianteUsuarioPersonaByTipoEstudiante(id);
	}

	@GetMapping(path = {"/listEstudiantesByCursoPeriodo/{idCurso}/{idPeriodo}"})
	public List<EstudianteUsuarioPersona> getEstudiantesByCursoPeriodo(@PathVariable int idCurso,
			@PathVariable int idPeriodo) {
		return this.service.getEstudiantesByCursoPeriodo(idCurso, idPeriodo);
	}
	
	@PutMapping(path = {"/actualizarEstudianteUsuarioPersona/{id}"})
	public String actualizarEstudianteUsuarioPersonaById(@RequestBody EstudianteUsuarioPersona estUsuPer,
			@PathVariable String id) {
		return this.service.editEstudianteUsuarioPersona(estUsuPer, id);
	}
	
	@DeleteMapping(path = {"/eliminarEstudianteUsuarioPersonaById/{id}"})
	public String eliminarEstudianteUsuarioPersonaById(@PathVariable String id) {	
			return this.service.deleteEstudianteUsuarioPersona(id);
	}
	
	@PostMapping(path = {"/crearEstudianteUsuarioPersona"})
	public String crearEstudianteUsuarioPersona(@RequestBody EstudianteUsuarioPersona docUsuPer) {
		return this.service.crearEstudianteUsuarioPersona(docUsuPer);
	}
	
	@GetMapping(path= {"/obtenerEstudianteUsuarioPersonaById/{id}"})
	public EstudianteUsuarioPersona obtenerEstudianteUsuarioPersona(@PathVariable String id) {
		return this.service.getEstudianteUsuarioPersonaById(id);
	}

	@GetMapping(path = {"/validarPasswdEstudiante/{codEstudiante}/{passwd}"})
	public String validarPasswdEstudiante(@PathVariable String codEstudiante, @PathVariable String passwd) {
		return this.service.validarPasswdEstudiante(codEstudiante, passwd);
	}
	
}
