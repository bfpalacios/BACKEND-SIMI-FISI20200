package pe.edu.ceid.simi.management.infraestructure.tipoestudiante.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;
import pe.edu.ceid.simi.management.domain.tipoestudiante.repository.TipoEstudianteRepository;

@Component
public class TipoEstudianteRepositoryImpl implements TipoEstudianteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private TipoEstudianteRowMapper row;

	@Override
	public TipoEstudiante crearTipoEstudiante(TipoEstudiante tipoEstudiante) {
		String insertQuery = "INSERT INTO tmtipo_estudiante (NOM_TIPO_ESTUDIANTE) VALUES (?)";
		int success = this.jdbcTemplate.update(insertQuery, tipoEstudiante.getNomTipoEstudiante());
		
		if (success >= 0) {
			return tipoEstudiante;
		}
		
		return null;
	}

	@Override
	public TipoEstudiante editTipoEstudiante(TipoEstudiante tipoEstudiante, int id) {
		String query = "UPDATE tmtipo_estudiante SET NOM_TIPO_ESTUDIANTE = ? WHERE ID_TIPO_ESTUDIANTE = "+ id;
		int update = this.jdbcTemplate.update(query, tipoEstudiante.getNomTipoEstudiante());
		
		if (update == 1) {
			return tipoEstudiante;
		}
		
		return null;
	}

	@Override
	public boolean deleteTipoEstudiante(int ctipoEstudiante) {
		String query = "DELETE FROM tmtipo_estudiante WHERE ID_TIPO_ESTUDIANTE = ?";
		int success = this.jdbcTemplate.update(query, ctipoEstudiante);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<TipoEstudiante> getTiposEstudiante() {
		String query = "SELECT * FROM tmtipo_estudiante";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<TipoEstudiante> tipoEstudiante = row.mapRowTipoEstudiante(rows);
		return tipoEstudiante;
	}

	@Override
	public TipoEstudiante getTipoEstudianteById(int id) {
		String query = "SELECT * FROM tmtipo_estudiante WHERE ID_TIPO_ESTUDIANTE  = " + id;
		List<TipoEstudiante> tipoEstudiante = this.row.mapRowTipoEstudiante(this.jdbcTemplate.queryForList(query));
		
		if (tipoEstudiante.size() > 0) {
			return tipoEstudiante.get(0);
		}
		
		return null;
	}

}
