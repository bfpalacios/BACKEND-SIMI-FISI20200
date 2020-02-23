package pe.edu.ceid.simi.operative.infraestructure.idioma.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;


import pe.edu.ceid.simi.operative.domain.idioma.model.IdiomaDTO;
import pe.edu.ceid.simi.operative.domain.idioma.repository.IdiomaRepository;

@Component
public class IdiomaRepositoryImpl implements IdiomaRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private IdiomaRowMapper row;
	

	//@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<IdiomaDTO> getIdioma() {
		String query = "SELECT ID_IDIOMA, NOM_IDIOMA FROM TMIDIOMA";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<IdiomaDTO> idiomas = row.mapRowIdioma(rows);
		return idiomas;
	}
	

}
