package pe.edu.ceid.simi.management.infraestructure.progcurso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

@Component
public class ProgCursoRowMapper implements RowMapper {

	@Override
	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<ProgCursoDTO> mapRowProgCurso(List<Map<String, Object>> rows){
		List<ProgCursoDTO> progs = new ArrayList<ProgCursoDTO>();
		
		for(Map<String, Object> row: rows) {
			Integer idAula = -1;
			String nomAula = "";
			String nomSede = "";
			
			int idProgCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			int idProgDocCur = Integer.parseInt(row.get("FK_ID_PROG_DOC_CUR").toString());
			String nombre =row.get("NOMBRE").toString();
			String apellidoPat =row.get("APELLIDO_PAT").toString();
			String apellidoMat =row.get("APELLIDO_MAT").toString();
			String nomIdioma =row.get("NOM_IDIOMA").toString();
			String nomNivel =row.get("NOM_NIVEL").toString();
			String nomPeriodo =row.get("NOM_PERIODO").toString();
			int ciclo = Integer.parseInt(row.get("CICLO").toString());
			int idGrupoHorario = Integer.parseInt(row.get("FK_ID_HORARIO_GRUPOHORARIO").toString());
			String nomGrupoHorario = row.get("NOM_GRUPOHORARIO").toString();
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaSalida = row.get("HORA_SALIDA").toString();
			int idEstadoProgCurso = Integer.parseInt(row.get("FK_ID_ESTADO_PROGCURSO").toString());
			String nomEstado =row.get("NOM_ESTADO").toString();
			
			try {
				if (!row.get("FK_ID_AULA").equals(null)) {
					idAula = Integer.parseInt(row.get("FK_ID_AULA").toString());
					nomAula = row.get("NOM_AULA").toString();
					nomSede = row.get("NOM_SEDE").toString();
				}
			} catch (NullPointerException e) {
				
			} finally {
				ProgCursoDTO p = new ProgCursoDTO(idProgCurso, idProgDocCur, nombre, apellidoPat, apellidoMat,
						nomIdioma, nomNivel, nomPeriodo, ciclo, idAula, nomAula, nomSede, idGrupoHorario, nomGrupoHorario,
						horaInicio, horaSalida, idEstadoProgCurso, nomEstado);
				progs.add(p);
			}
		}
		
		return progs;
	}
	
}
