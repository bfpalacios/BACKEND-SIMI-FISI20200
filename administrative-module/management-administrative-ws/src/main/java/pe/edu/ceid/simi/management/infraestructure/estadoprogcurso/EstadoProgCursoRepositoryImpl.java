package pe.edu.ceid.simi.management.infraestructure.estadoprogcurso;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estadoprogcurso.model.EstadoProgCurso;
import pe.edu.ceid.simi.management.domain.estadoprogcurso.repository.EstadoProgCursoRepository;

@Component
public class EstadoProgCursoRepositoryImpl implements EstadoProgCursoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EstadoProgCursoRowMapper row;

	@Override
	public EstadoProgCurso crearEstadoProgCurso(EstadoProgCurso estadoProgCurso) {
		String insertQuery = "INSERT INTO txestado_progcurso (NOM_ESTADO) values (?)";
		
		int success = this.jdbcTemplate.update(insertQuery, estadoProgCurso.getNomEstado());
		if (success >= 0) {
			return estadoProgCurso;
		}
		
		return null;
	}

	@Override
	public EstadoProgCurso editEstadoProgCurso(EstadoProgCurso estadoProgCurso, int id) {
		String query = "UPDATE txestado_progcurso SET NOM_ESTADO = ? WHERE ID_ESTADO_PROGCURSO = " + id;
		int update = this.jdbcTemplate.update(query, estadoProgCurso.getNomEstado());
		
		if (update == 1) {
			return estadoProgCurso;
		}
		
		return null;
	}

	@Override
	public boolean deleteEstadoProgCurso(int id) {
		String query = "DELETE FROM txestado_progcurso WHERE ID_ESTADO_PROGCURSO = ?";
		int success = this.jdbcTemplate.update(query, id);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<EstadoProgCurso> getEstadoProgCurso() {
		String query = "SELECT * FROM txestado_progcurso";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstadoProgCurso> estado = row.mapRowEstadoProgCurso(rows);
		return estado;
	}

	@Override
	public EstadoProgCurso getEstadoProgCursoById(int id) {
		String query = "SELECT * FROM txestado_progcurso WHERE ID_ESTADO_PROGCURSO  = " + id;
		List<EstadoProgCurso> estado = this.row.mapRowEstadoProgCurso(this.jdbcTemplate.queryForList(query));
		
		if (estado.size() > 0) {
			return estado.get(0);
		}
		
		return null;
	}

}
