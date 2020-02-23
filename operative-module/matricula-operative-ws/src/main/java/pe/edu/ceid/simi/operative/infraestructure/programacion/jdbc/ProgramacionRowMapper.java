package pe.edu.ceid.simi.operative.infraestructure.programacion.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.programacion.model.ProgramacionDTO;

@Component
public class ProgramacionRowMapper implements RowMapper{
	
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public ProgramacionDTO mapRowProgramacion(LinkedCaseInsensitiveMap row){
			int idProgramacionCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			int idDocProg =Integer.parseInt(row.get("FK_ID_PROG_DOC_CUR").toString());
			int idAula = row.get("FK_ID_AULA") == null ? 0:Integer.parseInt(row.get("FK_ID_AULA").toString());
			int idGrupohorario = Integer.parseInt(row.get("FK_ID_HORARIO_GRUPOHORARIO").toString());
			int estadoProg = Integer.parseInt(row.get("FK_ID_ESTADO_PROGCURSO").toString());
			String nomIdioma= row.get("NOM_IDIOMA").toString();
			String nomNivel= row.get("NOM_NIVEL").toString();
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			String docente= row.get("DOCENTE").toString();
			String nomGrupoH = row.get("NOM_GRUPOHORARIO").toString();
			String hora = row.get("HORA").toString();
			int matriculados = Integer.parseInt(row.get("MATRICULADOS").toString());
			
			ProgramacionDTO i = new ProgramacionDTO(idProgramacionCurso, idDocProg, idAula, idGrupohorario, estadoProg, nomIdioma, nomNivel,ciclo, docente, nomGrupoH, hora, matriculados);
			
		
		return i;
	}

}
