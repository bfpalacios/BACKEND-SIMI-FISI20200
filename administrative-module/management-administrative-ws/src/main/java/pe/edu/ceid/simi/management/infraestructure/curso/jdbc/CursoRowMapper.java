package pe.edu.ceid.simi.management.infraestructure.curso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.curso.model.CursoDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class CursoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<CursoDTO> mapRowCurso(List<Map<String, Object>> rows){
		List<CursoDTO> cursos = new ArrayList<CursoDTO>();
		for(Map<String, Object> row: rows) {
			int ccurso = Integer.parseInt(row.get("ID_CURSO").toString());
			int cidioma = Integer.parseInt(row.get("FK_ID_IDIOMA").toString());
			String nomIdioma =row.get("NOM_IDIOMA").toString();
			int cnivel = Integer.parseInt(row.get("FK_ID_NIVEL").toString());
			String nomNivel = row.get("NOM_NIVEL").toString();
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			String libro = Tratamiento.tratarString("LIBRO", row);
			
			CursoDTO i = new CursoDTO(ccurso, cidioma, nomIdioma, cnivel, nomNivel, ciclo, libro);
			
			cursos.add(i);
		}
		return cursos;
	}

}
