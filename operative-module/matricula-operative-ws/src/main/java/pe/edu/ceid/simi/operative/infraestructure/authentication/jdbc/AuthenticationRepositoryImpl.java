package pe.edu.ceid.simi.operative.infraestructure.authentication.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.authentication.model.Authentication;
import pe.edu.ceid.simi.operative.domain.authentication.model.User;
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
		StringBuilder sql = new StringBuilder("SELECT ID_USUARIO, EMAIL FROM TMUSUARIO ")
				.append("WHERE EMAIL = ? ");
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql.toString(), new Object[] { email });
		Authentication auth = rows.isEmpty() ? null : row.mapRowFindEmail(rows.get(0));
		if (auth != null) {
			return auth;
		}
		return null;
	}

	@Override
	public Authentication signInWithEmailAndPassword(String email, String password) {
		Authentication auth = this.findUserByEmail(email);
		if (auth != null) {
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT ID_USUARIO, FK_ID_ROL, EMAIL, PASSWORD FROM TMUSUARIO ");
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
		Authentication authenticated = this.findUserByEmail(auth.getEmail());
		if (authenticated != null) {
			if(authenticated.getRolId().equals("0")) {
				return authenticated;
			}
		}
		return null;
	}

	public boolean passwordMatch(String password, String passwordHash) {
		return this.passwordEncoder.matches(password, passwordHash);
	}

	@Override
	public User signUpWithEmailAndPassword(User user) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_EST_USU_PER_INSERT");
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("nombre", user.getNames());
        params.put("apellidoPat", user.getLastNameP());
        params.put("apellidoMat", user.getLastNameM());
        params.put("dni", user.getDocNumber());
        params.put("genero", "1");
        params.put("edad", "22");
        params.put("university", " - ");
        params.put("lugarNacDist", " - ");
        params.put("lugarNacProv", " - ");
        params.put("lugarNacDep", " - ");
        params.put("nacionalidad", " - ");
        params.put("address", " - ");
        params.put("phone", " - ");
        params.put("fechaNac", "2020-02-02");
        params.put("email", user.getEmail());
        params.put("passwd", this.passwordEncoder.encode(user.getPassword()));
        params.put("estado", "1");
        params.put("idTipoEstudiante", "1");
		
		Map<String, Object> result = jdbcCall.execute(params);
		return null;
	}

}