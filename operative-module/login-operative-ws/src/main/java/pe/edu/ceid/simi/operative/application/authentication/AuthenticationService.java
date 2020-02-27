package pe.edu.ceid.simi.operative.application.authentication;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;

public interface AuthenticationService {
	Authentication signInWithEmailAndPassword(String email, String password);
	Authentication findUserByEmail(String email);
	Authentication signInInvited(Authentication auth);
}
