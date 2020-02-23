package pe.edu.ceid.simi.operative.infraestructure.grupo.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.grupo.model.Grupo;

@Component
public class GrupoRowMapper implements RowMapper {
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Grupo> mapRowGrupo(List<Map<String, Object>> rows) {
		List<Grupo> grupos = new ArrayList<Grupo>();
		for (Map<String, Object> row : rows) {
			int idGrupo = Integer.parseInt(row.get("ID_GRUPOHORARIO").toString());
			String nomGrupo = row.get("NOM_GRUPOHORARIO").toString();

			Grupo i = new Grupo(idGrupo, nomGrupo);
			grupos.add(i);
		}
		return grupos;
	}

}
