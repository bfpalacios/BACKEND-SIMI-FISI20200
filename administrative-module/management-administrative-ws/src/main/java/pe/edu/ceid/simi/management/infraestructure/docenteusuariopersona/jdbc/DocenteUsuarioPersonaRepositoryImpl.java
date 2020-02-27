package pe.edu.ceid.simi.management.infraestructure.docenteusuariopersona.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
		int existeDni = 0;
		int existeEmail = 0;
		int existePhone = 0;

		String queryDni = "SELECT COUNT(*) AS CUENTA FROM tmpersona WHERE DNI = '" + docenteUsuarioPersona.getDni() + "'";
		String queryEmail = "SELECT COUNT(*) AS CUENTA FROM tmusuario WHERE EMAIL = '" + docenteUsuarioPersona.getEmail() + "'";
		String queryPhone = "SELECT COUNT(*) AS CUENTA FROM tmpersona WHERE PHONE = '" + docenteUsuarioPersona.getPhone() + "'";

		Map<String, Object> row = this.jdbcTemplate.queryForList(queryDni).get(0);
		existeDni = Integer.parseInt(row.get("CUENTA").toString());

		row = this.jdbcTemplate.queryForList(queryEmail).get(0);
		existeEmail = Integer.parseInt(row.get("CUENTA").toString());

		row = this.jdbcTemplate.queryForList(queryPhone).get(0);
		existePhone = Integer.parseInt(row.get("CUENTA").toString());
		
		if (existeDni == 0) {
			if (existeEmail == 0) {
				if (existePhone == 0) {
					String insertQuery = "{CALL SP_DOC_USU_PER_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
					int success = this.jdbcTemplate.update(insertQuery, docenteUsuarioPersona.getNombre(), docenteUsuarioPersona.getApellidoPat(),
							docenteUsuarioPersona.getApellidoMat(), docenteUsuarioPersona.getDni(), docenteUsuarioPersona.getGenero(),
							docenteUsuarioPersona.getEdad(), docenteUsuarioPersona.getUniversity(), docenteUsuarioPersona.getLugarNacDist(),
							docenteUsuarioPersona.getLugarNacProv(), docenteUsuarioPersona.getLugarNacDep(), docenteUsuarioPersona.getNacionalidad(),
							docenteUsuarioPersona.getAddress(), docenteUsuarioPersona.getPhone() ,docenteUsuarioPersona.getEmail(),
							docenteUsuarioPersona.getContrasenia(), docenteUsuarioPersona.getEstado(), docenteUsuarioPersona.getDepartamento());
					
					if (success >= 0) {
						return "true";
					}
					
					return "false";
				} else {
					return "Se debe ingresar otro número de teléfono.";
				}
			} else {
				return "El correo electrónico consignado ya ha sido registrado.";
			}
		} else {
			return "El DNI consignado ya ha sido registrado";
		}
	}

	@Override
	public String editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, String id) {
		int existeDni = 0;
		int existeEmail = 0;
		int existePhone = 0;
		
		String queryDni = "SELECT COUNT(*) AS CUENTA FROM tmpersona WHERE DNI = '" + docenteUsuarioPersona.getDni() + "'";
		String queryEmail = "SELECT COUNT(*) AS CUENTA FROM tmusuario WHERE EMAIL = '" + docenteUsuarioPersona.getEmail() + "'";
		String queryPhone = "SELECT COUNT(*) AS CUENTA FROM tmpersona WHERE PHONE = '" + docenteUsuarioPersona.getPhone() + "'";

		Map<String, Object> row = this.jdbcTemplate.queryForList(queryDni).get(0);
		existeDni = Integer.parseInt(row.get("CUENTA").toString());

		row = this.jdbcTemplate.queryForList(queryEmail).get(0);
		existeEmail = Integer.parseInt(row.get("CUENTA").toString());

		row = this.jdbcTemplate.queryForList(queryPhone).get(0);
		existePhone = Integer.parseInt(row.get("CUENTA").toString());
		
		if (existeDni == 0) {
			if (existeEmail == 0) {
				if (existePhone == 0) {
					String insertQuery = "{CALL SP_DOC_USU_PER_UPDATE(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
					int success = this.jdbcTemplate.update(insertQuery, id, docenteUsuarioPersona.getNombre(),
							docenteUsuarioPersona.getApellidoPat(), docenteUsuarioPersona.getApellidoMat(), docenteUsuarioPersona.getDni(),
							docenteUsuarioPersona.getGenero(), docenteUsuarioPersona.getEdad(), docenteUsuarioPersona.getUniversity(),
							docenteUsuarioPersona.getLugarNacDist(), docenteUsuarioPersona.getLugarNacProv(), docenteUsuarioPersona.getLugarNacDep(),
							docenteUsuarioPersona.getNacionalidad(), docenteUsuarioPersona.getAddress(), docenteUsuarioPersona.getPhone(),
							docenteUsuarioPersona.getEmail(), docenteUsuarioPersona.getContrasenia(), docenteUsuarioPersona.getEstado(),
							docenteUsuarioPersona.getDepartamento());
					
					if (success >= 0) {
						return "true";
					}
					
					return "false";
				} else {
					return "Se debe ingresar otro número de teléfono.";
				}
			} else {
				return "El correo electrónico consignado ya ha sido registrado.";
			}
		} else {
			return "El DNI consignado ya ha sido registrado";
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
			e.printStackTrace();
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


