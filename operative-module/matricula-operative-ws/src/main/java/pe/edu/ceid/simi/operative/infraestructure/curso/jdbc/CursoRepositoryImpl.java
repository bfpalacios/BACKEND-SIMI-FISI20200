package pe.edu.ceid.simi.operative.infraestructure.curso.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.operative.domain.curso.repository.CursoRepository;

@Component
public class CursoRepositoryImpl implements CursoRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CursoRowMapper row;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<CursoDTO> getCursobyNivel(int idIdioma, int idNivel) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_CURSO_LIST");
		Map<String, Object> params = new HashMap<>();
        params.put("P_ID_IDIOMA", idIdioma);
        params.put("P_ID_NIVEL", idNivel);
		
        Map<String, Object> result = jdbcCall.execute(params);
		 List<CursoDTO> curso= new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> curso.add(row.mapRowCurso(v)));
		return curso;
	}

}
