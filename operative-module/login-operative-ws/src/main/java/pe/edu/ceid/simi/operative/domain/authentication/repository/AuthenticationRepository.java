package pe.edu.ceid.simi.operative.domain.authentication.repository;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;

public interface AuthenticationRepository {
	Authentication signInWithEmailAndPassword(String email, String password);
	Authentication findUserByEmail(String email);
	Authentication signInInvited(Authentication auth);
}
