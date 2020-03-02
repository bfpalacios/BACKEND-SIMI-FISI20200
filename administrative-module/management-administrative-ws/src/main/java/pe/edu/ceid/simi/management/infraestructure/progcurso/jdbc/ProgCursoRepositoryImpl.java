package pe.edu.ceid.simi.management.infraestructure.progcurso.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;
import pe.edu.ceid.simi.management.domain.progcurso.repository.ProgCursoRepository;
import pe.edu.ceid.simi.management.infraestructure.progdoccurso.jdbc.ProgDocCursoRepositoryImpl;

@Component
public class ProgCursoRepositoryImpl implements ProgCursoRepository {
	ProgDocCursoRepositoryImpl  progDocenteri ; 
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProgCursoRowMapper row;

	@Override
	public String crearProgCurso(ProgCurso progCurso) {
		try {
			String insertQuery = "INSERT INTO tpprog_curso "
					+ "(FK_ID_PROG_DOC_CUR, FK_ID_AULA, FK_ID_HORARIO_GRUPOHORARIO, FK_ID_ESTADO_PROGCURSO) "
					+ "VALUES (?, ?, ?, ?)";
			int success = this.jdbcTemplate.update(insertQuery, progCurso.getIdProgDocCur(),
					progCurso.getIdAula(), progCurso.getIdHorarioGrupoHorario(), progCurso.getIdEstadoProgCurso());
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {
			System.out.println(ex.getMessage());
			if (ex.getMessage().contains("DOC_HGH_UNIQUE")) {
				return "El docente ya tiene asignado un curso en ese horario";
			} else if (ex.getMessage().contains("UNICO_UNIQUE")) {
				return "No es posible ingresar registros duplicados.";
			}
			return "No es posible ingresar registros duplicados.";
		}
	}

	@Override
	public String editProgCurso(ProgCurso progCurso, int id) {
		int idPeriodo = progDocenteri.getProgDocCursoById (progCurso.getIdProgDocCur()).getIdPeriodo();
				
    String docenteOcupado = docenteOcupadoByDocenteHorarioPeriodo(progCurso.getIdProgDocCur(), progCurso.getIdHorarioGrupoHorario(), 
				idPeriodo) ;
    if(docenteOcupado =="1"){
    	try {
			String query = "UPDATE tpprog_curso SET FK_ID_PROG_DOC_CUR = ?, FK_ID_AULA = ? , FK_ID_HORARIO_GRUPOHORARIO = ?,"
					+ " FK_ID_ESTADO_PROGCURSO = ? WHERE ID_PROGCURSO = " + id;
			int update = this.jdbcTemplate.update(query, progCurso.getIdProgDocCur(),
					progCurso.getIdAula(), progCurso.getIdHorarioGrupoHorario(), progCurso.getIdEstadoProgCurso());
			
			if (update == 1) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {
			return "Los datos actualizados se repiten en otro registro.";
		}
    }
    else { // (docenteOcupado =="0")
    	return "El docente ya tiene asignado un curso en ese horario.";
    }
		
    
	}

	@Override
	public String deleteProgCurso(int id) {
		try {
			String query = "DELETE FROM tpprog_curso WHERE ID_PROGCURSO = ?";
			int success = this.jdbcTemplate.update(query, id);
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (DataIntegrityViolationException ex) { 		//como mi ex :c
			return "No es posible eliminar un registro en uso";
		}
	}

	@Override
	public List<ProgCursoDTO> getProgCursos() {
		String query = "SELECT * FROM tpprog_curso AS pc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				" 	LEFT JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				" 		LEFT JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"	INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"        INNER JOIN txhoras_clase AS dc ON dc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO "
				+ "ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cu.CICLO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public ProgCursoDTO getProgCursoById(int id) {
		String query = "SELECT * FROM tpprog_curso AS pc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				" 	LEFT JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				" 		LEFT JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"	INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"        INNER JOIN txhoras_clase AS dc ON dc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO " +
				"	WHERE ID_PROGCURSO  = " + id;
		List<ProgCursoDTO> progs = this.row.mapRowProgCursogetOne(this.jdbcTemplate.queryForList(query));
		
		if (progs.size() > 0) {
			return progs.get(0);
		}
		
		return null;
	}

	@Override
	public List<ProgCursoDTO> getProgCursosByCursoPeriodo(int idCurso, int idPeriodo) {
		String query = "SELECT * FROM tpprog_curso AS pc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cu ON cu.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cu.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cu.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				" 	LEFT JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				" 		LEFT JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"	INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"        INNER JOIN txhoras_clase AS dc ON dc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO " +
				"	WHERE cu.ID_CURSO  = '" + idCurso + "' AND pa.ID_PERIODO = " + idPeriodo
				+ " ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cu.CICLO";
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(int idCurso, int idHorario, int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpprog_curso AS pgc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"        INNER JOIN tmperiodo_academico AS pac ON pac.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"    LEFT JOIN tmaula AS aul ON aul.ID_AULA = pgc.FK_ID_AULA\r\n" + 
				"		LEFT JOIN tmsede AS sed ON sed.ID_SEDE = aul.FK_ID_SEDE\r\n" + 
				"    INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pgc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txhoras_clase AS dcl ON dcl.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pgc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"WHERE cur.ID_CURSO = " + idCurso + " AND hgh.ID_HORARIO_GRUPOHORARIO = " + idHorario +
				" AND pac.ID_PERIODO = " + idPeriodo
				+ " ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cur.CICLO";
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public List<ProgCursoDTO> getProgCursosByPeriodo(int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpprog_curso AS pgc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"        INNER JOIN tmperiodo_academico AS pac ON pac.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"    LEFT JOIN tmaula AS aul ON aul.ID_AULA = pgc.FK_ID_AULA\r\n" + 
				"		LEFT JOIN tmsede AS sed ON sed.ID_SEDE = aul.FK_ID_SEDE\r\n" + 
				"    INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pgc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txhoras_clase AS dcl ON dcl.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pgc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"WHERE pac.ID_PERIODO = " + idPeriodo
				+ " ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cur.CICLO";
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public List<ProgCursoDTO> getProgCursosBySedePeriodo(int idSede, int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpprog_curso AS pgc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"        INNER JOIN tmperiodo_academico AS pac ON pac.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"    LEFT JOIN tmaula AS aul ON aul.ID_AULA = pgc.FK_ID_AULA\r\n" + 
				"		LEFT JOIN tmsede AS sed ON sed.ID_SEDE = aul.FK_ID_SEDE\r\n" + 
				"    INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pgc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txhoras_clase AS dcl ON dcl.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pgc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"WHERE aul.FK_ID_SEDE = " + idSede + " AND pdc.FK_ID_PERIODO = " + idPeriodo
				+ " ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cur.CICLO";
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public List<ProgCursoDTO> getProgCursosBySedePeriodoIdioma(int idSede, int idPeriodo, int idIdioma) {
		String query = "SELECT * FROM tpprog_curso AS pc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"	LEFT JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				"		LEFT JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"	INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txhoras_clase AS dc ON dc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"    WHERE se.ID_SEDE = " + idSede + " AND pa.ID_PERIODO = " + idPeriodo + " AND id.ID_IDIOMA = " + idIdioma + "\r\n" + 
				"ORDER BY doc.COD_DOCENTE_CI, id.NOM_IDIOMA, ni.ID_NIVEL, cur.CICLO";
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<ProgCursoDTO> progs = row.mapRowProgCurso(rows);
		return progs;
	}

	@Override
	public Integer getIdProgCursoByCursoHorarioSedePeriodo(int idCurso, int idHorario, int idSede, int idPeriodo) {
		String query = "SELECT ID_PROGCURSO FROM tpprog_curso AS pc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmperiodo_academico AS pa ON pa.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"	LEFT JOIN tmaula AS au ON au.ID_AULA = pc.FK_ID_AULA\r\n" + 
				"		LEFT JOIN tmsede AS se ON se.ID_SEDE = au.FK_ID_SEDE\r\n" + 
				"	INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
				"		INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"		INNER JOIN txhoras_clase AS dc ON dc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"	INNER JOIN txestado_progcurso AS ep ON ep.ID_ESTADO_PROGCURSO = pc.FK_ID_ESTADO_PROGCURSO\r\n" + 
				"    WHERE cur.ID_CURSO = " + idCurso + " AND  hgh.ID_HORARIO_GRUPOHORARIO = " + idHorario + " AND\r\n" + 
				"		se.ID_SEDE = " + idSede + " AND pa.ID_PERIODO = " + idPeriodo;
		
		Map<String, Object> row = this.jdbcTemplate.queryForList(query).get(0);
		
		if (row.isEmpty()) {
			return null;
		} else {
			return Integer.parseInt(row.get("ID_PROGCURSO").toString());
		}
	}

	@Override
	public String docenteOcupadoByDocenteHorarioPeriodo(int idProgDoc, int idHorario, int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpprog_curso AS pgc\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"		LEFT JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"WHERE doc.COD_DOCENTE_CI = (SELECT FK_ID_DOCENTE FROM tpprog_doc_curso WHERE ID_PROG_DOC_CUR = " +
				idProgDoc + ") AND pgc.FK_ID_HORARIO_GRUPOHORARIO = " + idHorario +"\r\n" + 
				"	AND pdc.FK_ID_PERIODO  = " + idPeriodo;
		
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		
		if (rows.isEmpty()) {
			return "1";
//			return "Listo";
		}
//		return "El docente ya tiene asignado un curso en ese horario.";
        return "0";
	}

}
