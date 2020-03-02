package pe.edu.ceid.simi.operative.domain.authentication.repository;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;
import pe.edu.ceid.simi.operative.domain.authentication.model.User;

public interface AuthenticationRepository {
	Authentication signInWithEmailAndPassword(String email, String password);
	Authentication findUserByEmail(String email);
	Authentication signInInvited(Authentication auth);
	User signUpWithEmailAndPassword(User user);
}
