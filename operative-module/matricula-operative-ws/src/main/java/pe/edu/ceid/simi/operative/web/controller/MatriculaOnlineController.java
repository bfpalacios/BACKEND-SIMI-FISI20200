package pe.edu.ceid.simi.operative.web.controller;

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

import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;
import pe.edu.ceid.simi.operative.application.matricula.MatriculaService;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/matriculaOnline"})
public class MatriculaOnlineController {
	@Autowired
	private MatriculaService service;
	
	
	@PutMapping(path = {"/actualizarMatricula/{id}"})
	public Matricula actualizarMatricula(@RequestBody Matricula matricula, @PathVariable int id) {
		
		matricula.setIdMatricula(id);
		return this.service.editMatricula(matricula, id);
	}

	@DeleteMapping(path = {"/eliminarMatriculaById/{id}"})
	public boolean eliminarMatriculaById( @PathVariable int id) {	
		return this.service.deleteMatricula(id);
	}
	
	@PostMapping(path = {"/crearMatricula/{id}"})
	public boolean crearCurso(@RequestBody List<Matricula> matricula, @PathVariable int id) {
		return this.service.crearMatricula(matricula, id);
	}
	
	@GetMapping(path= {"/obtenerMatriculaById/{id}/{estado}"})
	public List<MatriculaDTO> obtenerMatriculaById(@PathVariable int id, @PathVariable int estado) {
		return this.service.getMatriculaById(id, estado);
	}
	
	@GetMapping(path= {"/pagosSinUsar/{id}"})
	public List<VoucherDTO> obtenerpagosSinUsar(@PathVariable("id") int codUser) {
		return this.service.obtenerpagosSinUsar(codUser);
	}
	
	@PostMapping(path = {"/matricularAlumno/{userId}"})
	public boolean crearCurso(@PathVariable int userId, @RequestBody List<ProgramacionDTO> cursosSeleccionados) {
		System.out.println("Programacion CursoId: " + cursosSeleccionados.size());
		for(ProgramacionDTO a : cursosSeleccionados) {
			System.out.println("Programacion CursoId: " + a.getDocente());
		}
		//return this.service.matricularOnline(matricula);
		return true;
	}
}
