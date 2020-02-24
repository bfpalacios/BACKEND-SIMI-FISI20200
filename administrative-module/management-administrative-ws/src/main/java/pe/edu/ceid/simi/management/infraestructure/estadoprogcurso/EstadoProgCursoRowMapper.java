package pe.edu.ceid.simi.management.infraestructure.estadoprogcurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.estadoprogcurso.model.EstadoProgCurso;

@Component
public class EstadoProgCursoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EstadoProgCurso> mapRowEstadoProgCurso(List<Map<String, Object>> rows){
		List<EstadoProgCurso> estadoss = new ArrayList<EstadoProgCurso>();
		
		for(Map<String, Object> row: rows) {
			int idEstadoProgCurso = Integer.parseInt(row.get("ID_ESTADO_PROGCURSO").toString());
			String nomEstado = row.get("NOM_ESTADO").toString();

			EstadoProgCurso e = new EstadoProgCurso(idEstadoProgCurso, nomEstado);
			estadoss.add(e);
		}
		
		return estadoss;
	}
	
}
