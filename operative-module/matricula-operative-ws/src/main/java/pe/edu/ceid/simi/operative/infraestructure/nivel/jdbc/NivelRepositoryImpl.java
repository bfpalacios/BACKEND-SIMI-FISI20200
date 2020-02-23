package pe.edu.ceid.simi.operative.infraestructure.nivel.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;
import pe.edu.ceid.simi.operative.domain.nivel.repository.NivelRepository;

@Component
public class NivelRepositoryImpl implements NivelRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NivelRowMapper row;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<NivelDTO> getNivelbyIdioma(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_NIVEL_LIST");
		Map<String, Object> params = new HashMap<>();
        params.put("P_ID_IDIOMA", id);
		
		 Map<String, Object> result = jdbcCall.execute(params);
		 List<NivelDTO> nivel= new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> nivel.add(row.mapRowNivel(v)));
		 return nivel;
	}

}
