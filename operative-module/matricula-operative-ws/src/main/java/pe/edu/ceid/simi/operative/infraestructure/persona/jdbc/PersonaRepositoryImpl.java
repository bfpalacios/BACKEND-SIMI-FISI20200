package pe.edu.ceid.simi.operative.infraestructure.persona.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessApiUsageException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.persona.model.PersonaUsuario;
import pe.edu.ceid.simi.operative.domain.persona.repository.PersonaRepository;

@Component
public class PersonaRepositoryImpl implements PersonaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PersonaRepositoryRowMapper row;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PersonaUsuario obtenerDatosUsuario(int codUsuario) {
		try {
			SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_DATOS_USUARIO");
			Map<String, Object> params = new HashMap<>();
			params.put("P_ID_USUARIO", codUsuario);
			Map<String, Object> result = jdbcCall.execute(params);
			List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
			return row.mapRowDatosUsuario(r.get(0));
		} catch (InvalidDataAccessApiUsageException e) {
			return null;
		}
		
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public PersonaUsuario obtenerInformacionAcademica(int codUsuario) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_INFORMACION_PERSONAL");
		Map<String, Object> params = new HashMap<>();
		params.put("P_ID_USUARIO", codUsuario);
		Map<String, Object> result = jdbcCall.execute(params);
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		return row.mapRowInfoAcademica(r.get(0));
	}

}
