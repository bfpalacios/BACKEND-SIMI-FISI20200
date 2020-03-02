package pe.edu.ceid.simi.operative.infraestructure.authentication.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
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
			sql.append("WHERE EMAIL = ? AND ID_USUARIO = ? AND PASSWORD = md5(?) ");
			List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql.toString(),
					new Object[] { email, auth.getId(), password });
			Authentication authentication = rows.isEmpty() ? null : row.mapRowAuthentication(rows.get(0));
			if (authentication != null) {
					authentication.setPassword(password);
					return authentication;
			
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


	@Override
	public boolean signUpWithEmailAndPassword(User user) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_EST_USU_PER_INSERT");
		Map<String, Object> params = new HashMap<String, Object>();
        params.put("nombre", user.getNames());
        params.put("apellidoPat", user.getLastNameP());
        params.put("apellidoMat", user.getLastNameM());
        params.put("dni", user.getDocNumber());
        params.put("genero", user.getGenero());
        params.put("edad", "20");
        params.put("university", user.getUniversity());
        params.put("lugarNacDist", user.getLugarNacDist());
        params.put("lugarNacProv", user.getLugarNacProv());
        params.put("lugarNacDep", user.getLugarNacDep());
        params.put("nacionalidad", user.getNacionalidad());
        params.put("address", user.getAddress());
        params.put("phone", user.getPhone());
        params.put("fechaNac", user.getBirthday());
        params.put("email", user.getEmail());
        params.put("passwd", user.getPassword());
        params.put("estado", "1");
        params.put("idTipoEstudiante", "1");
		
		Map<String, Object> result = jdbcCall.execute(params);
		if (result.size() > 0) {
			return true;
		}
		return false;
	}

}