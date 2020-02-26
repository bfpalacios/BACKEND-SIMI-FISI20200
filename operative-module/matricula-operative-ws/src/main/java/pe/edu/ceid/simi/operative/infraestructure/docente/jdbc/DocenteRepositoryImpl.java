package pe.edu.ceid.simi.operative.infraestructure.docente.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.operative.domain.docente.model.DocenteDTO;
import pe.edu.ceid.simi.operative.domain.docente.repository.DocenteRepository;

@Component
public class DocenteRepositoryImpl implements DocenteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DocenteRowMapper row;


	@Override
	public List<DocenteDTO> getDocente() {
		String query = "SELECT DOC.COD_DOCENTE_CI, DOC.FK_ID_USUARIO, PER.NOMBRE, PER.APELLIDO_PAT, PER.APELLIDO_MAT, DOC.DEPARTAMENTO "
				+ "FROM TMDOCENTE DOC "
				+ "LEFT JOIN TMUSUARIO US ON DOC.FK_ID_USUARIO = US.ID_USUARIO "
				+ "LEFT JOIN TMPERSONA PER ON US.FK_ID_PERSONA = PER.ID_PERSONA";

		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DocenteDTO> docente = row.mapRowDocente(rows);
		return docente;
	}

}
