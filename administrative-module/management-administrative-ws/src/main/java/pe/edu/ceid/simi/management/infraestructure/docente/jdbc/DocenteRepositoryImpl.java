package pe.edu.ceid.simi.management.infraestructure.docente.jdbc;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.docente.model.Docente;
import pe.edu.ceid.simi.management.domain.docente.model.DocenteDTO;
import pe.edu.ceid.simi.management.domain.docente.repository.DocenteRepository;

@Component
public class DocenteRepositoryImpl implements DocenteRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DocenteRowMapper row;

	@Override
	public Docente crearDocente(Docente docente) {
		String insertQuery = "INSERT INTO tmdocente (FK_ID_USUARIO, DEPARTAMENTO) values (?, ?, ?)";
		int success = this.jdbcTemplate.update(insertQuery, docente.getCodDocente(), docente.getIdUsuario(), docente.getDepartamento());
		
		if (success >= 0) {
			return docente;
		}
		
		return null;
	}

	@Override
	public Docente editDocente(Docente docente, int id) {
		String query = "UPDATE tmdocente SET COD_DOCENTE_CI = ?, FK_ID_USUARIO = ?, DEPARTAMENTO = ? WHERE CDOCENTE = "+ id;
		int update = this.jdbcTemplate.update(query, docente.getCodDocente(), docente.getIdUsuario(), docente.getDepartamento());
		
		if (update == 1) {
			return docente;
		}
		
		return null;
	}

	@Override
	public boolean deleteDocente(int id) {
		String query = "DELETE FROM tmdocente WHERE CDOCENTE = ?";
		int success = this.jdbcTemplate.update(query, id);
		
		if (success >= 0) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<DocenteDTO> getDocente() {
		String query = "SELECT * FROM tmdocente AS doc "
				+ "INNER JOIN tmusuario AS us ON doc.CUSUARIO = us.CUSUARIO "
				+ "INNER JOIN tmtipo_contrato AS ti ON doc.CTIPO_CONTRATO = ti.CTIPO_CONTRATO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<DocenteDTO> docente = row.mapRowDocente(rows);
		return docente;
	}

	@Override
	public DocenteDTO getDocenteById(int id) {
		String query ="SELECT * FROM tmdocente AS doc "
				+ "INNER JOIN tmusuario AS us ON doc.CUSUARIO = us.CUSUARIO "
				+ "INNER JOIN tmtipo_contrato AS ti ON doc.CTIPO_CONTRATO = ti.CTIPO_CONTRATO "
				+ "WHERE CDOCENTE = " + id;
		List<DocenteDTO> docente = this.row.mapRowDocente(this.jdbcTemplate.queryForList(query));
		
		if (docente.size() > 0) {
			return docente.get(0);
		}
		
		return null;
	}
	

}
