package pe.edu.ceid.simi.management.infraestructure.alumnosm;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.alumnosm.model.AlumnoSM;
import pe.edu.ceid.simi.management.domain.alumnosm.repository.AlumnoSMRepository;

@Component
public class AlumnoSMRepositoryImpl implements AlumnoSMRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AlumnoSMRowMapper row;

	@Override
	public List<AlumnoSM> getAlumnoSM() {
		String query = "SELECT * FROM vwmalumnos_sm AS asm "
				+ "INNER JOIN vwestado_asm AS esm ON esm.ID_ESTADO_ASM = asm.FK_ID_ESTADO_ASM";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<AlumnoSM> aulas = row.mapRowAlumnoSM(rows);
		return aulas;
	}

	@Override
	public AlumnoSM getAlumnoSMById(String codAlumnoAsm) {
		String query = "SELECT * FROM vwmalumnos_sm AS asm "
				+ "INNER JOIN vwestado_asm AS esm ON esm.ID_ESTADO_ASM = asm.FK_ID_ESTADO_ASM "
				+ "WHERE asm.CODIGO_ASM = '" + codAlumnoAsm + "'";
		List<AlumnoSM> alumnos = this.row.mapRowAlumnoSM(this.jdbcTemplate.queryForList(query));
		
		if (alumnos.size() > 0) {
			return alumnos.get(0);
		}
		
		return null;
	}

}
