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

import pe.edu.ceid.simi.management.application.periodoacademico.PeriodoAcademicoService;
import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/periodoacademico"})
public class PeriodoAcademicoController {

	@Autowired
	private PeriodoAcademicoService service;
	
	@GetMapping(path = {"/listPeriodosAcademicos"})
	public List<PeriodoAcademico> getPeriodosAcademicos() {
		return this.service.getPeriodosAcademicos();
	}
	
	@PutMapping(path = {"/actualizarPeriodoAcademico/{id}"})
	public PeriodoAcademico actualizarPeriodoAcademicoById(@RequestBody PeriodoAcademico periodo, @PathVariable int id) {
		
		periodo.setIdPeriodo(id);
		return this.service.editPeriodoAcademico(periodo, id);
	}

	@DeleteMapping(path = {"/eliminarPeriodoAcademicoById/{id}"})
	public boolean eliminarPeriodoAcademicoById(@PathVariable int id) {	
		return this.service.deletePeriodoAcademico(id);
	}
	
	@PostMapping(path = {"/crearPeriodoAcademico"})
	public PeriodoAcademico crearPeriodoAcademico(@RequestBody PeriodoAcademico periodo) {
		return this.service.crearPeriodoAcademico(periodo);
	}
	
	@GetMapping(path= {"/obtenerPeriodoAcademicoById/{id}"})
	public PeriodoAcademico obtenerPeriodoAcademico(@PathVariable int id) {
		return this.service.getPeriodoAcademicoById(id);
	}
	
}
