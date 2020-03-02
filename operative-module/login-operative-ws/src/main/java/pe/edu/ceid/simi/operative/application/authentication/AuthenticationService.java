package pe.edu.ceid.simi.operative.application.authentication;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;
import pe.edu.ceid.simi.operative.domain.authentication.model.User;

public interface AuthenticationService {
	Authentication signInWithEmailAndPassword(String email, String password);
	Authentication findUserByEmail(String email);
	Authentication signInInvited(Authentication auth);
	boolean validarUsuario(Authentication auth);
	User signUpWithEmailAndPassword(User user);
}
