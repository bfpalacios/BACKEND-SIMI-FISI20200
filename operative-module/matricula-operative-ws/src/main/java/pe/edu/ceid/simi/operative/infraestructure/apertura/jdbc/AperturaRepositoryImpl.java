package pe.edu.ceid.simi.operative.infraestructure.apertura.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.apertura.model.Apertura;
import pe.edu.ceid.simi.operative.domain.apertura.model.AperturaDTO;
import pe.edu.ceid.simi.operative.domain.apertura.repository.AperturaRepository;

@Component
public class AperturaRepositoryImpl implements AperturaRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private AperturaRowMapper row;
	

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<AperturaDTO> getApertura() {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_SOLICITUD_LIST");

		Map<String, Object> result = jdbcCall.execute();
		List<AperturaDTO> aperturas = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> aperturas.add(row.mapRow(v)));
		return aperturas;
	}
	
	@Override
	public Apertura crearApertura(Apertura apertura) {
		
		String query = "{CALL SP_SOLICITUD_INSERT(?, ?, ?)}";
		int success = this.jdbcTemplate.update(query, apertura.getCodEstudiante(),apertura.getIdCurso(), apertura.getIdHorarioGrupohorario());

		if(success >= 0) {
			return apertura;
		}
		
		return null;
	}

}
