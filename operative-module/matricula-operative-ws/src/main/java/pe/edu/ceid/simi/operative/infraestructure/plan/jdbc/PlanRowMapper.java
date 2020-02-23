package pe.edu.ceid.simi.operative.infraestructure.plan.jdbc;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;
import pe.edu.ceid.simi.operative.domain.plan.model.PlanDTO;

@Component
public class PlanRowMapper implements RowMapper{

	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public PlanDTO mapRowPlan(LinkedCaseInsensitiveMap row){
		
			int idCurso = Integer.parseInt(row.get("ID_CURSO").toString());
			int idIdioma = Integer.parseInt(row.get("FK_ID_IDIOMA").toString());
			int idNivel = Integer.parseInt(row.get("FK_ID_NIVEL").toString());
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			String nomIdioma =row.get("NOM_IDIOMA").toString();
			String nomNivel = row.get("NOM_NIVEL").toString();
			int countCiclo = Integer.parseInt(row.get("COUNTCICLO").toString());
			String libro = row.get("LIBRO") == null ?"Material de uso interno":row.get("LIBRO").toString();
			
			PlanDTO i = new PlanDTO(idCurso, idIdioma, idNivel, ciclo, nomIdioma, nomNivel, countCiclo, libro);

		
		return i;
	}
}
