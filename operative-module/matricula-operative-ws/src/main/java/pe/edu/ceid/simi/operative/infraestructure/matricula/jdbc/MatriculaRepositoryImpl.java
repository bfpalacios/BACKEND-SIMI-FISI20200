package pe.edu.ceid.simi.operative.infraestructure.matricula.jdbc;

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

import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.operative.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.operative.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.operative.domain.matricula.repository.MatriculaRepository;
import pe.edu.ceid.simi.operative.domain.voucher.model.VoucherDTO;

@Component
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private MatriculaRowMapper row;
	private int statusInsert;

	@Override
	public boolean crearMatricula(List<Matricula> matricula, int id) {

		System.out.println("Entrando ->" + matricula.size());
		this.statusInsert = 0;
		String query = "CALL SP_MATRICULA_INSERT (?, ?, ?) ";
		matricula.forEach(m -> {
			this.statusInsert = 
			this.jdbcTemplate.update(query, 
					id, m.getIdProgcurso(), m.getNumvouvher());
		});
		return this.statusInsert == 1 ? true : false;
	}

	@Override
	public Matricula editMatricula(Matricula matricula, int id) {
		String query = "UPDATE tpmatricula  SET FK_COD_ESTUDIANTE_CI = ?, FK_ID_PROGCURSO = ?, FK_NUM_VOUCHER = ?, FK_ID_ESTADO_MATRICULA = ? WHERE ID_MATRICULA = "
				+ id;
		int update = this.jdbcTemplate.update(query, matricula.getCodEstudiante(), matricula.getIdProgcurso(),
				matricula.getNumvouvher(), matricula.getEstadoMat());
		if (update == 1) {
			return matricula;
		}
		return null;
	}

	@Override
	public boolean deleteMatricula(int id) {
		String query = "DELETE FROM tpmatricula WHERE ID_MATRICULA = ?";
		int success = this.jdbcTemplate.update(query, id);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<MatriculaDTO> getMatriculaById(int id, int estado) {
		
		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_MATRICULA_LIST");
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ID_USUARIO", id)
				.addValue("P_ESTADO", estado);
		Map<String, Object> out = simpleJdbcCall.execute(in);
		
		List<MatriculaDTO> matriculas = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) out.values().toArray()[0];
		r.forEach((v) -> matriculas.add(row.mapRowMatricula(v)));
		return matriculas;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<VoucherDTO> obtenerpagosSinUsar(int codUser) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_VOUCHERS_SIN_USAR_LIST");
		Map<String, Object> params = new HashMap<>();
		params.put("P_ID_USUARIO", codUser);

		Map<String, Object> result = jdbcCall.execute(params);
		List<VoucherDTO> vouchers = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> vouchers.add(row.mapRowVoucherSinPagar(v)));
		return vouchers;

	}

	@SuppressWarnings("rawtypes")
	@Override
	public List<VoucherDTO> obtenerpagosRealizados(int codUser) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_VOUCHERS_LIST");
		Map<String, Object> params = new HashMap<>();
		params.put("P_ID_USUARIO", codUser);

		Map<String, Object> result = jdbcCall.execute(params);
		List<VoucherDTO> vouchers = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> vouchers.add(row.mapRowVoucherSinPagar(v)));
		return vouchers;
	}

	@Override
	public List<CursoDTO> getCursosDelAlumno(int codUser) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_MATRICULA_LIST");
		Map<String, Object> params = new HashMap<>();
		params.put("P_ID_USUARIO", codUser);
		params.put("P_ESTADO", 4);

		Map<String, Object> result = jdbcCall.execute(params);
		List<CursoDTO> cursos = new ArrayList<>();
		@SuppressWarnings("unchecked")
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> cursos.add(row.mapRowCursos(v)));
		return cursos;
	}

}
