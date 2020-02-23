package pe.edu.ceid.simi.management.infraestructure.matricula.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;

@Component
public class MatriculaRowMapper implements RowMapper {
	
	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<MatriculaDTO> mapRowMatricula(List<Map<String, Object>> rows){
		List<MatriculaDTO> cursos = new ArrayList<MatriculaDTO>();
		for(Map<String, Object> row: rows) {
			int idMatricula = Integer.parseInt(row.get("ID_MATRICULA").toString());
			int codEstudiante = Integer.parseInt(row.get("FK_COD_ESTUDIANTE_CI").toString());
			String nombreEstudiante =row.get("NOMBRE_EST").toString();
			String apellidoPatEstudiante =row.get("APELLIDO_PAT_EST").toString();
			String apellidoMatEstudiante =row.get("APELLIDO_MAT_EST").toString();
			String emailEstudiante = row.get("EMAIL_EST").toString();
			int idProgCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			String nombreDocente =row.get("NOMBRE_DOC").toString();
			String apellidoPatDocente =row.get("APELLIDO_PAT_DOC").toString();
			String apellidoMatDocente =row.get("APELLIDO_MAT_DOC").toString();
			String emailDocente = row.get("EMAIL_DOC").toString();
			String nomIdioma =row.get("NOM_IDIOMA").toString();
			String nomNivel =row.get("NOM_NIVEL").toString();
			String nomPeriodo =row.get("NOM_PERIODO").toString();
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			String nomAula =row.get("NOM_AULA").toString();
			String nomSede =row.get("NOM_SEDE").toString();
			String nomGrupoHorario =row.get("NOM_GRUPOHORARIO").toString();
			String nomEstadoProgCurso =row.get("NOM_ESTADO").toString();
			int numVoucher = Integer.parseInt(row.get("NUM_VOUCHER").toString());
			int idEstadoMatricula = Integer.parseInt(row.get("ID_ESTADO_MATRICULA").toString());
			String nomEstadoMatricula =row.get("NOM_ESTADO_MATRICULA").toString();

			MatriculaDTO m = new MatriculaDTO(idMatricula, codEstudiante, nombreEstudiante, apellidoPatEstudiante,
					emailEstudiante, apellidoMatEstudiante, idProgCurso, nombreDocente, apellidoPatDocente,
					apellidoMatDocente, emailDocente, nomIdioma, nomNivel, nomPeriodo, ciclo, nomAula, nomSede,
					nomGrupoHorario, nomEstadoProgCurso, numVoucher, idEstadoMatricula, nomEstadoMatricula);
			
			cursos.add(m);
		}
		return cursos;
	}
	
}
