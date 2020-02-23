package pe.edu.ceid.simi.operative.infraestructure.autenticacion.jdbc;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.autorizacion.model.Autorizacion;
import pe.edu.ceid.simi.operative.domain.autorizacion.repository.AutorizacionRepository;

@Component
public class AutenticacionRepositoryImpl implements AutorizacionRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private AutenticacionRowMapper row;
	 
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Autorizacion buscarCodigo(String email, int codigo, int tipo) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_AUTORIZACION");
		Map<String, Object> params = new HashMap<>();
        params.put("P_EMAIL", email);
        params.put("P_ID_USUARIO", codigo);
        params.put("P_ID_ROL", tipo);
		
		Map<String, Object> result = jdbcCall.execute(params);
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
	    return r.isEmpty() ? null : row.mapRow(r.get(0));
	}
	
	@Override
	public Autorizacion validarParametrosAutorizacion(String email, int codigo, int tipo) {
		Autorizacion autorizacion = this.buscarCodigo(email, codigo, tipo);
		return autorizacion;
	}

}
