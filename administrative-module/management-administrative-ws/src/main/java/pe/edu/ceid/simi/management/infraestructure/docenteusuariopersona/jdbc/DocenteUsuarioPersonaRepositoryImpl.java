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
	public DocenteUsuarioPersona crearDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona) {
//		String callQuery = "SELECT @contDoc AS COD_DOCENTE FROM DUAL";
//		int codDocente = row.mapRowCodDocente(this.jdbcTemplate.queryForList(callQuery));
//		System.out.println("rwqrqwerMWEQRmqwemdmAdmfasdmfadsfmadsm: " + codDocente);
//		
		String insertQuery = "{CALL SP_DOC_USU_PER_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		int success = this.jdbcTemplate.update(insertQuery, docenteUsuarioPersona.getNombre(), docenteUsuarioPersona.getApellidoPat(),
				docenteUsuarioPersona.getApellidoMat(), docenteUsuarioPersona.getDni(), docenteUsuarioPersona.getGenero(),
				docenteUsuarioPersona.getEdad(), docenteUsuarioPersona.getUniversity(), docenteUsuarioPersona.getLugarNacDist(),
				docenteUsuarioPersona.getLugarNacProv(), docenteUsuarioPersona.getLugarNacDep(), docenteUsuarioPersona.getNacionalidad(),
				docenteUsuarioPersona.getAddress(), docenteUsuarioPersona.getPhone() ,docenteUsuarioPersona.getEmail(),
				docenteUsuarioPersona.getContrasenia(), docenteUsuarioPersona.getEstado(), docenteUsuarioPersona.getDepartamento());
		
		if (success >= 0) {
			return docenteUsuarioPersona;
		}
		
		return null;
	}

	@Override
	public DocenteUsuarioPersona editDocenteUsuarioPersona(DocenteUsuarioPersona docenteUsuarioPersona, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DocenteUsuarioPersona> getDocenteUsuarioPersona() {
		String query = "SELECT *, us.FECHA_ALTA AS 'FECHA_ALTA_US', pe.FECHA_ALTA AS 'FECHA_ALTA_PE' " +
				"FROM tmdocente AS doc " + 
				"INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DocenteUsuarioPersona> docUsuPer = row.mapRowDocenteUsuarioPersona(rows);
		return docUsuPer;
	}

	@Override
	public boolean deleteDocenteUsuarioPersona(String codDocente) {
		String query = "{CALL SP_DOC_USU_PER_DELETE(?)}";
		int success = this.jdbcTemplate.update(query, codDocente);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public DocenteUsuarioPersona getDocenteUsuarioPersonaById(String id) {
		String query ="SELECT *, us.FECHA_ALTA AS 'FECHA_ALTA_US', pe.FECHA_ALTA AS 'FECHA_ALTA_PE' " +
				"FROM tmdocente AS doc " + 
				"INNER JOIN tmusuario AS us ON us.ID_USUARIO = doc.FK_ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL " +
				"WHERE doc.COD_DOCENTE_CI = '" + id + "'";
		List<DocenteUsuarioPersona> docUsuPer = this.row.mapRowDocenteUsuarioPersona(this.jdbcTemplate.queryForList(query));
		
		if (docUsuPer.size() > 0) {
			return docUsuPer.get(0);
		}
	
		return null;
	}

}


