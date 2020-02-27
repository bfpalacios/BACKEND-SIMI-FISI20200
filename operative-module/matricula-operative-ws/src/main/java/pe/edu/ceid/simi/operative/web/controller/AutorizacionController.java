package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.autenticacion.AutenticacionService;
import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;

@RestController
@RequestMapping({"/api/v1/autorizacion"})
public class AutorizacionController {
	
	@Autowired
	private AutenticacionService service;
	
	@PostMapping
	public Autorizacion accederSistema(@RequestBody Autorizacion auth) {
		return this.service.accederSistema(auth.getEmail(), auth.getCodigo(), auth.getTipo());
	}
}
