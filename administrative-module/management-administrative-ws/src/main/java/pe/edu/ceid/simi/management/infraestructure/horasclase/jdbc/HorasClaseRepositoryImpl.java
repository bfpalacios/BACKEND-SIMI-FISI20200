package pe.edu.ceid.simi.management.infraestructure.horasclase.jdbc;

import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.horasclase.model.HorasClase;
import pe.edu.ceid.simi.management.domain.horasclase.repository.HorasClaseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


@Component
public class HorasClaseRepositoryImpl implements HorasClaseRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private HorasClaseRowMapper row;

	@Override
	public HorasClase crearHorasClase(HorasClase horasClase) {
		String insertQuery = "INSERT INTO txhoras_clase (HORA_INICIO, HORA_SALIDA) values (?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, horasClase.getHoraInicio(), horasClase.getHoraSalida() );
		if (success >= 0) {
			return horasClase;
		}
		return null;
	}

	@Override
	public HorasClase editHorasClase(HorasClase horasClase, int id) {
		String query = "UPDATE txhoras_clase SET HORA_INICIO = ?, HORA_SALIDA = ? WHERE ID_HORA = "+ id;
		int update = this.jdbcTemplate.update(query, horasClase.getHoraInicio(), horasClase.getHoraSalida());
		if (update == 1) {
			return horasClase;
		}
		return null;
	}

	@Override
	public boolean deleteHorasClase(int chora) {
		String query = "DELETE FROM txhoras_clase WHERE ID_HORA = ?";
		int success = this.jdbcTemplate.update(query, chora);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<HorasClase> getHorasClase() {
		String query = "SELECT * FROM txhoras_clase";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<HorasClase> horas = row.mapRowHorasClase(rows);
		return horas;
		
	}

	@Override
	public HorasClase getHorasClaseById(int id) {
		String query = "SELECT * FROM txhoras_clase WHERE ID_HORA = " + id;
		List<HorasClase> horas = this.row.mapRowHorasClase(this.jdbcTemplate.queryForList(query));
		if (horas.size() > 0) {
			return horas.get(0);
		}
		return null;
	}

}
