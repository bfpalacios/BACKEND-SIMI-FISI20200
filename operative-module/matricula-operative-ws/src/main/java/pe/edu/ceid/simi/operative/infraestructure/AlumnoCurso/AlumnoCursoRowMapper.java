package pe.edu.ceid.simi.operative.infraestructure.AlumnoCurso;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;
import org.springframework.util.LinkedCaseInsensitiveMap;

import pe.edu.ceid.simi.operative.domain.alumnoCurso.model.AlumnoCurso;
@Component
public class AlumnoCursoRowMapper implements RowMapper{
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@SuppressWarnings("rawtypes")
	public AlumnoCurso mapRowAlumno(LinkedCaseInsensitiveMap row) {

		int idMatricula = Integer.parseInt(row.get("ID_MATRICULA").toString());
		int idProg = Integer.parseInt(row.get("FK_ID_PROGCURSO").toString());
		String codEstudiante = row.get("FK_COD_ESTUDIANTE_CI").toString();
		int idUsuario = Integer.parseInt(row.get("ID_USUARIO").toString());
		int idPersona = Integer.parseInt(row.get("ID_PERSONA").toString());
		String estudiante = row.get("ESTUDIANTE").toString();

		AlumnoCurso i = new AlumnoCurso(idMatricula, idProg, codEstudiante,idUsuario, idPersona,  estudiante );

		return i;
	}

}
