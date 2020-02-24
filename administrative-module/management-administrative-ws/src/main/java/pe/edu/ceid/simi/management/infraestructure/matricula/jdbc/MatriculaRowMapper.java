package pe.edu.ceid.simi.management.infraestructure.matricula.jdbc;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.matricula.model.MatriculaDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

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
			String codEstudiante = row.get("FK_COD_ESTUDIANTE_CI").toString();
			String nombreEstudiante = row.get("NOMBRE_EST").toString();
			String apellidoPatEstudiante = row.get("APELLIDO_PAT_EST").toString();
			String apellidoMatEstudiante = row.get("APELLIDO_MAT_EST").toString();
			String emailEstudiante = row.get("EMAIL_EST").toString();
			int idProgCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			String nombreDocente = Tratamiento.tratarString("NOMBRE_DOC", row);
			String apellidoPatDocente = Tratamiento.tratarString("APELLIDO_PAT_DOC", row);
			String apellidoMatDocente = Tratamiento.tratarString("APELLIDO_MAT_DOC", row);
			String emailDocente = Tratamiento.tratarString("EMAIL_DOC", row);
			String nomIdioma = Tratamiento.tratarString("NOM_IDIOMA", row);
			String nomNivel = Tratamiento.tratarString("NOM_NIVEL", row);
			String nomPeriodo = Tratamiento.tratarString("NOM_PERIODO", row);
			int ciclo = Tratamiento.tratarEntero("CiCLO", row);
			String nomAula = Tratamiento.tratarString("NOM_AULA", row);
			String nomSede = Tratamiento.tratarString("NOM_SEDE", row);
			String nomGrupoHorario = Tratamiento.tratarString("NOM_GRUPOHORARIO", row);
			String nomEstadoProgCurso = Tratamiento.tratarString("NOM_ESTADO", row);
			int numVoucher = Integer.parseInt(row.get("SEC").toString());
			int idEstadoMatricula = Tratamiento.tratarEntero("ID_ESTADO_MATRICULA", row);
			String nomEstadoMatricula = Tratamiento.tratarString("NOM_ESTADO_MATRICULA", row);
			Date fechaMatricula = Tratamiento.tratarDate("FECHA_MATRICULA", row);

			MatriculaDTO m = new MatriculaDTO(idMatricula, codEstudiante, nombreEstudiante, apellidoPatEstudiante,
					emailEstudiante, apellidoMatEstudiante, idProgCurso, nombreDocente, apellidoPatDocente,
					apellidoMatDocente, emailDocente, nomIdioma, nomNivel, nomPeriodo, ciclo, nomAula, nomSede,
					nomGrupoHorario, nomEstadoProgCurso, numVoucher, idEstadoMatricula, nomEstadoMatricula, fechaMatricula);
			
			cursos.add(m);
		}
		
		return cursos;
	}

}
