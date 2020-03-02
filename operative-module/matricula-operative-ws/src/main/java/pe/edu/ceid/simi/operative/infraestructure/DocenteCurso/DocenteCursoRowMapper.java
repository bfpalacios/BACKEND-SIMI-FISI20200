package pe.edu.ceid.simi.operative.infraestructure.DocenteCurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.DocenteCurso.model.DocenteCurso;

@Component
public class DocenteCursoRowMapper implements RowMapper{
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public DocenteCurso mapRowDocente(LinkedCaseInsensitiveMap row) {

		int idProg = Integer.parseInt(row.get("ID_PROGCURSO").toString());
		int idProgCurso = Integer.parseInt(row.get("FK_ID_PROG_DOC_CUR").toString());
		int idUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
		int idAula = row.get("FK_ID_AULA") == null ? 0:Integer.parseInt(row.get("FK_ID_AULA").toString());
		int idHorarios = Integer.parseInt(row.get("FK_ID_HORARIO_GRUPOHORARIO").toString());
		int idEstado = Integer.parseInt(row.get("FK_ID_ESTADO_PROGCURSO").toString());
		String nomIdioma = row.get("NOM_IDIOMA").toString();
		String nomNivel = row.get("NOM_NIVEL").toString();
		int ciclo = Integer.parseInt(row.get("CICLO").toString());
		String hora = row.get("HORA").toString();
		int matriculados = Integer.parseInt(row.get("MATRICULADOS").toString());
 
		DocenteCurso i = new DocenteCurso(idProg, idProgCurso, idUsuario, idAula,idHorarios, idEstado,
				nomIdioma, nomNivel, ciclo, hora, matriculados);

		return i;
	}
}

