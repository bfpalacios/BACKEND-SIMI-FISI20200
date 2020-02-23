package pe.edu.ceid.simi.operative.infraestructure.grupo.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.grupo.repository.GrupoRepository;
import pe.edu.ceid.simi.operative.domain.grupo.model.Grupo;

@Component
public class GrupoRepositoryImpl implements GrupoRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private GrupoRowMapper row;

	@Override
	public List<Grupo> getGrupo() {
		String query = "SELECT * FROM TMGRUPO_HORARIO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Grupo> grupos = row.mapRowGrupo(rows);
		return grupos;
	}
	

}
