package pe.edu.ceid.simi.management.infraestructure.grupohorario.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorario;
import pe.edu.ceid.simi.management.domain.grupohorario.model.GrupoHorarioDTO;
import pe.edu.ceid.simi.management.domain.grupohorario.repository.GrupoHorarioRepository;


@Component
public class GrupoHorarioRepositoryImpl implements GrupoHorarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private GrupoHorarioRowMapper row;

	@Override
	public GrupoHorario crearGrupoHorario(GrupoHorario grupoHorario) {
		String insertQuery = "INSERT INTO tmgrupo_horario (NOM_GRUPOHORARIO) values (?)";
		int success = this.jdbcTemplate.update(insertQuery,
				grupoHorario.getNomGrupoHorario());
		if (success >= 0) {
			return grupoHorario;
		}
		return null;
	}

	@Override
	public GrupoHorario editGrupoHorario(GrupoHorario grupoHorario, int id) {
		String query = "UPDATE tmgrupo_horario SET NOM_GRUPOHORARIO = ? WHERE ID_GRUPOHORARIO = " + id;
		int update = this.jdbcTemplate.update(query, grupoHorario.getNomGrupoHorario());
		
		if (update == 1) {
			return grupoHorario;
		}
		return null;
	}

	@Override
	public List<GrupoHorarioDTO> getGrupoHorario() {
		String query = "SELECT *, gh.ID_GRUPOHORARIO, gh.NOM_GRUPOHORARIO,\r\n" + 
				"	CONCAT(GROUP_CONCAT(dc.NOM_DIA SEPARATOR ', '), ' de ', hc.HORA_INICIO, ' a ', hc.HORA_SALIDA)\r\n" + 
				"    AS LISTA_HORARIO\r\n" + 
				"FROM tmgrupo_horario AS gh\r\n" + 
				"INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.FK_ID_GRUPOHORARIO = gh.ID_GRUPOHORARIO\r\n" + 
				"	LEFT JOIN txdias_clase AS dc ON dc.ID_DIA = hgh.FK_ID_DIA\r\n" + 
				"	INNER JOIN txhoras_clase AS hc ON hc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"GROUP BY gh.ID_GRUPOHORARIO" ;

		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<GrupoHorarioDTO> grupoHorario = row.mapRowGrupoHorario(rows);
		return grupoHorario;
	}

	@Override
	public GrupoHorarioDTO getGrupoHorarioById(int id) {
		String query = "SELECT *, gh.ID_GRUPOHORARIO, gh.NOM_GRUPOHORARIO,\r\n" + 
				"	CONCAT(GROUP_CONCAT(dc.NOM_DIA SEPARATOR ', '), ' de ', hc.HORA_INICIO, ' a ', hc.HORA_SALIDA)\r\n" + 
				"    AS LISTA_HORARIO\r\n" + 
				"FROM tmgrupo_horario AS gh\r\n" + 
				"INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.FK_ID_GRUPOHORARIO = gh.ID_GRUPOHORARIO\r\n" + 
				"	LEFT JOIN txdias_clase AS dc ON dc.ID_DIA = hgh.FK_ID_DIA\r\n" + 
				"	INNER JOIN txhoras_clase AS hc ON hc.ID_HORA = hgh.FK_ID_HORA\r\n" + 
				"WHERE gh.ID_GRUPOHORARIO = " + id + " " +
				"GROUP BY gh.ID_GRUPOHORARIO";
		List<GrupoHorarioDTO> grupoHorario = this.row.mapRowGrupoHorario(this.jdbcTemplate.queryForList(query));
		if (grupoHorario.size() > 0) {
			return grupoHorario.get(0);
		}
		return null;
	}

	@Override
	public boolean deleteGrupoHorario(int id) {
		String query = "DELETE FROM tmgrupo_horario WHERE ID_GRUPOHORARIO = ?";

		int success = this.jdbcTemplate.update(query, id);
		if (success >= 0) {
			return true;
		}
		return false;
	}

}
