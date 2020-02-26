package pe.edu.ceid.simi.management.infraestructure.aula.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.aula.model.Aula;
import pe.edu.ceid.simi.management.domain.aula.model.AulaDTO;
import pe.edu.ceid.simi.management.domain.aula.repository.AulaRepository;
import pe.edu.ceid.simi.management.domain.sede.model.Sede;


@Component
public class AulaRepositoryImpl implements AulaRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private AulaRowMapper row;

	@Override
	public Aula crearAula(Aula aula) {
		String insertQuery = "INSERT INTO tmaula (NOM_AULA, REF_AULA, FK_ID_SEDE) values (?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, aula.getNomAula(), aula.getRefAula(),
				 aula.getIdSede());
		if (success >= 0) {
			return aula;
		}
		return null;
	}

	@Override
	public Aula editAula(Aula aula, int id) {
		String query = "UPDATE tmaula SET NOM_AULA = ?, REF_AULA = ? , FK_ID_SEDE = ? WHERE ID_AULA = "+ id;
		int update = this.jdbcTemplate.update(query, aula.getNomAula(), aula.getRefAula(), aula.getIdSede());
		
		if (update == 1) {
			return aula;
		}
		
		return null;
	}

	@Override
	public List<AulaDTO> getAulas() {
		String query = "SELECT * FROM tmaula AS au "
				+ "INNER JOIN tmsede AS se ON au.FK_ID_SEDE = se.ID_SEDE";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<AulaDTO> aulas = row.mapRowAula(rows);
		return aulas;
	}

	@Override
	public List<AulaDTO> getAulasBySede(int idSede) {
		String query = "SELECT * FROM tmaula AS au "
				+ "INNER JOIN tmsede AS se ON au.FK_ID_SEDE = se.ID_SEDE "
				+ "WHERE se.ID_SEDE = " + idSede
				+ " ORDER BY au.NOM_AULA";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<AulaDTO> aulas = row.mapRowAula(rows);
		return aulas;
	}

	@Override
	public AulaDTO getAulaById(int id) {
		String query = "SELECT * FROM tmaula AS au "
				+ "INNER JOIN tmsede AS se ON au.FK_ID_SEDE = se.ID_SEDE WHERE ID_AULA  = " + id;
		List<AulaDTO> aula = this.row.mapRowAula(this.jdbcTemplate.queryForList(query));
		if (aula.size() > 0) {
			return aula.get(0);
		}
		return null;
	}

	@Override
	public String deleteAula(int id) {
		
		
			AulaDTO aula = getAulaById(id);
		
		
		try{ 
			String query = "DELETE FROM tmaula WHERE ID_AULA = ?";
			int success = this.jdbcTemplate.update(query, id);
			if (success >= 0) {
				return "true";
			}
			return "false";
				
		}catch (Exception e) {
			e.printStackTrace();
			System.out.print(e);
			return "No se puede eliminar el aula "+ aula.getNomAula() +" de la sede "+ aula.getNomSede()+" porque esta siendo utilizado" ;
		}
		
		
	}

}
