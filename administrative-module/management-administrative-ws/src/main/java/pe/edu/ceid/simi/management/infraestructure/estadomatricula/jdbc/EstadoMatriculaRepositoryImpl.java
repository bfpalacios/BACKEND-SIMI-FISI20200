package pe.edu.ceid.simi.management.infraestructure.estadomatricula.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;
import pe.edu.ceid.simi.management.domain.estadomatricula.repository.EstadoMatriculaRepository;

@Component
public class EstadoMatriculaRepositoryImpl implements EstadoMatriculaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EstadoMatriculaRowMapper row;

	@Override
	public List<EstadoMatricula> getEstadoMatricula() {
		String query = "SELECT * FROM txestado_matricula";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstadoMatricula> estados = row.mapRowEstadoMatricula(rows);
		return estados;
	}

	@Override
	public EstadoMatricula getEstadoMatriculaById(String idEstadoMatricula) {
		String query = "SELECT * FROM txestado_matricula WHERE ID_ESTADO_MATRICULA = '" + idEstadoMatricula + "'";
		List<EstadoMatricula> estados = this.row.mapRowEstadoMatricula(this.jdbcTemplate.queryForList(query));
		
		if (estados.size() > 0) {
			return estados.get(0);
		}
		
		return null;
	}

}
