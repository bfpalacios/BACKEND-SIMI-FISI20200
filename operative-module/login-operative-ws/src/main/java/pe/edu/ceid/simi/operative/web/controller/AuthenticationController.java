package pe.edu.ceid.simi.operative.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.ceid.simi.operative.application.authentication.AuthenticationService;
import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;

@RestController
@RequestMapping({ "/api/v1/authentication" })
public class AuthenticationController {

	@Autowired
	private AuthenticationService service;

	@PostMapping(path = {"withEmailAndPassword"})
	public Authentication signInWithEmailAndPassword(@RequestBody Authentication auth) {
		return this.service.signInWithEmailAndPassword(auth.getEmail(), auth.getPassword());
	}
	
	@GetMapping(path = {"/findUserByEmail/{email:.+}"})
	public Authentication buscarUsuarioSiExiste(@PathVariable String email) {
		return this.service.findUserByEmail(email);
	}
	
	@PostMapping(path = {"/signInLikeInvited"})
	public Authentication signInInvited(@RequestBody Authentication auth) {
		return this.service.signInInvited(auth);
	}
	
	@PostMapping(path = {"/signUpWithEmailAndPassword"})
	public Authentication signUpWithEmailAndPassword(@RequestBody Authentication auth) {
		return this.service.signInInvited(auth);
	}
}
