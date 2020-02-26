package pe.edu.ceid.simi.management.infraestructure.idioma.jdbc;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;
import pe.edu.ceid.simi.management.domain.idioma.repository.IdiomaRepository;

@Component
public class IdiomaRepositoryImpl implements IdiomaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private IdiomaRowMapper row;

	@Override
	public String crearIdioma(Idioma idioma) {
		try {
			
			String insertQuery = "INSERT INTO tmidioma (DESC_IDIOMA, NOM_IDIOMA) VALUES (?, ?)";
			int success = this.jdbcTemplate.update(insertQuery, idioma.getDescIdioma(), idioma.getNomIdioma());
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {	// Como mi ex :c
			ex.printStackTrace();
			System.out.print(ex);
			return "El idioma "+ idioma.getNomIdioma() + " ya existe en el sistema." ;
		}
	}

	@Override
	public String editIdioma(Idioma idioma, int id) {
		try {
			String query = "UPDATE tmidioma SET DESC_IDIOMA = ?, NOM_IDIOMA = ? WHERE ID_IDIOMA = " + id;
			int update = this.jdbcTemplate.update(query, idioma.getDescIdioma(), idioma.getNomIdioma());
			
			if (update == 1) {
				return "true";
			}
			
			return "false";
		} catch (DuplicateKeyException ex) {	// Como mi ex :c
			ex.printStackTrace();
			System.out.print(ex);
			return "El idioma "+ idioma.getNomIdioma() + " ya existe en el sistema." ;
		}
	}

	@Override
	public List<Idioma> getIdiomas() {
		String query = "SELECT * FROM tmidioma AS id "
				+ "ORDER BY id.NOM_IDIOMA";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<Idioma> idiomas = row.mapRowIdioma(rows);
		
		return idiomas;
	}

	@Override
	public String deleteIdioma(int cidioma)   {
		Idioma idioma = getIdiomaById(cidioma);
		
		try{
			String query = "DELETE FROM tmidioma WHERE ID_IDIOMA = ?";
			int success = this.jdbcTemplate.update(query, cidioma);
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print(e);
			return "No se puede eliminar el idioma "+ idioma.getNomIdioma() +" porque esta siendo utilizado";
		}
		
	}

	@Override
	public Idioma getIdiomaById(int id) {
		String query ="SELECT * FROM tmidioma WHERE ID_IDIOMA = " + id;
		List<Idioma> idioma = this.row.mapRowIdioma(this.jdbcTemplate.queryForList(query));
		
		if (idioma.size() > 0) {
			return idioma.get(0);
		}
		
		return null;
	}

}
