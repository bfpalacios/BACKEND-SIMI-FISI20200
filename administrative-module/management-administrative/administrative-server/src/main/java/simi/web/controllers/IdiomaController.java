package simi.web.controllers;
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

import simi.application.idioma.IdiomaService;
import simi.domain.idioma.model.Idioma;

import java.util.List;

@CrossOrigin(origins = "localhost:4200")
@RestController
@RequestMapping({"/api/idioma"})

public class IdiomaController {

	@Autowired
	private IdiomaService service;
	
	@GetMapping(path = {"/listIdiomas"})
	public List<Idioma> getIdiomas() {
		return this.service.getIdiomas();
	}
	
	@PutMapping(path = {"/actualizarIdioma/{id}"})
	public Idioma actualizarMesaById(@RequestBody Idioma idioma, @PathVariable int id) {
		
		idioma.setCidioma(id);
		return this.service.editIdioma(idioma, id);
	}

	@DeleteMapping(path = {"/eliminarIdiomaaById/{id}"})
	public boolean eliminarIdiomaById( @PathVariable int id) {	
			return this.service.deleteIdioma(id);
	}
	
	@PostMapping(path = {"/crearPerfilMesa"})
	public Idioma crearPerfilMesa(@RequestBody Idioma idioma) {
		return this.service.crearIdioma(idioma);
	}
	
//	@GetMapping(path= {"/obtenerPerfilMesa/{id}"})
//	public PerfilMesa obtenerPerfilMesa(@PathVariable int id) {
//		return this.service.getPerfilMesaById(id);
//	}
	
}
