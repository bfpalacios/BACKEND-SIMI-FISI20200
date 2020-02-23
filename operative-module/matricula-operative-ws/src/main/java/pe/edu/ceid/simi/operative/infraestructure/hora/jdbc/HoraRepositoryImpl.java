package pe.edu.ceid.simi.operative.infraestructure.hora.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.hora.model.HoraDTO;
import pe.edu.ceid.simi.operative.domain.hora.repository.HoraRepository;

@Component
public class HoraRepositoryImpl implements HoraRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private HoraRowMapper row;

	@Override
	public List<HoraDTO> getHora(int id) {
		String query = "SELECT HGH.ID_HORARIO_GRUPOHORARIO, CONCAT(HORA.HORA_INICIO,  ' a ', HORA.HORA_SALIDA)  AS HORA"
		+ " FROM TMHORARIO_GRUPO_HORARIO HGH "
		+ " LEFT JOIN TXHORAS_CLASE HORA ON HGH.FK_ID_HORA = HORA.ID_HORA "
		+ " WHERE FK_ID_GRUPOHORARIO =  " + id;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<HoraDTO> horas = row.mapRowHora(rows);
		return horas;
	}

}
