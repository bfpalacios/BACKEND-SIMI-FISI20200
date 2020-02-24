package pe.edu.ceid.simi.management.infraestructure.horario.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.horario.model.Horario;
import pe.edu.ceid.simi.management.domain.horario.model.HorarioDTO;
import pe.edu.ceid.simi.management.domain.horario.repository.HorarioRepository;



@Component
public class HorarioRepositoryImpl implements HorarioRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private HorarioRowMapper row;

	@Override
	public Horario crearHorario(Horario horario) {
		String insertQuery = "INSERT INTO tmhorario_grupo_horario (FK_ID_GRUPOHORARIO, FK_ID_HORA, FK_ID_DIA) "
				+ "VALUES (?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, horario.getIdGrupoHorario(),
				 horario.getIdHora(), horario.getIdDia());
		
		if (success >= 0) {
			return horario;
		}
		
		return null;
	}

	@Override
	public Horario editHorario(Horario horario, int id) {
		String query = "UPDATE tmhorario_grupo_horario SET FK_ID_GRUPOHORARIO = ?, FK_ID_HORA = ?, FK_ID_DIA = ? "
				+ "WHERE ID_HORARIO_GRUPOHORARIO = " + id;
		int update = this.jdbcTemplate.update(query, horario.getIdGrupoHorario(),
				 horario.getIdHora(), horario.getIdDia());
		
		if (update == 1) {
			return horario;
		}
		
		return null;
	}

	@Override
	public boolean deleteHorario(int idHorario) {
		String query = "DELETE FROM tmhorario_grupo_horario WHERE ID_HORARIO_GRUPOHORARIO = ?";
		int success = this.jdbcTemplate.update(query, idHorario);
		if (success >= 0) {
			return true;
		}
		return false;
	}

	@Override
	public List<HorarioDTO> getHorarios() {
		String query = "SELECT *\r\n" + 
				"FROM tmhorario_grupo_horario AS ho\r\n" + 
				"INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = ho.FK_ID_GRUPOHORARIO\r\n" + 
				"LEFT JOIN txdias_clase AS di ON di.ID_DIA = ho.FK_ID_DIA\r\n" + 
				"INNER JOIN txhoras_clase AS hr ON hr.ID_HORA = ho.FK_ID_HORA";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<HorarioDTO> horarios = row.mapRowHorario(rows);
		return horarios;
	}

	@Override
	public List<HorarioDTO> getHorariosById(int id) {
		String query = "SELECT *\r\n" + 
				"FROM tmhorario_grupo_horario AS ho\r\n" + 
				"INNER JOIN tmgrupo_horario AS gh ON gh.ID_GRUPOHORARIO = ho.FK_ID_GRUPOHORARIO\r\n" + 
				"LEFT JOIN txdias_clase AS di ON di.ID_DIA = ho.FK_ID_DIA\r\n" + 
				"INNER JOIN txhoras_clase AS hr ON hr.ID_HORA = ho.FK_ID_HORA "
				+ "WHERE FK_ID_GRUPOHORARIO = " + id;
		List<HorarioDTO> horario = this.row.mapRowHorario(this.jdbcTemplate.queryForList(query));
		return horario;
	}

}
