package pe.edu.ceid.simi.management.infraestructure.curso.jdbc;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.curso.model.Curso;
import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.management.domain.curso.repository.CursoRepository;

@Component
public class CursoRepositoryImpl implements CursoRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CursoRowMapper row;

	@Override
	public String crearCurso(Curso curso) {
		int existe = 0;
		String query = "SELECT COUNT(*) AS CUENTA FROM tmcurso "
				+ "WHERE FK_ID_IDIOMA = " + curso.getIdIdioma() +
				" AND FK_ID_NIVEL = " + curso.getIdNivel() +
				" AND CICLO = " + curso.getCiclo();
		
		Map<String, Object> row = this.jdbcTemplate.queryForList(query).get(0);
		existe = Integer.parseInt(row.get("CUENTA").toString());
		
		if (existe == 0) {
			String insertQuery = "INSERT INTO tmcurso (FK_ID_IDIOMA, FK_ID_NIVEL, CICLO, LIBRO) values (?, ?, ?, ?)";
			int success = this.jdbcTemplate.update(insertQuery, curso.getIdIdioma(), curso.getIdNivel(),
					curso.getCiclo(), curso.getLibro());
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
		} else {
			return "Este curso ya ha sido registrado";
		}
	}

	@Override
	public String editCurso(Curso curso, int id) {
		int existe = 0;
		String query1 = "SELECT COUNT(*) AS CUENTA FROM tmcurso "
				+ "WHERE FK_ID_IDIOMA = " + curso.getIdIdioma() +
				" AND FK_ID_NIVEL = " + curso.getIdNivel() +
				" AND CICLO = " + curso.getCiclo();
		
		Map<String, Object> row = this.jdbcTemplate.queryForList(query1).get(0);
		existe = Integer.parseInt(row.get("CUENTA").toString());
		
		if (existe == 0) {
				String query = "UPDATE tmcurso SET FK_ID_IDIOMA = ?, FK_ID_NIVEL = ?, CICLO = ?, LIBRO = ? "
						+ "WHERE ID_CURSO = "+ id;
				int update = this.jdbcTemplate.update(query, curso.getIdIdioma(), curso.getIdNivel(),
						curso.getCiclo(), curso.getLibro());
				
				if (update == 1) {			return "true";		}
				return "false";
		} else {
			return "Este curso ya existe";
		}
		
		/*
		
		try {
			String query = "UPDATE tmcurso SET FK_ID_IDIOMA = ?, FK_ID_NIVEL = ?, CICLO = ?, LIBRO = ? "
					+ "WHERE ID_CURSO = "+ id;
			int update = this.jdbcTemplate.update(query, curso.getIdIdioma(), curso.getIdNivel(),
					curso.getCiclo(), curso.getLibro());
			
			if (update == 1) {			return "true";		}
			return "false";
		} catch (DuplicateKeyException ex) {	// Como mi ex :c
			ex.printStackTrace();
			System.out.print(ex);
			return "El curso ya existe en el sistema." ;
		}*/
	}
	
	@Override
	public String deleteCurso(int id) {
		CursoDTO  curso= getCursoById(id);	
		
		try {
			String query = "DELETE FROM tmcurso WHERE ID_CURSO = ?";
			int success = this.jdbcTemplate.update(query, id);
			
			if (success >= 0) {
				return "true";
			}
			
			return "false";
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.print(e);
			return "No se puede eliminar el curso "+ curso.getNomIdioma() +" "+ curso.getNomNivel()+" " +curso.getCiclo()+" porque esta siendo utilizado" ;
	
		}
	}
	
	@Override
	public List<CursoDTO> getCursos() {
		String query = "SELECT * FROM tmcurso AS cu "
				+ "INNER JOIN tmidioma AS id ON cu.FK_ID_IDIOMA = id.ID_IDIOMA "
				+ "INNER JOIN txnivel AS ni ON cu.FK_ID_NIVEL = ni.ID_NIVEL "
				+ "ORDER BY id.ID_IDIOMA, ni.ID_NIVEL, cu.CICLO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<CursoDTO> cursos = row.mapRowCurso(rows);
		return cursos;
	}

	@Override
	public List<CursoDTO> getCursosByIdioma(int idIdioma) {
		String query = "SELECT * FROM tmcurso AS cu "
				+ "INNER JOIN tmidioma AS id ON cu.FK_ID_IDIOMA = id.ID_IDIOMA "
				+ "INNER JOIN txnivel AS ni ON cu.FK_ID_NIVEL = ni.ID_NIVEL "
				+ "WHERE id.ID_IDIOMA = " + idIdioma
				+ " ORDER BY id.ID_IDIOMA, ni.ID_NIVEL, cu.CICLO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<CursoDTO> cursos = row.mapRowCurso(rows);
		return cursos;
	}

	@Override
	public CursoDTO getCursoById(int id) {
		String query = "SELECT * FROM tmcurso AS cu "
				+ "INNER JOIN tmidioma AS id ON cu.FK_ID_IDIOMA = id.ID_IDIOMA "
				+ "INNER JOIN txnivel AS ni ON cu.FK_ID_NIVEL = ni.ID_NIVEL WHERE ID_CURSO = " + id;
		List<CursoDTO> curso = this.row.mapRowCurso(this.jdbcTemplate.queryForList(query));
		
		if (curso.size() > 0) {
			return curso.get(0);
		}
		
		return null;
	}

	@Override
	public List<CursoDTO> getCursosByDocente(int idDocente) {
		String query = "SELECT * FROM tmcurso AS cu "
				+ "INNER JOIN tmidioma AS id ON cu.FK_ID_IDIOMA = id.ID_IDIOMA "
				+ "INNER JOIN txnivel AS ni ON cu.FK_ID_NIVEL = ni.ID_NIVEL "
				+ "INNER JOIN tpprog_doc_curso AS pdc ON pdc.FK_ID_CURSO = cu.ID_CURSO "
				+ "INNER JOIN tmdocente AS doc ON doc.ID_DOCENTE = pdc.FK_ID_DOCENTE "
				+ "WHERE id.ID_IDIOMA = " + idDocente
				+ " ORDER BY id.ID_IDIOMA, ni.ID_NIVEL, cu.CICLO";
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<CursoDTO> cursos = row.mapRowCurso(rows);
		return cursos;
	}

	@Override
	public List<CursoDTO> getCursosByPeriodo(int idPeriodo) {
		String query = "SELECT * FROM tmcurso AS cur\r\n" + 
				"	INNER JOIN tpprog_doc_curso AS pdc ON pdc.FK_ID_CURSO = cur.ID_CURSO\r\n" + 
				" 		LEFT JOIN tpprog_curso AS pgc ON pgc.FK_ID_PROG_DOC_CUR = pdc.ID_PROG_DOC_CUR\r\n" + 
				"WHERE pdc.FK_ID_PERIODO = " + idPeriodo;
		List<Map<String, Object>> rows = this.jdbcTemplate.queryForList(query);
		List<CursoDTO> cursos = row.mapRowCurso(rows);
		return cursos;
	}

}
