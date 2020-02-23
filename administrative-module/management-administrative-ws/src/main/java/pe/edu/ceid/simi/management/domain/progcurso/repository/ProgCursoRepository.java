package pe.edu.ceid.simi.management.domain.progcurso.repository;

import java.util.List;

import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCurso;
import pe.edu.ceid.simi.management.domain.progcurso.model.ProgCursoDTO;

public interface ProgCursoRepository {
	ProgCurso crearProgCurso(ProgCurso progCurso);
	ProgCurso editProgCurso(ProgCurso progCurso, int id);
	boolean deleteProgCurso(int id);
	List<ProgCursoDTO> getProgCursos();
	ProgCursoDTO getProgCursoById(int id);
}
