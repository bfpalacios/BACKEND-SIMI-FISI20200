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

import pe.edu.ceid.simi.operative.domain.apertura.model.Apertura;
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

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Matricula crearMatricula(Matricula matricula) {
//		String insertQuery = "INSERT INTO tpmatricula (FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_NUM_VOUCHER) values (?, ?, ?)";
//		int success = this.jdbcTemplate.update(insertQuery, matricula.getCodEstudiante(), matricula.getIdProgcurso(),
//				matricula.getNumvouvher(), matricula.getEstadoMat());
//		if (success >= 0) {
//			return matricula;
//		}
//		return null;

		SimpleJdbcCall simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("SP_MATRICULA_INSERT");
		SqlParameterSource in = new MapSqlParameterSource().addValue("P_ID_USUARIO", matricula.getCodEstudiante())
				.addValue("P_PROGCURSO", matricula.getIdProgcurso()).addValue("P_NVOUCHER", matricula.getNumvouvher());
		Map<String, Object> out = simpleJdbcCall.execute(in);
		return matricula;
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

	@Override
	public List<MatriculaDTO> getMatricula() {
		String query = "CALL SP_MATRICULA_LIST";

		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<MatriculaDTO> matriculas = row.mapRowMatricula(rows);
		return matriculas;
	}

	@Override
	public MatriculaDTO getMatriculaById(int id) {
		String query = "CALL USP_MATRICULA_LIST (" + id + ")";

		List<MatriculaDTO> matricula = this.row.mapRowMatricula(this.jdbcTemplate.queryForList(query));
		if (matricula.size() > 0) {
			return matricula.get(0);
		}
		return null;
	}

	@Override
	public List<VoucherDTO> obtenerpagosSinUsar(int codUser) {
		SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName("USP_VOUCHERS_SIN_USAR_LIST");
		Map<String, Object> params = new HashMap<>();
		params.put("P_ID_USUARIO", codUser);

		Map<String, Object> result = jdbcCall.execute(params);
		List<VoucherDTO> vouchers = new ArrayList<>();
		List<LinkedCaseInsensitiveMap> r = (List<LinkedCaseInsensitiveMap>) result.values().toArray()[0];
		r.forEach((v) -> vouchers.add(row.mapRowVoucherSinPagar(v)));
		return vouchers;

	}

}
