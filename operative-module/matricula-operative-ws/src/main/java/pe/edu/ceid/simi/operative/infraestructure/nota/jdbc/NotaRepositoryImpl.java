package pe.edu.ceid.simi.operative.infraestructure.nota.jdbc;

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

import pe.edu.ceid.simi.operative.domain.detalleNota.model.DetalleNota;
import pe.edu.ceid.simi.operative.domain.nota.model.NotaDTO;
import pe.edu.ceid.simi.operative.domain.nota.repository.NotaRepository;

@Component
public class NotaRepositoryImpl implements NotaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NotaRowMapper row;
	
	Map<String, Object> inParams = new HashMap<>();
	
	private int statusInsert;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<NotaDTO> getNotabyID(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_HISTORIAL_LIST");
		inParams.put("P_ID_USUARIO", id);
		
		Map<String, Object> result = jdbcCall.execute(inParams);
		List<NotaDTO> notas = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> notas.add(row.mapRow(v)));
		return notas;
	}
	
	// Métodos para docente

	@Override
	public boolean crearDetalle(List<DetalleNota> detalle) {
		System.out.println("Entrando ->" + detalle.size());
		this.statusInsert = 0;
		String query = "INSERT INTO TPDETALLE_NOTA " +
				" (FK_ID_NOTA, NOTA_DESC, PORCENTAJE, NOTA)" +
				" VALUES (?, ?, ?, ?)";
		detalle.forEach(d -> {
			System.out.println("Entrando -> " + d.getIdNota());
			this.statusInsert = 
			this.jdbcTemplate.update(query, 
					d.getIdNota(), d.getDescripcion(), d.getPorcentaje(), d.getNota());
		});
		return this.statusInsert == 1 ? true : false;
	}

	@Override
	public DetalleNota editDetalle(DetalleNota detalle, int id) {
		String query = "UPDATE TPDETALLE_NOTA  SET NOTA_DESC = ?, PORCENTAJE = ?, NOTA = ? WHERE ID_DETALLE_NOTA = "
				+ id;
		int update = this.jdbcTemplate.update(query, detalle.getDescripcion(), detalle.getPorcentaje(), detalle.getNota());
		if (update == 1) {
			return detalle;
		}
		return null;
	}

	@Override
	public boolean deleteDetalle(int id) {
		String query = "DELETE FROM TPDETALLE_NOTA WHERE ID_DETALLE_NOTA = ?";
		int success = this.jdbcTemplate.update(query, id);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<DetalleNota> getDetallebyID(int id) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_HISTORIAL_DETALLE_LIST");
		inParams.put("P_ID_NOTA", id);
		
		Map<String, Object> result = jdbcCall.execute(inParams);
		List<DetalleNota> detalles = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> detalles.add(row.DetallemapRow(v)));
		return detalles;
	}

	@Override
	public boolean editPromedio(int id) {
		
		try {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_HISTORIAL_UPDATE");
		inParams.put("P_ID_NOTA", id);
		
		Map<String, Object> result = jdbcCall.execute(inParams);
		return true;
		}catch (Exception e) {
			e.printStackTrace();
			//System.out.print(e);
			return false;
		}
	}

}
