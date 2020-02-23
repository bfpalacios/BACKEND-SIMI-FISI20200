package pe.edu.ceid.simi.management.infraestructure.nivel.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.nivel.model.Nivel;

@Component
public class NivelRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Nivel> mapRowNivel(List<Map<String, Object>> rows){
		List<Nivel> niveles = new ArrayList<Nivel>();
		
		for(Map<String, Object> row: rows) {
			int idNivel = Integer.parseInt(row.get("ID_NIVEL").toString());
			String nomNivel = row.get("NOM_NIVEL").toString();
			Nivel i = new Nivel(idNivel, nomNivel);
			niveles.add(i);
		}
		
		return niveles;
	}
	
}
