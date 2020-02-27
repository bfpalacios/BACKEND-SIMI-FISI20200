package pe.edu.ceid.simi.management.infraestructure.aula.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.aula.model.AulaDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class AulaRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<AulaDTO> mapRowAula(List<Map<String, Object>> rows){
		List<AulaDTO> aulas = new ArrayList<AulaDTO>();
		
		for(Map<String, Object> row: rows) {
			int idAula = Integer.parseInt(row.get("ID_AULA").toString());
			String nomAula =row.get("NOM_AULA").toString();
			String refAula = Tratamiento.tratarString("REF_AULA", row);
			int idSede = Integer.parseInt(row.get("FK_ID_SEDE").toString());
			String nomSede = row.get("NOM_SEDE").toString();
			
			AulaDTO a = new AulaDTO(idAula, nomAula, refAula, idSede, nomSede);
			aulas.add(a);
		}
		
		return aulas;
	}
}
