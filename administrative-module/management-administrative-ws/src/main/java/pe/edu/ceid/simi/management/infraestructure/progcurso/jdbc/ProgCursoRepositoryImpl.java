package pe.edu.ceid.simi.management.infraestructure.progcurso.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;
import pe.edu.ceid.simi.management.domain.progcurso.repository.ProgCursoRepository;

@Component
public class ProgCursoRepositoryImpl implements ProgCursoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProgCursoRowMapper row;

	@Override
	public ProgCurso crearProgCurso(ProgCurso progCurso) {
		String insertQuery = "INSERT INTO tpprog_curso "
				+ "(FK_ID_PROG_DOC_CUR, FK_ID_AULA, FK_ID_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) "
				+ "VALUES (?, ?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, progCurso.getIdProgDocCur(),
				progCurso.getIdAula(), progCurso.getIdGrupoHorario(), progCurso.getIdEstadoProgCurso());
		
		if (success >= 0) {
			return progCurso;
		}
		
		return null;
	}

	@Override
	public ProgCurso editProgCurso(ProgCurso progCurso, int id) {
		String query = "UPDATE tpprog_curso SET FK_ID_PROG_DOC_CUR = ?, FK_ID_AULA = ? , FK_ID_GRUPOHORARIO = ?,"
				+ " FK_ID_ESTADO_PROGCURSO = ? WHERE ID_PROGCURSO = " + id;
		int update = this.jdbcTemplate.update(query, progCurso.getIdProgDocCur(),
				progCurso.getIdAula(), progCurso.getIdGrupoHorario(), progCurso.getIdEstadoProgCurso());
		
		if (update == 1) {
			return progCurso;
		}
		
		return null;
	}

	@Override
	public boolean deleteProgCurso(int id) {
		String query = "DELETE FROM tpprog_curso WHERE ID_PROGCURSO = ?";
		int success = this.jdbcTemplate.update(query, id);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<ProgCursoDTO> getProgCursos() {
		String query = "SELECT * FROM tpprog_curso AS pc " + 
				"INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR " + 
					"INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE " + 
						"INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO " + 
							"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
					"INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO " + 
						"INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL " + 
						"INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA " + 
					"INNER JOIN tmperiodo_academico AS pa ON pe.ID_PERIODO = pdc.FK_ID_PERIODO" +
				"INNER JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA " +
					"INNER JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE " +
				"INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = pc.FK_ID_GRUPOHORARIO " +
				"INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public ProgCursoDTO getProgCursoById(int id) {
		String query = "SELECT * FROM tpprog_curso AS pc " + 
				"INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR " + 
					"INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE " + 
						"INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO " + 
							"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
					"INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO " + 
						"INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL " + 
						"INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA " + 
					"INNER JOIN tmperiodo_academico AS pa ON pe.ID_PERIODO = pdc.FK_ID_PERIODO" +
				"INNER JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA " +
					"INNER JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE " +
				"INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = pc.FK_ID_GRUPOHORARIO " +
				"INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO " +
				"WHERE ID_PROGCURSO  = " + id;
		List<ProgCursoDTO> progs = this.row.mapRowProgCurso(this.jdbcTemplate.queryForList(query));
		
		if (progs.size() > 0) {
			return progs.get(0);
		}
		
		return null;
	}

}
