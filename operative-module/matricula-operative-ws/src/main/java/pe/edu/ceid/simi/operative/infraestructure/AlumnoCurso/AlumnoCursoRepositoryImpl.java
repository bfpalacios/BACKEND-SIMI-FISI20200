package pe.edu.ceid.simi.operative.infraestructure.AlumnoCurso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;
import pe.edu.ceid.simi.operative.domain.alumnoCurso.repository.AlumnoCursoRepository;

@Component
public class AlumnoCursoRepositoryImpl implements AlumnoCursoRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AlumnoCursoRowMapper row;
	
	@Override
	public List<AlumnoCurso> getAlumdoByCurso(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_ALUMNO_CURSO_LIST");
		Map<String, Object> params = new HashMap<>();
        params.put("P_ID_PROG", id);
		
		 Map<String, Object> result = jdbcCall.execute(params);
		 List<AlumnoCurso> alumno = new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> alumno.add(row.mapRowAlumno(v)));
		 return alumno;
	}

}
