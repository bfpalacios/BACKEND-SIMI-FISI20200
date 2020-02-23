package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.autenticacion.AutenticacionService;
import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

@RestController
@RequestMapping({"/api/v1/autorizacion"})
public class AutorizacionController {
	
	@Autowired
	private AutenticacionService service;
	
	@GetMapping
	public Autorizacion accederSistema() {
		Autorizacion auth = new Autorizacion("nataly@unmsm.edu.pe", 1, 1, 1);
		return this.service.accederSistema(auth.getEmail(), auth.getCodigo(), auth.getTipo());
	}
}
