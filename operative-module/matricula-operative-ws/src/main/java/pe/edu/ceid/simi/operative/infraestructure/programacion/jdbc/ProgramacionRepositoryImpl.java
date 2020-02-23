package pe.edu.ceid.simi.operative.infraestructure.programacion.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;
import pe.edu.ceid.simi.operative.domain.programacion.repository.ProgramacionRepository;

@Component
public class ProgramacionRepositoryImpl implements ProgramacionRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProgramacionRowMapper row;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<ProgramacionDTO> getProgramacion() {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_PROGRAMACION_LIST");
		
	
		Map<String, Object> result = jdbcCall.execute();
		 List<ProgramacionDTO> programacion = new ArrayList<>();
		 List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		 r.forEach((v) -> programacion.add(row.mapRowProgramacion(v)));
		return programacion;
	}
}
