package pe.edu.ceid.simi.management.infraestructure.estadomatricula.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estadomatricula.model.EstadoMatricula;

@Component
public class EstadoMatriculaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<EstadoMatricula> mapRowEstadoMatricula(List<Map<String, Object>> rows){
		List<EstadoMatricula> estados = new ArrayList<EstadoMatricula>();
		
		for(Map<String, Object> row: rows) {
			int idEstadoMatricula = Integer.parseInt(row.get("ID_ESTADO_MATRICULA").toString());
			String nomEstadoMatricula = row.get("NOM_ESTADO_MATRICULA").toString();
			
			EstadoMatricula e = new EstadoMatricula(idEstadoMatricula, nomEstadoMatricula);
			estados.add(e);
		}
		
		return estados;
	}
}
