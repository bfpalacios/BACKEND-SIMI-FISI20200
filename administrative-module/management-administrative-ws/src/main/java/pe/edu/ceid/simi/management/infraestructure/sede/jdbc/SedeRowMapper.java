package pe.edu.ceid.simi.management.infraestructure.sede.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.sede.model.Sede;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class SedeRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Sede> mapRowSede(List<Map<String, Object>> rows){
		List<Sede> sedess = new ArrayList<Sede>();
		
		for(Map<String, Object> row: rows) {
			int idSede = Integer.parseInt(row.get("ID_SEDE").toString());
			String nomSede = Tratamiento.tratarString("NOM_SEDE", row);
			String dirSede = Tratamiento.tratarString("DIR_SEDE", row);
			String descSede = Tratamiento.tratarString("DESC_SEDE", row);
			
			Sede s = new Sede(idSede, nomSede, descSede, dirSede);
			sedess.add(s);
		}
		
		return sedess;
	}
	
}
