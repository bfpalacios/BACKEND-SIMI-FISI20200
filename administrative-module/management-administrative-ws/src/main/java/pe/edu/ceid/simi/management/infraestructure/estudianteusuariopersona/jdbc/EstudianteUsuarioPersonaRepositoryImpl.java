package pe.edu.ceid.simi.management.infraestructure.estudianteusuariopersona.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.model.EstudianteUsuarioPersona;
import pe.edu.ceid.simi.management.domain.estudianteusuariopersona.repository.EstudianteUsuarioPersonaRepository;

@Component
public class EstudianteUsuarioPersonaRepositoryImpl implements EstudianteUsuarioPersonaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EstudianteUsuarioPersonaRowMapper row;

	@Override
	public String crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona) {
		try {
			String insertQuery = "{CALL SP_EST_USU_PER_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			int success = this.jdbcTemplate.update(insertQuery, estudianteUsuarioPersona.getNombre(), estudianteUsuarioPersona.getApellidoPat(),
					estudianteUsuarioPersona.getApellidoMat(), estudianteUsuarioPersona.getDni(), estudianteUsuarioPersona.getGenero(),
					estudianteUsuarioPersona.getEdad(), estudianteUsuarioPersona.getUniversity(), estudianteUsuarioPersona.getLugarNacDist(),
					estudianteUsuarioPersona.getLugarNacProv(), estudianteUsuarioPersona.getLugarNacDep(), estudianteUsuarioPersona.getNacionalidad(),
					estudianteUsuarioPersona.getAddress(), estudianteUsuarioPersona.getPhone(), estudianteUsuarioPersona.getFechaNacimiento(),
					estudianteUsuarioPersona.getEmail(), estudianteUsuarioPersona.getContrasenia(), estudianteUsuarioPersona.getEstado(),
					estudianteUsuarioPersona.getIdTipoEstudiante());
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {
//			System.out.println("Mensaje: " + ex.getMessage());
			if (ex.getMessage().contains("EMAIL_UNIQUE")) {
				return "El correo electrónico consignado ya ha sido registrado.";
			} else if (ex.getMessage().contains("DNI_UNIQUE")) {
				return "El DNI consignado ya ha sido registrado.";
			} else if (ex.getMessage().contains("PHONE_UNIQUE")) {
				return "Se debe ingresar otro número de teléfono.";
			}
			return "Algo salió mal.";
		}
		
	}

	@Override
	public String editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona, String id) {
		try {
			String insertQuery = "{CALL SP_EST_USU_PER_UPDATE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			int success = this.jdbcTemplate.update(insertQuery, id, estudianteUsuarioPersona.getNombre(),
					estudianteUsuarioPersona.getApellidoPat(), estudianteUsuarioPersona.getApellidoMat(), estudianteUsuarioPersona.getDni(),
					estudianteUsuarioPersona.getGenero(), estudianteUsuarioPersona.getEdad(), estudianteUsuarioPersona.getUniversity(),
					estudianteUsuarioPersona.getLugarNacDist(), estudianteUsuarioPersona.getLugarNacProv(), estudianteUsuarioPersona.getLugarNacDep(),
					estudianteUsuarioPersona.getNacionalidad(), estudianteUsuarioPersona.getAddress(), estudianteUsuarioPersona.getPhone(),
					estudianteUsuarioPersona.getFechaNacimiento(), estudianteUsuarioPersona.getEmail(), estudianteUsuarioPersona.getContrasenia(),
					estudianteUsuarioPersona.getEstado(), estudianteUsuarioPersona.getIdTipoEstudiante());
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {
//			System.out.println("Mensaje: " + ex.getMessage());
			if (ex.getMessage().contains("EMAIL_UNIQUE")) {
				return "El correo electrónico consignado ya ha sido registrado.";
			} else if (ex.getMessage().contains("DNI_UNIQUE")) {
				return "El DNI consignado ya ha sido registrado.";
			} else if (ex.getMessage().contains("PHONE_UNIQUE")) {
				return "Se debe ingresar otro número de teléfono.";
			}
			return "Algo salió mal.";
		}
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona() {
		String query = "SELECT *, us.FECHA_ALTA AS 'FECHA_ALTA_US', pe.FECHA_ALTA AS 'FECHA_ALTA_PE' " +
				"FROM tmestudiante AS es " + 
				"INNER JOIN tmusuario AS us ON us.ID_USUARIO = es.FK_ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL";
//				+"INNER JOIN tmtipo_estudiante AS te ON te.ID_TIPO_ESTUDIANTE = es.FK_ID_TIPO_ESTUDIANTE";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
		
		return estUsuPer;
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaMatriculadosByProgCurso(int idProgCurso) {
		String query = "SELECT * FROM tmestudiante AS est\r\n" + 
				"INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = est.FK_ID_USUARIO\r\n" + 
				"	INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"	INNER JOIN tmrol AS rol ON rol.ID_ROL = usu.FK_ID_ROL\r\n" + 
				"INNER JOIN tpmatricula AS mat ON mat.FK_COD_ESTUDIANTE_CI = est.COD_ESTUDIANTE_CI\r\n" + 
				"	INNER JOIN tpprog_curso AS pgc ON pgc.ID_PROGCURSO = mat.FK_ID_PROGCURSO\r\n" + 
				"		INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"WHERE pgc.ID_PROGCURSO = " + idProgCurso;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
		
		return estUsuPer;
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersonaByTipoEstudiante(int idTipoEstudiante) {
		String query = "SELECT * FROM tmestudiante AS est\r\n" + 
				"INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = est.FK_ID_USUARIO\r\n" + 
				"	INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"	INNER JOIN tmrol AS rol ON rol.ID_ROL = usu.FK_ID_ROL\r\n" + 
				"INNER JOIN tpmatricula AS mat ON mat.FK_COD_ESTUDIANTE_CI = est.COD_ESTUDIANTE_CI\r\n" + 
				"	INNER JOIN tpprog_curso AS pgc ON pgc.ID_PROGCURSO = mat.FK_ID_PROGCURSO\r\n" + 
				"		INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"WHERE est.FK_ID_TIPO_ESTUDIANTE = " + idTipoEstudiante;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
		
		return estUsuPer;
	}

	@Override
	public String deleteEstudianteUsuarioPersona(String cosEstudiante) {
	EstudianteUsuarioPersona docente = getEstudianteUsuarioPersonaById(cosEstudiante);
		try {
			String query = "{CALL SP_EST_USU_PER_DELETE(?)}";
			int success = this.jdbcTemplate.update(query, cosEstudiante);
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
			
		} catch (Exception e) {
			System.out.print(e);
			return "No se puede eliminar al estudiante "+ docente.getNombre() +" "+ docente.getApellidoPat()+" "+ docente.getApellidoMat()
			+" porque tiene asignado carga académica" ;
		}
	
	}

	@Override
	public EstudianteUsuarioPersona getEstudianteUsuarioPersonaById(String cosEstudiante) {
		String query ="SELECT *, us.FECHA_ALTA AS 'FECHA_ALTA_US', pe.FECHA_ALTA AS 'FECHA_ALTA_PE' " +
				"FROM tmestudiante AS es " + 
				"INNER JOIN tmusuario AS us ON us.ID_USUARIO = es.FK_ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL " +
				"WHERE es.COD_ESTUDIANTE_CI = '" + cosEstudiante + "'";
		List<EstudianteUsuarioPersona> estUsuPer = this.row.mapRowEstudianteUsuarioPersona(this.jdbcTemplate.queryForList(query));
		
		if (estUsuPer.size() > 0) {
			return estUsuPer.get(0);
		}
	
		return null;
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudiantesByCursoPeriodo(int idCurso, int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpmatricula AS mat\r\n" + 
				"	INNER JOIN tpprog_curso AS pgc ON pgc.ID_PROGCURSO = mat.FK_ID_PROGCURSO\r\n" + 
				"		INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
				"			INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"	INNER JOIN tmestudiante AS est ON est.COD_ESTUDIANTE_CI = mat.FK_COD_ESTUDIANTE_CI\r\n" + 
				"		INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = est.FK_ID_USUARIO\r\n" + 
				"			INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"			INNER JOIN tmrol AS rol ON rol.ID_ROL = usu.FK_ID_ROL\r\n" + 
				"WHERE cur.ID_CURSO = " + idCurso + " AND pdc.FK_ID_PERIODO = " + idPeriodo;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
		
		return estUsuPer;
	}

//	@Override
//	public List<EstudianteUsuarioPersona> getEstudiantesMatriculadosByProgCurso(int idProgCurso) {
//		String query = "SELECT *\r\n" + 
//				"FROM tpmatricula AS mat\r\n" + 
//				"	INNER JOIN tmestudiante AS est ON est.COD_ESTUDIANTE_CI = mat.FK_COD_ESTUDIANTE_CI\r\n" + 
//				"		INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = est.FK_ID_USUARIO\r\n" + 
//				"			INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
//				"	INNER JOIN tpprog_curso AS pgc ON pgc.ID_PROGCURSO = mat.FK_ID_PROGCURSO\r\n" + 
//				"WHERE pgc.ID_PROGCURSO = " + idProgCurso;
//		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
//		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
//		
//		return estUsuPer;
//	}

	@Override
	public String validarPasswdEstudiante(String codEstudiante, String passwd) {
		String query ="SELECT (usu.PASSWORD = md5('" + passwd + "')) AS IGUALES FROM tmusuario AS usu\r\n" + 
				"INNER JOIN tmestudiante AS est ON est.FK_ID_USUARIO = usu.ID_USUARIO\r\n" + 
				"WHERE est.COD_ESTUDIANTE_CI = '" + codEstudiante + "'";
		
		Map<String, Object> row = this.jdbcTemplate.queryForList(query).get(0);
	
		if (Integer.parseInt(row.get("IGUALES").toString()) == 1) {
			return "Contraseña correcta.";
		}
	
		return "Contraseña incorrecta.";
	}

}
