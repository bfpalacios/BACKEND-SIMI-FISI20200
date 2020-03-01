package pe.edu.ceid.simi.management.infraestructure.progcurso.jdbc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.stereotype.Component;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;
import pe.edu.ceid.simi.management.infraestructure.Tratamiento;

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
			Integer idAula = Tratamiento.tratarEntero("FK_ID_AULA", row);
			String nomAula = Tratamiento.tratarString("NOM_AULA", row);
			String nomSede = Tratamiento.tratarString("NOM_SEDE", row);
			
			int idProgCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			int idProgDocCur = Integer.parseInt(row.get("FK_ID_PROG_DOC_CUR").toString());
			String nombre = Tratamiento.tratarString("NOMBRE", row);
			String apellidoPat = Tratamiento.tratarString("APELLIDO_PAT", row);
			String apellidoMat = Tratamiento.tratarString("APELLIDO_MAT", row);
			String nomIdioma = Tratamiento.tratarString("NOM_IDIOMA", row);
			String nomNivel = Tratamiento.tratarString("NOM_NIVEL", row);
			String nomPeriodo = Tratamiento.tratarString("NOM_PERIODO", row);
			int ciclo = Tratamiento.tratarEntero("CiCLO", row);
			int idGrupoHorario = Integer.parseInt(row.get("FK_ID_HORARIO_GRUPOHORARIO").toString());
			String nomGrupoHorario = row.get("NOM_GRUPOHORARIO").toString();
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaSalida = row.get("HORA_SALIDA").toString();
			int idEstadoProgCurso = Integer.parseInt(row.get("FK_ID_ESTADO_PROGCURSO").toString());
			String nomEstado = Tratamiento.tratarString("NOM_ESTADO", row);
			
			ProgCursoDTO p = new ProgCursoDTO(idProgCurso, idProgDocCur, nombre, apellidoPat, apellidoMat,
					nomIdioma, nomNivel, nomPeriodo, ciclo, idAula, nomAula, nomSede, idGrupoHorario, nomGrupoHorario,
					horaInicio, horaSalida, idEstadoProgCurso, nomEstado);
			progs.add(p);
		}
		
		return progs;
	}
	
	public List<ProgCursoDTO> mapRowProgCursogetOne(List<Map<String, Object>> rows){
		List<ProgCursoDTO> progs = new ArrayList<ProgCursoDTO>();
		
		for(Map<String, Object> row: rows) {
			Integer idAula = Tratamiento.tratarEntero("FK_ID_AULA", row);
			String nomAula = Tratamiento.tratarString("NOM_AULA", row);
			String nomSede = Tratamiento.tratarString("NOM_SEDE", row);
			int idSede = Tratamiento.tratarEntero("FK_ID_SEDE", row);
			int idProgCurso = Integer.parseInt(row.get("ID_PROGCURSO").toString());
			int idProgDocCur = Integer.parseInt(row.get("FK_ID_PROG_DOC_CUR").toString());
			String nombre = Tratamiento.tratarString("NOMBRE", row);
			String apellidoPat = Tratamiento.tratarString("APELLIDO_PAT", row);
			String apellidoMat = Tratamiento.tratarString("APELLIDO_MAT", row);
			String nomIdioma = Tratamiento.tratarString("NOM_IDIOMA", row);
			String nomNivel = Tratamiento.tratarString("NOM_NIVEL", row);
			String nomPeriodo = Tratamiento.tratarString("NOM_PERIODO", row);
			int idPeriodo = Tratamiento.tratarEntero("ID_PERIODO", row);
			int idCurso = Tratamiento.tratarEntero("ID_CURSO", row);
			String codDocenteCI = Tratamiento.tratarString("COD_DOCENTE_CI", row);
			int ciclo = Tratamiento.tratarEntero("CICLO", row); // estaba CiCLO
			int idGrupoHorario = Integer.parseInt(row.get("FK_ID_HORARIO_GRUPOHORARIO").toString());
			String nomGrupoHorario = row.get("NOM_GRUPOHORARIO").toString();
			String horaInicio = row.get("HORA_INICIO").toString();
			String horaSalida = row.get("HORA_SALIDA").toString();
			int idEstadoProgCurso = Integer.parseInt(row.get("FK_ID_ESTADO_PROGCURSO").toString());
			String nomEstado = Tratamiento.tratarString("NOM_ESTADO", row);
			
			ProgCursoDTO p = new ProgCursoDTO(idProgCurso, idProgDocCur, nombre, apellidoPat, apellidoMat,
					nomIdioma, nomNivel, nomPeriodo, ciclo, idAula, nomAula, nomSede, idGrupoHorario, nomGrupoHorario,
					horaInicio, horaSalida, idEstadoProgCurso, nomEstado,idSede,idPeriodo, idCurso,codDocenteCI  );
			
//			int idProgCurso, int idProgDocCur, String nombre, String apellidoPat, String apellidoMat,
//			String nomIdioma, String nomNivel, String nomPeriodo, int ciclo, int idAula, String nomAula, String nomSede,
//			int idHorarioGrupoHorario, String nomGrupoHorario, String horaInicio, String horaSalida,
//			int idEstadoProgCurso, String nomEstado, int idSede, int idPeriodo, int idCurso, String codDocenteCI) {
			progs.add(p);
		}
		
		return progs;
	}
	
}
