package pe.edu.ceid.simi.operative.infraestructure.idioma.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.idioma.model.IdiomaDTO;

@Component
public class IdiomaRowMapper implements RowMapper {

	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	// @SuppressWarnings("rawtypes")
	public List<IdiomaDTO> mapRowIdioma(List<Map<String, Object>> rows) {
		List<IdiomaDTO> idiomas = new ArrayList<IdiomaDTO>();
		for (Map<String, Object> row : rows) {
			int idIdioma = Integer.parseInt(row.get("ID_IDIOMA").toString());
			String nomIdioma = row.get("NOM_IDIOMA").toString();

			IdiomaDTO i = new IdiomaDTO(idIdioma, nomIdioma);
			idiomas.add(i);
		}
		return idiomas;
	}

}
