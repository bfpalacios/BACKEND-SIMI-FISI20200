package pe.edu.ceid.simi.management.domain.progcurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

public interface ProgCursoRepository {
	ProgCurso crearProgCurso(ProgCurso progCurso);
	ProgCurso editProgCurso(ProgCurso progCurso, int id);
	boolean deleteProgCurso(int id);
	List<ProgCursoDTO> getProgCursos();
	List<ProgCursoDTO> getProgCursosByCursoPeriodo(int idCurso, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(int idCurso, int idHorario, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByPeriodo(int idPeriodo);
	ProgCursoDTO getProgCursoById(int id);
}
