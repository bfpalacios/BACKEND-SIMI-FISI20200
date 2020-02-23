package pe.edu.ceid.simi.management.infraestructure.periodoacademico.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.periodoacademico.model.PeriodoAcademico;
import pe.edu.ceid.simi.management.domain.periodoacademico.repository.PeriodoAcademicoRepository;

@Component
public class PeriodoAcademicoRepositoryImpl implements PeriodoAcademicoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PeriodoAcademicoRowMapper row;

	@Override
	public PeriodoAcademico crearPeriodoAcademico(PeriodoAcademico periodo) {
		String insertQuery = "INSERT INTO tmperiodo_academico (NOM_PERIODO, FECHA_INICIO, FECHA_FIN) "
				+ "VALUES (?, ?,?)";
		int success = this.jdbcTemplate.update(insertQuery, periodo.getNomPeriodo(),
				periodo.getFechaInicio(), periodo.getFechaFin());
		
		if (success >= 0) {
			return periodo;
		}
		
		return null;
	}

	@Override
	public PeriodoAcademico editPeriodoAcademico(PeriodoAcademico periodo, int id) {
		String query = "UPDATE tmperiodo_academico SET NOM_PERIODO = ?, FECHA_INICIO = ?, FECHA_FIN = ? "
				+ "WHERE ID_PERIODO = " + id;
		int update = this.jdbcTemplate.update(query, periodo.getNomPeriodo(),
				periodo.getFechaInicio(), periodo.getFechaFin());
		
		if (update == 1) {
			return periodo;
		}
		
		return null;
	}

	@Override
	public List<PeriodoAcademico> getPeriodosAcademicos() {
		String query = "SELECT * FROM tmperiodo_academico";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<PeriodoAcademico> periodo = row.mapRowPeriodoAcademico(rows);
		return periodo;
	}

	@Override
	public boolean deletePeriodoAcademico(int cperiodo) {
		String query = "DELETE FROM tmperiodo_academico WHERE ID_PERIODO = ?";
		int success = this.jdbcTemplate.update(query, cperiodo);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public PeriodoAcademico getPeriodoAcademicoById(int id) {
		String query ="SELECT * FROM tmperiodo_academico WHERE ID_PERIODO = " + id;
		List<PeriodoAcademico> periodo = this.row.mapRowPeriodoAcademico(this.jdbcTemplate.queryForList(query));
		
		if (periodo.size() > 0) {
			return periodo.get(0);
		}
	
		return null;
	}

}
