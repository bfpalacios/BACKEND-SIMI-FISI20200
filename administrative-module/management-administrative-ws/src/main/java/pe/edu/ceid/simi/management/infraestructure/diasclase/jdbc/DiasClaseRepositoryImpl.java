	package pe.edu.ceid.simi.management.infraestructure.diasclase.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.diasclase.model.DiasClase;
import pe.edu.ceid.simi.management.domain.diasclase.repository.DiasClaseRepository;

@Component
public class DiasClaseRepositoryImpl implements DiasClaseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DiasClaseRowMapper row;

	@Override
	public DiasClase crearDiasClase(DiasClase diasClase) {
		String insertQuery = "INSERT INTO txdias_clase (NOM_DIA) values (?)";
		int success = this.jdbcTemplate.update(insertQuery, diasClase.getNomDia());
		if (success >= 0) {
			return diasClase;
		}
		return null;
	}

	@Override
	public DiasClase editDiasClase(DiasClase diasClase, int id) {
		String query = "UPDATE txdias_clase SET NOM_DIA = ? WHERE ID_DIA = "+ id;
		int update = this.jdbcTemplate.update(query,diasClase.getNomDia());
		if (update == 1) {
			return diasClase;
		}
		return null;
	}

	@Override
	public boolean deleteDiasClase(int cdia) {
		String query = "DELETE FROM txdias_clase WHERE ID_DIA = ?";
		int success = this.jdbcTemplate.update(query, cdia);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<DiasClase> getDiasClase() {
		String query = "SELECT * FROM txdias_clase";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DiasClase> dias = row.mapRowDiasClase(rows);
		return dias;
		
	}

	@Override
	public DiasClase getDiasClaseById(int id) {
		String query = "SELECT * FROM txdias_clase WHERE ID_DIA = " + id;
		List<DiasClase> dias = this.row.mapRowDiasClase(this.jdbcTemplate.queryForList(query));
		if (dias.size() > 0) {
			return dias.get(0);
		}
		return null;
	}

}
