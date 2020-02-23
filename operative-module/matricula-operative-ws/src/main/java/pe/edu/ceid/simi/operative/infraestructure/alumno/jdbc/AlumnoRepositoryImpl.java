package pe.edu.ceid.simi.operative.infraestructure.alumno.jdbc;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pe.edu.ceid.simi.operative.domain.alumno.model.AlumnoDTO;
import pe.edu.ceid.simi.operative.domain.alumno.repository.AlumnoRepository;

@Component
public class AlumnoRepositoryImpl implements AlumnoRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AlumnoRowMapper row;
	
	@Override
	public AlumnoDTO getAlumnoById(int id) {
		String query = "CALL USP_ALUMNO_LIST ("+id+")";
		
		List<AlumnoDTO> alumno = this.row.mapRowAlumno(this.jdbcTemplate.queryForList(query));
		if (alumno.size() > 0) {
			return alumno.get(0);
		}
		return null;
	}

}
