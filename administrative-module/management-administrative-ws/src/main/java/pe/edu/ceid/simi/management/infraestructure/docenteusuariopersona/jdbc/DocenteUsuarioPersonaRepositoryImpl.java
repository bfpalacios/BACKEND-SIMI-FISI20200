package pe.edu.ceid.simi.management.infraestructure.docenteusuariopersona.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.docenteusuariopersona.model.DocenteUsuarioPersona;
import pe.edu.ceid.simi.management.domain.docenteusuariopersona.repository.DocenteUsuarioPersonaRepository;

@Component
public class DocenteUsuarioPersonaRepositoryImpl implements DocenteUsuarioPersonaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DocenteUsuarioPersonaRowMapper row;

	@Override
	public String crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona) {
		try {
			String insertQuery = "{CALL SP_DOC_USU_PER_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			int success = this.jdbcTemplate.update(insertQuery, docenteUsuarioPersona.getNombre(), docenteUsuarioPersona.getApellidoPat(),
					docenteUsuarioPersona.getApellidoMat(), docenteUsuarioPersona.getDni(), docenteUsuarioPersona.getGenero(),
					docenteUsuarioPersona.getEdad(), docenteUsuarioPersona.getUniversity(), docenteUsuarioPersona.getLugarNacDist(),
					docenteUsuarioPersona.getLugarNacProv(), docenteUsuarioPersona.getLugarNacDep(), docenteUsuarioPersona.getNacionalidad(),
					docenteUsuarioPersona.getAddress(), docenteUsuarioPersona.getPhone(), docenteUsuarioPersona.getFechaNacimiento(),
					docenteUsuarioPersona.getEmail(), docenteUsuarioPersona.getContrasenia(), docenteUsuarioPersona.getEstado(),
					docenteUsuarioPersona.getDepartamento());
			
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
	public String editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id) {
		try {
			String insertQuery = "{CALL SP_DOC_USU_PER_UPDATE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
			int success = this.jdbcTemplate.update(insertQuery, id, docenteUsuarioPersona.getNombre(),
					docenteUsuarioPersona.getApellidoPat(), docenteUsuarioPersona.getApellidoMat(), docenteUsuarioPersona.getDni(),
					docenteUsuarioPersona.getGenero(), docenteUsuarioPersona.getEdad(), docenteUsuarioPersona.getUniversity(),
					docenteUsuarioPersona.getLugarNacDist(), docenteUsuarioPersona.getLugarNacProv(), docenteUsuarioPersona.getLugarNacDep(),
					docenteUsuarioPersona.getNacionalidad(), docenteUsuarioPersona.getAddress(), docenteUsuarioPersona.getPhone(),
					docenteUsuarioPersona.getFechaNacimiento(), docenteUsuarioPersona.getEmail(), docenteUsuarioPersona.getContrasenia(),
					docenteUsuarioPersona.getEstado(), docenteUsuarioPersona.getDepartamento());
			
			if (success >= 0) {
				return "true";
			}

			return "false";
		} catch (DuplicateKeyException ex) {
	//		System.out.println("Mensaje: " + ex.getMessage());
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
	public List<DocenteUsuarioPersona> getDocenteUsuarioPersona() {
		String query = "SELECT *, us.FECHA_ALTA FECHA_ALTA_USU, us.FECHA_BAJA FECHA_BAJA_USU, us.FECHA_MOD FECHA_MOD_USU,\r\n" + 
				"	pe.FECHA_ALTA FECHA_ALTA_PER, pe.FECHA_MOD FECHA_MOD_PER\r\n" + 
				"FROM tmdocente AS doc\r\n" + 
				"	INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"		INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DocenteUsuarioPersona> docUsuPer = row.mapRowDocenteUsuarioPersona(rows);
		return docUsuPer;
	}

	@Override
	public List<DocenteUsuarioPersona> getDocentesByCursoPeriodo(int idCurso, int idPeriodo) {
		String query = "SELECT *\r\n" + 
				"FROM tpprog_doc_curso AS pdc\r\n" + 
			
				"        INNER JOIN tmperiodo_academico AS pac ON pac.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
				"			INNER JOIN txnivel AS ni ON ni.ID_NIVEL = cur.FK_ID_NIVEL\r\n" + 
				"			INNER JOIN tmidioma AS id ON id.ID_IDIOMA = cur.FK_ID_IDIOMA\r\n" + 
				"		INNER JOIN tmdocente AS doc ON doc.COD_DOCENTE_CI = pdc.FK_ID_DOCENTE\r\n" + 
				"			INNER JOIN tmusuario AS usu ON usu.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"				INNER JOIN tmpersona AS per ON per.ID_PERSONA = usu.FK_ID_PERSONA\r\n" + 
				"				INNER JOIN tmrol AS rol ON rol.ID_ROL = usu.FK_ID_ROL " + 
				"WHERE cur.ID_CURSO = " + idCurso + " AND pac.ID_PERIODO = " + idPeriodo;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DocenteUsuarioPersona> docUsuPer = row.mapRowDocenteUsuarioPersona(rows);
		return docUsuPer;
	}

	@Override
	public String deleteDocenteUsuarioPersona(String codDocente) {
		DocenteUsuarioPersona docente = getDocenteUsuarioPersonaById(codDocente);

		try {
			String query = "{CALL SP_DOC_USU_PER_DELETE(?)}";
			int success = this.jdbcTemplate.update(query, codDocente);
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
			
		} catch (Exception e) {
			System.out.print(e);
			return "No se puede eliminar al docente "+ docente.getNombre() +" "+ docente.getApellidoPat()+" "+ docente.getApellidoMat()
			+" porque tiene asignado carga académica" ;
		}
		
	}

	@Override
	public DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id) {
		String query ="SELECT *, us.FECHA_ALTA FECHA_ALTA_USU, us.FECHA_BAJA FECHA_BAJA_USU, us.FECHA_MOD FECHA_MOD_USU,\r\n" + 
				"	pe.FECHA_ALTA FECHA_ALTA_PER, pe.FECHA_MOD FECHA_MOD_PER\r\n" + 
				"FROM tmdocente AS doc\r\n" + 
				"	INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO\r\n" + 
				"		INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA\r\n" + 
				"		INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL " +
				"WHERE doc.COD_DOCENTE_CI = '" + id + "'";
		List<DocenteUsuarioPersona> docUsuPer = this.row.mapRowDocenteUsuarioPersona(this.jdbcTemplate.queryForList(query));
		
		if (docUsuPer.size() > 0) {
			return docUsuPer.get(0);
		}
	
		return null;
	}

}


