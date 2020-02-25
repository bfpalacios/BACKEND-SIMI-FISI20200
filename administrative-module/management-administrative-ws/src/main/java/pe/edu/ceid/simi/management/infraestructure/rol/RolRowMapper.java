package pe.edu.ceid.simi.management.infraestructure.rol;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.rol.model.Rol;

@Component
public class RolRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Rol> mapRowRol(List<Map<String, Object>> rows){
		List<Rol> roless = new ArrayList<Rol>();
		
		for(Map<String, Object> row: rows) {
			int idRol = Integer.parseInt(row.get("ID_ROL").toString());
			String nomRol = row.get("NOM_ROL").toString();
			String decRol = row.get("DESC_ROL").toString();

			Rol s = new Rol(idRol, nomRol, decRol);
			roless.add(s);
		}
		
		return roless;
	}
}
