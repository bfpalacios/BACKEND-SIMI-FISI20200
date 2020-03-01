package pe.edu.ceid.simi.management.application.progcurso;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

public interface ProgCursoService {
	String crearProgCurso(ProgCurso progCurso);
	String editProgCurso(ProgCurso progCurso, int id);
	boolean deleteProgCurso(int id);
	List<ProgCursoDTO> getProgCursos();
	List<ProgCursoDTO> getProgCursosByCursoPeriodo(int idCurso, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByCursoHorarioPeriodo(int idCurso, int idHorario, int idPeriodo);
	List<ProgCursoDTO> getProgCursosByPeriodo(int idPeriodo);
	List<ProgCursoDTO> getProgCursosBySedePeriodo(int idSede, int idPeriodo);
	ProgCursoDTO getProgCursoById(int id);
}
