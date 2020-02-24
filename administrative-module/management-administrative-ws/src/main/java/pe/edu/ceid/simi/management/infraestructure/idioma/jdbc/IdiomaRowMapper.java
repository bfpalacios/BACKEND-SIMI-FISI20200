package pe.edu.ceid.simi.management.infraestructure.idioma.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class IdiomaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Idioma> mapRowIdioma(List<Map<String, Object>> rows){
		List<Idioma> idiomass = new ArrayList<Idioma>();
		
		for(Map<String, Object> row: rows) {
			int idIdioma = Integer.parseInt(row.get("ID_IDIOMA").toString());
			String nomIdioma = Tratamiento.tratarString("NOM_IDIOMA", row);
			String descIdioma = Tratamiento.tratarString("DESC_IDIOMA", row);
			
			Idioma i = new Idioma(idIdioma, nomIdioma, descIdioma);
			idiomass.add(i);
		}
		
		return idiomass;
	}
	
}
