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

import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;
import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;
import pe.edu.ceid.simi.operative.application.nota.NotaService;

import java.util.List;

@RestController
@RequestMapping({"/api/v1/administracionNota/nota"})
public class NotaController {
	@Autowired
	private NotaService service;
	
	@GetMapping(path = {"/listNota/{id}"})
	public List<NotaDTO> getNotabyID(@PathVariable int id) {
		return this.service.getNotabyID(id);
	}
	
	@GetMapping(path = {"/listDetalle/{id}"})
	public List<DetalleNota> getDetallebyID(@PathVariable int id) {
		return this.service.getDetallebyID(id);
	}
	
	@PostMapping(path = {"/actualizarPromedio/{id}"})
	public boolean editPromedio(@PathVariable int id) {
		return this.service.editPromedio(id);
	}
	
	@PostMapping(path = {"/crearDetalle"})
	public boolean crearDetalle(@RequestBody List<DetalleNota> detalle) {
		return this.service.crearDetalle(detalle);
	}
	
	@PutMapping(path = {"/actualizarDetalle/{id}"})
	public DetalleNota editDetalle(@RequestBody DetalleNota detalle,  @PathVariable int id) {
		detalle.setIdDetalle(id);
		return this.service.editDetalle(detalle, id);
	}
	
	@DeleteMapping(path = {"/eliminarDetalleById/{id}"})
	public boolean deleteDetalle( @PathVariable int id) {	
		return this.service.deleteDetalle(id);
	}

}
