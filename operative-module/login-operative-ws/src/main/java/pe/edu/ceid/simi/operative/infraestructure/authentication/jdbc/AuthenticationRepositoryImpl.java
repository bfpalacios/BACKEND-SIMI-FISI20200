package pe.edu.ceid.simi.operative.infraestructure.authentication.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;
import pe.edu.ceid.simi.operative.domain.authentication.repository.AuthenticationRepository;

@Component
public class AuthenticationRepositoryImpl implements AuthenticationRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AuthenticationRowMapper row;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Authentication findUserByEmail(String email) {
		System.out.println("findUserByEmail");
		StringBuilder sql = new StringBuilder("SELECT ID_USUARIO, FK_ID_ROL, EMAIL FROM TMUSUARIO ")
				.append("WHERE EMAIL = ? ");
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql.toString(), new Object[] { email });
		System.out.println("queryForList");
		Authentication auth = rows.isEmpty() ? null : row.mapRowFindEmail(rows.get(0));
		if (auth != null) {
			System.out.println("email");
			return auth;
		}
		return null;
	}

	@Override
	public Authentication signInWithEmailAndPassword(String email, String password) {
		Authentication auth = this.findUserByEmail(email);
		if (auth != null) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID_USUARIO, EMAIL, PASSWORD FROM TMUSUARIO ");
			sql.append("WHERE EMAIL = ? AND ID_USUARIO = ? ");
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql.toString(),
					new Object[] { email, auth.getId() });
			Authentication authentication = rows.isEmpty() ? null : row.mapRowAuthentication(rows.get(0));
			if (authentication != null) {
				if (email.equalsIgnoreCase(authentication.getEmail())
						&& this.passwordMatch(password, authentication.getPassword())) {
					authentication.setPassword(password);
					return authentication;
				}
			}
		}
		return null;
	}

	@Override
	public Authentication signInInvited(Authentication auth) {
		System.out.println("signInInvited invitado");
		Authentication authenticated = this.findUserByEmail(auth.getEmail());
		if (authenticated != null) {
			System.out.println("authenticated.getRolId()");
			if(authenticated.getRolId().equals("0")) {
				return authenticated;
			}
		}
		return null;
	}

	public boolean passwordMatch(String password, String passwordHash) {
		return this.passwordEncoder.matches(password, passwordHash);
	}

}