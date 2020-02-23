package pe.edu.ceid.simi.management.infraestructure.tipoestudiante.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.tipoestudiante.model.TipoEstudiante;

@Component
public class TipoEstudianteRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TipoEstudiante> mapRowTipoEstudiante(List<Map<String, Object>> rows){
		List<TipoEstudiante> tiposs = new ArrayList<TipoEstudiante>();
		for(Map<String, Object> row: rows) {
			int ctipoEstudiante = Integer.parseInt(row.get("ID_TIPO_ESTUDIANTE").toString());
			String nomTipoEstudiante =row.get("NOM_TIPO_ESTUDIANTE").toString();
			
			TipoEstudiante t = new TipoEstudiante(ctipoEstudiante, nomTipoEstudiante);
			tiposs.add(t);
		}
		return tiposs;
	}
	
}
