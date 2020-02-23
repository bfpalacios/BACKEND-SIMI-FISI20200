package pe.edu.ceid.simi.management.infraestructure.estudiante.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estudiante.model.Estudiante;
import pe.edu.ceid.simi.management.domain.estudiante.model.EstudianteDTO;
import pe.edu.ceid.simi.management.domain.estudiante.repository.EstudianteRepository;

@Component
public class EstudianteRepositoryImpl implements EstudianteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EstudianteRowMapper row;

	@Override
	public Estudiante crearEstudiante(Estudiante estudiante) {
		String insertQuery = "INSERT INTO tmestudiante "
				+ "(COD_ESTUDIANTE_CI, FK_ID_USUARIO, COD_ESTUDIANTE_ASM, FK_ID_TIPO_ESTUDIANTE) "
				+ "VALUES (?, ?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, estudiante.getCodEstudiante(), estudiante.getIdUsuario(),
				estudiante.getCodEstudianteAsm(), estudiante.getIdTipoEsudiante());
		
		if (success >= 0) {
			return estudiante;
		}
		
		return null;
	}

	@Override
	public Estudiante editEstudiante(Estudiante estudiante, int id) {
		String query = "UPDATE tmestudiante "
				+ "SET FK_ID_USUARIO = ?, COD_ESTUDIANTE_ASM = ?, FK_ID_TIPO_ESTUDIANTE = ? "
				+ "WHERE COD_ESTUDIANTE_CI = "+ id;
		int update = this.jdbcTemplate.update(query, estudiante.getIdUsuario(),
				estudiante.getCodEstudianteAsm(), estudiante.getIdTipoEsudiante());
		
		if (update == 1) {
			return estudiante;
		}
		
		return null;
	}

	@Override
	public boolean deleteEstudiante(int id) {
		String query = "DELETE FROM tmestudiante WHERE COD_ESTUDIANTE_CI = ?";
		int success = this.jdbcTemplate.update(query, id);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<EstudianteDTO> getEstudiantes() {
		String query = "SELECT * FROM tmestudiante AS es " + 
				"INNER JOIN tmusuario AS us ON es.FK_ID_USUARIO = us.ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON us.FK_ID_PERSONA = pe.ID_PERSONA " + 
				"INNER JOIN tmtipo_estudiante AS te ON es.FK_ID_TIPO_ESTUDIANTE = te.ID_TIPO_ESTUDIANTE";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteDTO> estudiante = row.mapRowEstudiante(rows);
		return estudiante;
	}

	@Override
	public EstudianteDTO getEstudianteById(int id) {
		String query = "SELECT * FROM tmestudiante AS es " + 
				"INNER JOIN tmusuario AS us ON es.FK_ID_USUARIO = us.ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON us.FK_ID_PERSONA = pe.ID_PERSONA " + 
				"INNER JOIN tmtipo_estudiante AS te ON es.FK_ID_TIPO_ESTUDIANTE = te.ID_TIPO_ESTUDIANTE " +
				"WHERE COD_ESTUDIANTE_CI = " + id;
		List<EstudianteDTO> estudiante = this.row.mapRowEstudiante(this.jdbcTemplate.queryForList(query));
		
		if (estudiante.size() > 0) {
			return estudiante.get(0);
		}
		
		return null;
	}

}
