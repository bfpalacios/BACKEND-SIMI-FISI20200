package pe.edu.ceid.simi.management.infraestructure.sede.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.sede.model.Sede;
import pe.edu.ceid.simi.management.domain.sede.repository.SedeRepository;


@Component
public class SedeRepositoryImpl implements SedeRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private SedeRowMapper row;

	@Override
	public Sede crearSede(Sede sede) {
		String insertQuery = "INSERT INTO tmsede (NOM_SEDE, DESC_SEDE, DIR_SEDE) values (?, ?, ?)";
		
		int success = this.jdbcTemplate.update(insertQuery, sede.getNomSede(), sede.getDescSede(), sede.getDirSede());
		if (success >= 0) {
			return sede;
		}
		
		return null;
	}

	@Override
	public Sede editSede(Sede sede, int id) {
		String query = "UPDATE tmsede SET NOM_SEDE = ?, DESC_SEDE = ?, DIR_SEDE = ? WHERE ID_SEDE = "+ id;
		int update = this.jdbcTemplate.update(query, sede.getNomSede(), sede.getDescSede(), sede.getDirSede());
		
		if (update == 1) {
			return sede;
		}
		
		return null;
	}

	@Override
	public List<Sede> getSedes() {
		String query = "SELECT * FROM tmsede";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Sede> sede = row.mapRowSede(rows);
		return sede;
	}

	@Override
	public boolean deleteSede(int csede) {
		String query = "DELETE FROM tmsede WHERE ID_SEDE = ?";
		int success = this.jdbcTemplate.update(query, csede);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public Sede getSedeById(int id) {
		String query = "SELECT * FROM tmsede WHERE ID_SEDE  = " + id;
		List<Sede> sede = this.row.mapRowSede(this.jdbcTemplate.queryForList(query));
		
		if (sede.size() > 0) {
			return sede.get(0);
		}
		
		return null;
	}
}
