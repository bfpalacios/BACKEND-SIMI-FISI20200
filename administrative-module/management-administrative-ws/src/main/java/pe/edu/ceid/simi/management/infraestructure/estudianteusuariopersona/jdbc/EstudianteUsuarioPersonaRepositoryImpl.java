package pe.edu.ceid.simi.management.infraestructure.estudianteusuariopersona.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	public EstudianteUsuarioPersona crearEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona) {
		String insertQuery = "{CALL SP_EST_USU_PER_INSERT(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)}";
		int success = this.jdbcTemplate.update(insertQuery, estudianteUsuarioPersona.getNombre(), estudianteUsuarioPersona.getApellidoPat(),
				estudianteUsuarioPersona.getApellidoMat(), estudianteUsuarioPersona.getDni(), estudianteUsuarioPersona.getGenero(),
				estudianteUsuarioPersona.getEdad(), estudianteUsuarioPersona.getUniversity(), estudianteUsuarioPersona.getLugarNacDist(),
				estudianteUsuarioPersona.getLugarNacProv(), estudianteUsuarioPersona.getLugarNacDep(), estudianteUsuarioPersona.getNacionalidad(),
				estudianteUsuarioPersona.getAddress(), estudianteUsuarioPersona.getPhone(),  estudianteUsuarioPersona.getEmail(),
				estudianteUsuarioPersona.getContrasenia(), estudianteUsuarioPersona.getEstado(), estudianteUsuarioPersona.getIdTipoEstudiante());
		
		if (success >= 0) {
			return estudianteUsuarioPersona;
		}
		
		return null;
	}

	@Override
	public EstudianteUsuarioPersona editEstudianteUsuarioPersona(EstudianteUsuarioPersona estudianteUsuarioPersona,
			int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstudianteUsuarioPersona> getEstudianteUsuarioPersona() {
		String query = "SELECT *, us.FECHA_ALTA AS 'FECHA_ALTA_US', pe.FECHA_ALTA AS 'FECHA_ALTA_PE' " +
				"FROM tmestudiante AS es " + 
				"INNER JOIN tmusuario AS us ON us.ID_USUARIO = es.FK_ID_USUARIO " + 
				"INNER JOIN tmpersona AS pe ON pe.ID_PERSONA = us.FK_ID_PERSONA " + 
				"INNER JOIN tmrol AS ro ON ro.ID_ROL = us.FK_ID_ROL";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<EstudianteUsuarioPersona> estUsuPer = row.mapRowEstudianteUsuarioPersona(rows);
		return estUsuPer;
	}

	@Override
	public boolean deleteEstudianteUsuarioPersona(String cosEstudiante) {
		String query = "{CALL SP_EST_USU_PER_DELETE(?)}";
		int success = this.jdbcTemplate.update(query, cosEstudiante);
		if (success >= 0) {
			return true;
		}
		return false;
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

}
