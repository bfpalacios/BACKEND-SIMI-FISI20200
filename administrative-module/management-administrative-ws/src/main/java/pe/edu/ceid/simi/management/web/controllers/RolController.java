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

import pe.edu.ceid.simi.management.application.rol.RolService;
import pe.edu.ceid.simi.management.domain.rol.model.Rol;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/v1/procesomatricula/rol"})
public class RolController {
	
	@Autowired
	private RolService service;
	
	@GetMapping(path = {"/listRoles"})
	public List<Rol> getRoles() {
		return this.service.getRoles();
	}
	
	@PutMapping(path = {"/actualizarRol/{id}"})
	public Rol actualizarRolById(@RequestBody Rol rol, @PathVariable int id) {
		rol.setIdRol(id);
		return this.service.editRol(rol, id);
	}

	@DeleteMapping(path = {"/eliminarRolById/{id}"})
	public boolean eliminarRolById(@PathVariable int id) {	
			return this.service.deleteRol(id);
	}
	
	@PostMapping(path = {"/crearRol"})
	public Rol crearRol(@RequestBody Rol rol) {
		return this.service.crearRol(rol);
	}
	
	@GetMapping(path= {"/obtenerRolById/{id}"})
	public Rol obtenerRol(@PathVariable int id) {
		return this.service.getRolById(id);
	}
	
}
