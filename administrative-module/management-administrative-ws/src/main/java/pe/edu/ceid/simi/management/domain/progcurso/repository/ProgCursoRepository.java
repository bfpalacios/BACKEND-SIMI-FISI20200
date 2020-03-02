package pe.edu.ceid.simi.management.domain.progcurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

public interface ProgCursoRepository {
	String crearProgCurso(ProgCurso progCurso);
	String editProgCurso(ProgCurso progCurso, int id);
	String deleteProgCurso(int id);
	List<ProgCursoDTO> getProgCursos();
	List<ProgCursoDTO> getProgCursosByCursoPeriodo(int idCurso, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(int idCurso, int idHorario, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByPeriodo(int idPeriodo);
	List<ProgCursoDTO> getProgCursosBySedePeriodo(int idSede, int idPeriodo);
	List<ProgCursoDTO> getProgCursosBySedePeriodoIdioma(int idCurso, int idHorario, int idPeriodo);
	Integer getIdProgCursoByCursoHorarioSedePeriodo(int idCurso, int idHorario, int idSede, int idPeriodo);
	ProgCursoDTO getProgCursoById(int id);
	String docenteOcupadoByDocenteHorarioPeriodo(int idProgDoc, int idHorario, int idPeriodo);
}
