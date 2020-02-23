package pe.edu.ceid.simi.operative.infraestructure.nivel.jdbc;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.nivel.model.NivelDTO;

@Component
public class NivelRowMapper implements RowMapper{
	
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public NivelDTO mapRowNivel(LinkedCaseInsensitiveMap row) {

		int idNivel = Integer.parseInt(row.get("FK_ID_NIVEL").toString());
		String nomNivel = row.get("NOM_NIVEL").toString();

		NivelDTO i = new NivelDTO(idNivel, nomNivel);

		return i;
	}
}
