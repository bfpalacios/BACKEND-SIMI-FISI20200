package pe.edu.ceid.simi.operative.infraestructure.DocenteCurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;
import pe.edu.ceid.simi.operative.domain.DocenteCurso.repository.DocenteCursoRepository;


@Component
public class DocenteCursoRepositoryImpl implements DocenteCursoRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DocenteCursoRowMapper row;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<DocenteCurso> listCursoByDocente(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_DOCENTE_CURSO_LIST");
		Map<String, Object> params = new HashMap<>();
        params.put("P_ID_USUARIO", id);
		
		 Map<String, Object> result = jdbcCall.execute(params);
		 List<DocenteCurso> docente = new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> docente.add(row.mapRowDocente(v)));
		 return docente;
	}
	
	

}
