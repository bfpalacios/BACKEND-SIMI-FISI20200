package pe.edu.ceid.simi.operative.infraestructure.apertura.jdbc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
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

	private String mensaje;

	private int grupo;

	private int curso;

	private String  id;
	
	Map<String, Object> inParams = new HashMap<>();

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
	public List<AperturaDTO> getAperturabyID(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_SOLICITUD_LIST");
		inParams.put("P_ID_USUARIO", id);
		
		Map<String, Object> result = jdbcCall.execute(inParams);
		List<AperturaDTO> aperturas = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> aperturas.add(row.mapRow(v)));
		return aperturas;
	}

	@Override
	public Apertura crearApertura(Apertura apertura) {

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_SOLICITUD_INSERT");
		
		inParams.put("P_ID_USUARIO", apertura.getCodEstudiante());
		inParams.put("P_ID_CURSO", apertura.getIdCurso());
		inParams.put("P_ID_GRUPO", apertura.getIdHorarioGrupohorario());

//		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ID_USUARIO", apertura.getCodEstudiante())
//				.addValue("P_ID_CURSO", apertura.getIdCurso())
//				.addValue("P_ID_GRUPO", apertura.getIdHorarioGrupohorario());

		Map<String, Object> out = simpleJdbcCall.execute(inParams);
		
		Apertura solicitud = new Apertura();
		
		solicitud.setCodEstudiante(apertura.getCodEstudiante());
		solicitud.setIdCurso(apertura.getIdCurso());
		solicitud.setIdHorarioGrupohorario(apertura.getIdHorarioGrupohorario());
		solicitud.setMensaje((String) out.get("P_MENSAJE"));
		System.out.println((String)out.get("P_MENSAJE"));
		return solicitud;

	}

}
