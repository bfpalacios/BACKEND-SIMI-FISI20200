package pe.edu.ceid.simi.operative.application.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;
import pe.edu.ceid.simi.operative.domain.authentication.model.User;
import pe.edu.ceid.simi.operative.domain.authentication.repository.AuthenticationRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService{

	@Autowired
	private AuthenticationRepository repository;

	@Override
	public Authentication signInWithEmailAndPassword(String email, String password) {
		return this.repository.signInWithEmailAndPassword(email, password);
	}

	@Override
	public Authentication signInInvited(Authentication auth) {
		if (auth != null) {
			return this.repository.signInInvited(auth);
		}
		return null;
	}

	@Override
	public Authentication findUserByEmail(String email) {
		return this.repository.findUserByEmail(email);
	}

	@Override
	public boolean validarUsuario(Authentication auth) {
		if(auth != null) {
			if (this.repository.findUserByEmail(auth.getEmail()) != null) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

	@Override
	public User signUpWithEmailAndPassword(User user) {
		return this.repository.signUpWithEmailAndPassword(user);
	}

}