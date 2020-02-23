package pe.edu.ceid.simi.operative.infraestructure.curso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.curso.model.CursoDTO;

@Component
public class CursoRowMapper implements RowMapper{
	
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public CursoDTO mapRowCurso(LinkedCaseInsensitiveMap row) {
		
		int idCurso = Integer.parseInt(row.get("ID_CURSO").toString());
		int ciclo = Integer.parseInt(row.get("CICLO").toString());

		CursoDTO i = new CursoDTO(idCurso, ciclo);
		return i;
	}

}
