package pe.edu.ceid.simi.management.infraestructure.progdoccurso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.progdoccurso.model.ProgDocCursoDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

@Component
public class ProgDocCursoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<ProgDocCursoDTO> mapRowProgDocCurso(List<Map<String, Object>> rows){
		List<ProgDocCursoDTO> progs = new ArrayList<ProgDocCursoDTO>();
		for(Map<String, Object> row: rows) {
			int idProgDocCur = Integer.parseInt(row.get("ID_PROG_DOC_CUR").toString());
			String idDocente = Tratamiento.tratarString("FK_ID_DOCENTE", row);
			String nombre = Tratamiento.tratarString("NOMBRE", row);
			String apellidoPat = Tratamiento.tratarString("APELLIDO_PAT", row);
			String apellidoMat = Tratamiento.tratarString("APELLIDO_MAT", row);
			String email = Tratamiento.tratarString("EMAIL", row);
			int idCurso = Integer.parseInt(row.get("FK_ID_CURSO").toString());
			String nomIdioma = row.get("NOM_IDIOMA").toString();
			String nomNivel =row.get("NOM_NIVEL").toString();
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			int idPeriodo = Integer.parseInt(row.get("FK_ID_PERIODO").toString());
			String nomPeriodo = (row.get("NOM_PERIODO").toString());
			
			ProgDocCursoDTO p = new ProgDocCursoDTO(idProgDocCur, idDocente, nombre, apellidoPat, apellidoMat,
					email, idCurso, nomIdioma, nomNivel, ciclo, idPeriodo, nomPeriodo);
			
			progs.add(p);
		}
		return progs;
	}
	
}
