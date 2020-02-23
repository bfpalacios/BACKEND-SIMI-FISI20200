package pe.edu.ceid.simi.management.infraestructure.idioma.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.idioma.model.Idioma;

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
			String descIdioma = "";
			if(row.get("DESC_IDIOMA") != null) descIdioma = row.get("DESC_IDIOMA").toString();
			
			int idIdioma = Integer.parseInt(row.get("ID_IDIOMA").toString());
			String nomIdioma = row.get("NOM_IDIOMA").toString();
		
			
			Idioma i = new Idioma(idIdioma, nomIdioma, descIdioma);
			idiomass.add(i);
		}
		return idiomass;
	}
	
}
