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

import pe.edu.ceid.simi.management.application.tipocontrato.TipoContratoService;
import pe.edu.ceid.simi.management.domain.tipocontrato.model.TipoContrato;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/programacionDocente/tipocontrato"})
public class TipoContratoController {
	@Autowired
	private TipoContratoService service;
	
	@GetMapping(path = {"/listTipoContrato"})
	public List<TipoContrato> getTipoContrato() {
		return this.service.getTiposContrato();
	}
	
	@PutMapping(path = {"/actualizarTipoContrato/{id}"})
	public TipoContrato actualizarTipoContratoById(@RequestBody TipoContrato tipoContrato,
			@PathVariable int id) {
		tipoContrato.setIdTipoContrato(id);
		return this.service.editTipoContrato(tipoContrato, id);
	}

	@DeleteMapping(path = {"/eliminarTipoContratoById/{id}"})
	public boolean eliminarTipoContratoById(@PathVariable int id) {	
		return this.service.deleteTipoContrato(id);
	}
	
	@PostMapping(path = {"/crearTipoContrato"})
	public TipoContrato crearTipoContrato(@RequestBody TipoContrato tipoContrato) {
		return this.service.crearTipoContrato(tipoContrato);
	}
	
	@GetMapping(path= {"/obtenerTipoContratoById/{id}"})
	public TipoContrato obtenerTipoContrato(@PathVariable int id) {
		return this.service.getTipoContratoById(id);
	}
	
}
