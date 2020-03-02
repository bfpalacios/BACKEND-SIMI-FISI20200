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
		String insertQuery = "INSERT INTO tmhorario_grupo_horario (FK_ID_GRUPOHORARIO, FK_ID_HORA) "
				+ "VALUES (?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, horario.getIdGrupoHorario(), horario.getIdHora());
		
		if (success >= 0) {
			return horario;
		}
		
		return null;
	}

	@Override
	public Horario editHorario(Horario horario, int id) {
		String query = "UPDATE tmhorario_grupo_horario SET FK_ID_GRUPOHORARIO = ?, FK_ID_HORA = ? "
				+ "WHERE ID_HORARIO_GRUPOHORARIO = " + id;
		int update = this.jdbcTemplate.update(query, horario.getIdGrupoHorario(), horario.getIdHora());
		
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
				"FROM tmhorario_grupo_horario AS hgh\r\n" + 
				"	INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"    INNER JOIN txhoras_clase AS hcl ON hcl.ID_HORA = hgh.FK_ID_HORA "
				+ " ORDER BY gho.NOM_GRUPOHORARIO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<HorarioDTO> horarios = row.mapRowHorario(rows);
		return horarios;
	}

	@Override
	public List<HorarioDTO> getHorariosById(int id) {
		String query = "SELECT *\r\n" + 
				"FROM tmhorario_grupo_horario AS hgh\r\n" + 
				"	INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
				"    INNER JOIN txhoras_clase AS hcl ON hcl.ID_HORA = hgh.FK_ID_HORA "
				+ "WHERE ID_HORARIO_GRUPOHORARIO = " + id;
		List<HorarioDTO> horario = this.row.mapRowHorario(this.jdbcTemplate.queryForList(query));
		return horario;
	}

	@Override
	public List<HorarioDTO> getHorariosByCursoPeriodo(int idCurso, int idPeriodo) {
//		String query = "SELECT *\r\n" + 
//				"FROM tpprog_curso AS pgc\r\n" + 
//				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.ID_PROG_DOC_CUR = pgc.FK_ID_PROG_DOC_CUR\r\n" + 
//				"		INNER JOIN tmcurso AS cur ON cur.ID_CURSO = pdc.FK_ID_CURSO\r\n" + 
//				"        INNER JOIN tmperiodo_academico AS pac ON pac.ID_PERIODO = pdc.FK_ID_PERIODO\r\n" + 
//				"    INNER JOIN tmhorario_grupo_horario AS hgh ON hgh.ID_HORARIO_GRUPOHORARIO = pgc.FK_ID_HORARIO_GRUPOHORARIO\r\n" + 
//				"		INNER JOIN tmgrupo_horario AS gho ON gho.ID_GRUPOHORARIO = hgh.FK_ID_GRUPOHORARIO\r\n" + 
//				"		INNER JOIN txhoras_clase AS hcl ON hcl.ID_HORA = hgh.FK_ID_HORA\r\n" + 
//				"        INNER JOIN txdias_clase aS dcl ON dcl.ID_DIA = hgh.FK_ID_DIA\r\n" + 
//				"WHERE cur.ID_CURSO = " + idCurso + " AND pac.ID_PERIODO = " + idPeriodo;
//		List<HorarioDTO> horario = this.row.mapRowHorario(this.jdbcTemplate.queryForList(query));
//		return horario;
		return null;
	}

}
