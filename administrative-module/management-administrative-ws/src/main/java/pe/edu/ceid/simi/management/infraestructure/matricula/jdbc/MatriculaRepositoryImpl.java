package pe.edu.ceid.simi.management.infraestructure.matricula.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.matricula.model.Matricula;
import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.management.domain.matricula.repository.MatriculaRepository;


@Component
public class MatriculaRepositoryImpl implements MatriculaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private MatriculaRowMapper row;

	@Override
	public Matricula crearMatricula(Matricula matricula) {
		String insertQuery = "INSERT INTO tpmatricula (ID_MATRICULA, FK_COD_ESTUDIANTE_CI, FK_ID_PROGCURSO, FK_NUM_VOUCHER, "
				+ "FK_ID_ESTADO_MATRICULA) VALUES (?, ?, ?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, matricula.getIdMatricula(), matricula.getCodEstudiante(),
				matricula.getIdProgCurso(), matricula.getNumVoucher(), matricula.getIdEstadoMatricula());
		
		if (success >= 0) {
			return matricula;
		}
		
		return null;
	}

	@Override
	public Matricula editMatricula(Matricula matricula, int id) {
		String query = "UPDATE tpmatricula SET ID_MATRICULA = ?, FK_COD_ESTUDIANTE_CI = ?, FK_ID_PROGCURSO = ?, "
				+ "FK_NUM_VOUCHER = ?, FK_ID_ESTADO_MATRICULA = ? WHERE ID_CURSO = "+ id;
		int update = this.jdbcTemplate.update(query, matricula.getIdMatricula(), matricula.getCodEstudiante(),
				matricula.getIdProgCurso(), matricula.getNumVoucher(), matricula.getIdEstadoMatricula());
		
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
	public List<MatriculaDTO> getMatriculas() {
		String query = "SELECT * FROM tpmatricula AS ma\r\n" + 
				"	INNER JOIN tmestudiante AS es ON es.COD_ESTUDIANTE_CI = ma.FK_COD_ESTUDIANTE_CI\r\n" + 
				"		INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = es.FK_ID_USUARIO\r\n" + 
				"			INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"	INNER JOIN tpprog_curso AS pc ON pc.ID_PROGCURSO = ma.FK_ID_PROGCURSO\r\n" + 
				"		INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"			INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"				INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"					INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"			INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"				INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL\r\n" + 
				"				INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA\r\n" + 
				"			INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"		INNER JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				"			INNER JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = pc.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"    INNER JOIN tmvoucher as vo ON vo.NUM_VOUCHER = ma.FK_NUM_VOUCHER\r\n" + 
				"    INNER JOIN txestado_matricula as em ON em.ID_ESTADO_MATRICULA = ma.FK_ID_ESTADO_MATRICULA";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<MatriculaDTO> cursos = row.mapRowMatricula(rows);
		return cursos;
	}

	@Override
	public MatriculaDTO getMatriculaById(int id) {
		String query = "SELECT * FROM tpmatricula AS ma\r\n" + 
				"	INNER JOIN tmestudiante AS es ON es.COD_ESTUDIANTE_CI = ma.FK_COD_ESTUDIANTE_CI\r\n" + 
				"		INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = es.FK_ID_USUARIO\r\n" + 
				"			INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"	INNER JOIN tpprog_curso AS pc ON pc.ID_PROGCURSO = ma.FK_ID_PROGCURSO\r\n" + 
				"		INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"			INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"				INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"					INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"			INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"				INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL\r\n" + 
				"				INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA\r\n" + 
				"			INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"		INNER JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				"			INNER JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = pc.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"    INNER JOIN tmvoucher as vo ON vo.NUM_VOUCHER = ma.FK_NUM_VOUCHER\r\n" + 
				"    INNER JOIN txestado_matricula as em ON em.ID_ESTADO_MATRICULA = ma.FK_ID_ESTADO_MATRICULA "
				+ "WHERE ID_MATRICULA = " + id;
		List<MatriculaDTO> curso = this.row.mapRowMatricula(this.jdbcTemplate.queryForList(query));
		
		if (curso.size() > 0) {
			return curso.get(0);
		}
		
		return null;
	}

}