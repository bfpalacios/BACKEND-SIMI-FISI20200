package pe.edu.ceid.simi.management.infraestructure.diasclase.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.diasclase.model.DiasClase;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;


@Component
public class DiasClaseRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DiasClase> mapRowDiasClase(List<Map<String, Object>> rows){
		List<DiasClase> diass = new ArrayList<DiasClase>();
		for(Map<String, Object> row: rows) {
			int cdia = Integer.parseInt(row.get("ID_DIA").toString());
			String descDia = row.get("NOM_DIA").toString();
						
			DiasClase d = new DiasClase(cdia,descDia);
			diass.add(d);
		}
		return diass;
	}
	
}
